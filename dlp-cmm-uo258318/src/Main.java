import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.Program;
import ast.errorhandler.ErrorHandler;
import ast.types.Type;
import codegen.AddressCGVisitor;
import codegen.ExecuteCGVisitor;
import codegen.OffsetVisitor;
import codegen.ValueCGVisitor;
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
			ErrorHandler.getInstance().clearErrors();
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
		
		// OffsetVisitor
		Visitor<Boolean, Void> offsetVisitor = new OffsetVisitor();
		ast.accept(offsetVisitor, false);
		System.out.println("Offset Visitor");

		if (ErrorHandler.getInstance().anyErrors()) {
			ErrorHandler.getInstance().showErrors(System.err);
			ErrorHandler.getInstance().clearErrors();
		} else {
			System.out.println("No offset errors.");
		}
		
		// Address, Value and Execute Visitors
		ExecuteCGVisitor executeCGVisitor = new ExecuteCGVisitor(args[0]);
		AddressCGVisitor addressCGVisitor = new AddressCGVisitor();
		ValueCGVisitor valueCGVisitor = new ValueCGVisitor();		
		valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
		executeCGVisitor.setAddressCGVisitor(addressCGVisitor);
		executeCGVisitor.setValueCGVisitor(valueCGVisitor);		
		ast.accept(executeCGVisitor, null);
		
		System.out.println("Address, Value and Execute Visitors");

		if (ErrorHandler.getInstance().anyErrors()) {
			ErrorHandler.getInstance().showErrors(System.err);
			ErrorHandler.getInstance().clearErrors();
		} else {
			System.out.println("Code was successfully generated!");
			BufferedWriter output = new BufferedWriter(new FileWriter(new File("output.mp")));
			output.write(ast.getCode());
			output.close();
		}		

		// The AST is shown
		IntrospectorModel model = new IntrospectorModel("Program", ast);
		new IntrospectorTree("Introspector", model);

	}

}
