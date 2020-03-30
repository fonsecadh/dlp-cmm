import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.Program;
import ast.errorhandler.ErrorHandler;
import ast.types.Type;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import parser.CmmLexer;
import parser.CmmParser;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;
import visitor.Visitor;

public class Main {

	public static void main(String... args) throws Exception {
		if (args.length < 1) {
			System.err.println("Please, pass me the input file.");
			return;
		}

		// Create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		// Create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CmmParser parser = new CmmParser(tokens);
		Program ast = parser.program().ast;

		// Check Errors
		if (ErrorHandler.getInstance().anyErrors()) {
			ErrorHandler.getInstance().showErrors(System.err);
		}

		// Identification visitor
		Visitor<Void, Void> visitorIdentification = new IdentificationVisitor();
		ast.accept(visitorIdentification, null);
		System.out.println("Identification visitor");

		if (ErrorHandler.getInstance().anyErrors()) {
			ErrorHandler.getInstance().showErrors(System.err);
			ErrorHandler.getInstance().clearErrors();
		} else {
			System.out.println("No identification errors.");
		}

		// Type checking visitor
		Visitor<Type, Void> typeCheckingVisitor = new TypeCheckingVisitor();
		ast.accept(typeCheckingVisitor, null);
		System.out.println("Type Checking Visitor");

		if (ErrorHandler.getInstance().anyErrors()) {
			ErrorHandler.getInstance().showErrors(System.err);
			ErrorHandler.getInstance().clearErrors();
		} else {
			System.out.println("No type errors.");
		}

		// The AST is shown
		IntrospectorModel model = new IntrospectorModel("Program", ast);
		new IntrospectorTree("Introspector", model);

	}

}
