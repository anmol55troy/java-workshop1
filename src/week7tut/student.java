package week7tut;


/**
 * this is a Student class
 * @author Anmol Acharya
 * @version 3.2
 */

public class student {
	/** 
	 * Private variable name that stores the name of the student
	 */
	private String name;
	
	/**
	 * Getter method of Student class
	 * @param name
	 */
	public student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
