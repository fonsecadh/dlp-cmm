package symboltable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ast.definitions.Definition;

public class SymbolTable {

	// Constants
	public static final int GLOBAL_SCOPE = 0;

	// Attributes
	private int scope = GLOBAL_SCOPE;
	private List<Map<String, Definition>> table;

	// Constructor
	public SymbolTable() {
		this.table = new ArrayList<Map<String, Definition>>();
		this.table.add(new HashMap<String, Definition>());
	}

	// Methods

	/**
	 * Sets a new scope in the Symbol Table.
	 */
	public void set() {
		this.scope++;
		this.table.add(new HashMap<String, Definition>());
	}

	/**
	 * Returns to the previous scope from the Symbol Table.
	 */
	public void reset() {
		this.table.remove(scope);
		this.scope--;
	}

	/**
	 * Inserts a definition in the Symbol Table.
	 * 
	 * If the definition already exists in the table, the method returns false. It
	 * returns true if the insertion was successfully inserted.
	 * 
	 * @param definition 
	 * 				The definition to insert.
	 * @return 
	 * 				True if the insertion was successfully inserted. False otherwise
	 */
	public boolean insert(Definition definition) {
		if (findInCurrentScope(definition.getName()) != null) {
			return false;
		} else {
			definition.setScope(scope);
			this.table.get(scope).put(definition.getName(), definition);
			return true;
		}
	}

	/**
	 * Searches for the given definition in the whole Symbol Table.
	 * 
	 * @param id 
	 * 				The identifier of the definition.
	 * @return 
	 * 				The definition. Null if it is not found.
	 */
	public Definition find(String id) {
		Definition def;		
		for (int i = table.size() - 1; i >= 0; i--) {
			Map<String, Definition> map = table.get(i);
			if (map.containsKey(id)) {
				def = map.get(id);
				return def;
			}
		}
		return null;
	}

	/**
	 * Searches for the given definition in the current scope of the Symbol Table.
	 * 
	 * @param id 
	 * 				The identifier of the definition.
	 * @return 
	 * 				The definition. Null if it is not found.
	 */
	public Definition findInCurrentScope(String id) {
		Definition def;
		Map<String, Definition> map = table.get(scope);
		if (map.containsKey(id)) {
			def = map.get(id);
			return def;
		}
		return null;
	}
}