package edu.millersville.uml_editor.model;
import java.util.Objects;

/**
 * Class that creates a formal outline with a name and a type 
 * for methods, fields, and parameters.
 * 
 * @author TeamSyrup
 *
 */
public class Formal {
	/**
	 * Each method, field, and parameter has a name and a type.
	 */
	private String name;
	private String type;
	
	/**
	 * Initializes a method, field, or parameter with a name and a type.
	 * @param name
	 * 		The name of the object.
	 * @param type
	 * 		The type of the object.
	 */
	public Formal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	/**
	 * Getter method that returns the name. 	
	 * @return
	 * 		Name of the object.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter method that returns the type.
	 * @return
	 * 		Type of the object.
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Mutator method that returns the type.
	 * @return
	 * 		Type of the object.
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * Mutator method that sets this objects type to a different type.
	 * @param newType
	 * 		The new type of the object.
	 */
	public void setType(String newType) {
		this.type = newType;
	}
	
	/**
	 * A method to check if there is an instance of another object with the same name 
	 * since objects cannot have the same names.
	 * @param name
	 * 		The name of the object.
	 */
	public boolean equals(Object name) {
		if(name instanceof Formal) {
			Formal test = (Formal) name;
			return Objects.equals(this.name, test.name);
		}
		return false;
	}
}
