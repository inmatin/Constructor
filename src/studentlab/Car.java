package studentlab;

/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Ishtiaque Matin. 
 */

/**
 * 
 * File Name: Car.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 03<br>
 * Date: Feb 7th, 2022<br>
 * <p>
 */

/**
 * Purpose:<br>
 * This class is named Car Class. It shows constructor chaining using keyword
 * "this". In this code, the simpler constructors all call the more complex one,
 * thereby chaining the calls 'UPWARDS' (from the default constructor to the one
 * with the most arguments. Ensure that you implement it in this order). Compare
 * this Car class with the Bicycle class also provided for you. This approach is
 * often preferred for clarity and ease of code maintenance.<br>
 * 
 * Car() calls Car(String, boolean, double), program flow returns to Car() and
 * exits the constructor.<br>
 * 
 * Car(String) calls Car(String, boolean, double), program flow returns to
 * Car(String) and exits the constructor.<br>
 * 
 * Car(String, boolean) calls Car(String, boolean, double), program flow returns
 * to Car(String, boolean) and exits the constructor.<br>
 * 
 * Car(String, boolean, double) just assigns the values.<br>
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in
 * them, for demonstration purposes only. DO NOT PUT input / output into
 * constructors in real production code!!!<br>
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
public class Car {

	/**
	 * variety or type of Car.
	 */
	private String variety;

	/**
	 * If this Car is hybrid
	 */
	private boolean isHybrid;

	/**
	 * The weight of the Car in kilogram.
	 */
	private double weight;

	/**
	 * The default constructor sets variety to "car", isHybrid to false, and weight
	 * to zero.
	 * 
	 * <p>
	 * This constructor is called first.
	 */
	public Car() {
		this("car", false, 0);
		System.out.println("Car() was called");
	}

	/**
	 * TO DO: YOUR TASK 1: IMPLEMENT THIS PORTION OF THE CODE.
	 */

	/**
	 * This constructor sets the variety as passed, isHybrid to false, and weight to
	 * zero.
	 * 
	 * @param variety The variety of this car.
	 * 
	 *                <p>
	 *                This constructor is called second.
	 */

//	/** START CODE HERE */
	public Car(String variety) {
		this("car2", false, 0);
		System.out.println("Car(String) was called");

	}

	/** CODE ENDS HERE */

	/**
	 * TO DO: YOUR TASK 2: IMPLEMENT THIS PORTION OF THE CODE.
	 */

	/**
	 * This constructor sets the variety as passed, isHybrid as passed, and weight
	 * to zero.
	 * 
	 * @param variety  The variety of this car.
	 * @param isHybrid If this car is hybrid use true, otherwise false.
	 * 
	 *                 <p>
	 *                 This constructor is called third.
	 */

//	/** CODE STARTS HERE */
	public Car(String variety, boolean isHybrid) {
		this("car3", true, 0);
		System.out.println("Car(String, boolean) was called");
	}

	/** CODE ENDS HERE */

	/**
	 * TO DO: YOUR TASK 3: IMPLEMENT THIS PORTION OF THE CODE.
	 */

	/**
	 * This constructor sets the variety as passed, isHybrid as passed, and weight
	 * as passed.
	 * 
	 * @param variety  The variety of this car.
	 * @param isHybrid If this car is hybrid use true, otherwise false.
	 * @param weight   The weight of this car in kg.
	 * 
	 *                 <p>
	 *                 The default constructor.
	 */

//	/** CODE STARTS HERE */
	public Car(String variety, boolean isHybrid, double weight) {
		this.variety = variety;
		this.isHybrid = isHybrid;
		this.weight = weight;

		System.out.println("Car(String, boolean, double) was called");
	}

	/** CODE ENDS HERE */

	/**
	 * Returns the variety for this car.
	 * 
	 * @return the variety for this car.
	 */
	public String getVariety() {
		return variety;
	}

	/**
	 * Sets the variety for this car.
	 * 
	 * @param variety The variety for this car.
	 */
	public void setVariety(String variety) {
		this.variety = variety;
	}

	/**
	 * Returns true if this Car is hybrid, false if it is not.
	 * 
	 * @return true if this car is hybrid, false if it is not.
	 */
	public boolean isHybrid() {
		return isHybrid;
	}

	/**
	 * TO DO: YOUR TASK 4: IMPLEMENT THIS PORTION OF THE CODE.
	 */

	/**
	 * Sets the isHybrid state for this car, true means it's hybrid.
	 * 
	 * @param isHybrid Use true if it is hybrid, use false if not hybrid.
	 */

//	/** START CODE HERE */

	public void setIsHybrid(boolean isHybrid) {
		this.isHybrid = isHybrid;
	}

	/** CODE ENDS HERE */

	/**
	 * Weight of this Orange in kg.
	 * 
	 * @return Weight of this car in kg.
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight of this car, in kg.
	 * 
	 * @param weight The weight of this car in kg.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Prints out the value of variety, isHybrid, weight.
	 * 
	 * @return A String representation of this Car, each field is separated by a
	 *         comma in the order of variety, isHybrid, weight with (kg) added to
	 *         the end of the weight field value.
	 */
	public String createReport() {
		return String.format("%s, %b, %.2f%s", variety, isHybrid, weight, "(kg)");
	}
}
