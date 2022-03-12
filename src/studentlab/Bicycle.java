
package studentlab;

/**
 * Overloaded constructor calls demo
 * Shows chaining overloaded constructors using this keyword.
 * This lab is completed and demoed by: PUT YOUR NAME HERE  
 */

/**
 * File Name: Bicycle.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 03<br>
 * Date: Feb 7th, 2022<br>
 * <p>
 */

/**
 * Purpose:<br>
 * Class Bicycle demonstrates constructor chaining using keyword "this". The
 * more complex constructors all call the simpler ones, thereby chaining the
 * calls 'DOWNWARDS' (from the constructor with the most parameters to the
 * default no-parameter constructor. Ensure that you implement it in this
 * order). This approach works, however the default constructor will assign data
 * that will likely be replaced as the constructors chain their calls. See class
 * Car for comparison.<br>
 * 
 * Bicycle() assigns default values to the fields.<br>
 * 
 * Bicycle(String) calls Bicycle() which assigns default values, then program
 * flow returns to Bicycle(String) which assigns a value to variety a second
 * time.<br>
 * 
 * Bicycle(String, boolean) calls Bicycle(String) which calls Bicycle() which
 * assigns default values, then program flow returns to Bicycle(String) which
 * assigns a value to variety a second time, then program flow returns to
 * Bicycle(String, boolean) which assigns a value to isElectric a second
 * time.<br>
 * 
 * Bicycle(String, boolean, double) calls Bicycle(String, boolean) which calls
 * Bicycle(String, boolean) which calls Bicycle(String) which calls Bicycle()
 * and Bicycle() assigns the default values to the fields, then program flow
 * returns to Bicycle(String) which assigns a value to variety a second time,
 * then program flow returns to Bicycle(String, boolean) which assigns a value
 * to isElectric a second time, then program flow returns to Bicycle(String,
 * boolean, double) which assigns a value a second time to weight.<br>
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in
 * them, for demonstration purposes only. DO NOT PUT input / output into
 * constructors in production code!!!<br>
 * 
 * <p>
 * Class List: {@link TestDemo}, {@link Bicycle}, {@link Car}
 * 
 * <p>
 * 
 * @author Ishtiaque Matin, ID# 041042199
 * @version Modified: Feb 7th, 2022
 * @since JDK 1.8
 * @see TestDemo
 * @see Bicycle
 * @see Car
 */
public class Bicycle {
	/**
	 * Type of Bicycle.
	 */
	private String variety;

	/**
	 * If this Bicycle is electric
	 */
	private boolean isElectric;
	/**
	 * The weight of the Bicycle in grams.
	 */
	private double weight;

	/**
	 * The default constructor sets variety to "bicycle", isElectric to false, and
	 * weight to zero.
	 */
	public Bicycle() {
		// no this() here, omitted. Check your slides for chaining rules.
		variety = "bicycle";
		isElectric = false;
		weight = 0;
		System.out.println("Bicycle() was called");
	}

	/**
	 * TO DO: YOUR TASK 1: IMPLEMENT THIS PORTION OF THE CODE.
	 */

	/**
	 * This constructor sets the variety as passed, isElectric to false, and weight
	 * to zero.
	 * 
	 * @param variety The variety of this bicycle.
	 * 
	 *                <p>
	 *                This constructor is called first.
	 */

//	/** START YOUR CODE */

	public Bicycle(String variety) {
		this();
		this.variety = variety;
		System.out.println("Bicycle(String) was called");
	}

	/** END YOUR CODE */

	/**
	 * TO DO: YOUR TASK 2: IMPLEMENT THIS PORTION OF THE CODE.
	 */

	/**
	 * IMPLEMENT A CONSTRUCTOR THAT sets the variety as passed, isElectric as
	 * passed, and weight to zero.
	 * 
	 * @param variety    The variety of this bicycle.
	 * @param isElectric If this bicycle is electric use true, otherwise false.
	 * 
	 *                   *
	 *                   <p>
	 *                   This constructor is called second.
	 */

//	/** START YOUR CODE HERE */
	public Bicycle(String variety, boolean isElectric) {
		this(variety);
		this.variety = variety;
		this.isElectric = isElectric;
		System.out.println("Bicycle(String, boolean) was called");
	}

	/** YOUR CODE ENDS HERE */

	/**
	 * TO DO: YOUR TASK 3: IMPLEMENT THIS PORTION OF THE CODE.
	 */

	/**
	 * This constructor sets the variety as passed, isElectric as passed, and weight
	 * as passed.
	 * 
	 * @param variety    The variety of this bicycle.
	 * @param isElectric If this bicycle is electric use true, otherwise false.
	 * @param weight     The weight of this bicycle in grams.
	 * 
	 *                   *
	 *                   <p>
	 *                   This constructor is called third.
	 */

//	/** START YOUR CODE */
	public Bicycle(String variety, boolean isElectric, double weight) {
		this(variety, isElectric);
		this.variety = variety;
		this.isElectric = isElectric;
		this.weight = weight;
		System.out.println("Bicycle(String, boolean, double) was called");
	}

	/** CODE ENDS */

	/**
	 * Returns the variety for this Bicycle.
	 * 
	 * @return the variety for this Bicycle.
	 */

	public String getVariety() {
		return variety;
	}

	/**
	 * Sets the variety for this Bicycle.
	 * 
	 * @param variety The variety for this Bicycle.
	 */

	public void setVariety(String variety) {
		this.variety = variety;
	}

	/**
	 * Returns true if this Bicycle is electric, false if it is not.
	 * 
	 * @return true if this bicycle is electric, false if it is not.
	 */

	public boolean isElectric() {
		return isElectric;
	}

	/**
	 * TO DO: TASK 4: IMPLEMENT THIS PORTION OF CODE
	 */

	/**
	 * Sets the isElectric state for this bicycle, true means it is electric.
	 * 
	 * @param isElectric The isElectric state for this bicycle, true means it is
	 *                   electric.
	 */

//	/** CODE STARTS HERE */
	public void setIsElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	/** CODE ENDS HERE */

	/**
	 * Weight of this Bicycle in grams.
	 * 
	 * @return Weight of this Bicycle in grams.
	 */

	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight of this Bicycle, in grams.
	 * 
	 * @param weight The weight of this Bicycle, in grams.
	 */

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Prints out the value of variety, isHybrid, weight.
	 * 
	 * @return A String representation of this Bicycle, each field is separated by a
	 *         comma in the order of variety, isElectric, weight with (g) added to
	 *         the end of the weight field value.
	 */

	public String createReport() {
		return String.format("%s, %b, %.2f%s", variety, isElectric, weight, "(g)");
	}

}
