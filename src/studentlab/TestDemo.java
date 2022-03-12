
package studentlab;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * File Name: TestDemo.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 03<br>
 * Date: Feb 7th, 2022<br>
 * <p>
 */

/**
 * Purpose:<br>
 * This is the driver class for this program. This means that it just runs the
 * application with a method main.
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
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 Cars and 4
	 * Bicycles to show-case the constructors. <br>
	 * Anonymous objects are used and each one is only retained long enough to call
	 * method create report on each.<br>
	 * No variable names were used, just new Constructor().methodCall(). <br>
	 * 
	 * @param args Command line arguments are not used by this program.
	 * 
	 *             <p>
	 *             Four constructors are called for both Class {@link Car} and Class
	 *             {@link Bicycle}.
	 */

//	/**
//	 * YOUR TASK: COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo. Hint: See
//	 * the SampleOutput file provided for the print statements required.
//	 */
	public static void main(String[] args) {

		/**
		 * YOUR CODE STARTS HERE
		 */

		System.out.println("\nJust creating 4 cars\n");

		System.out.println("car1");
		Car c1 = new Car();
		System.out.println(c1.createReport());
		System.out.println("");

		System.out.println("car2");
		Car c2 = new Car("car2");
		System.out.println(c2.createReport());
		System.out.println("");

		System.out.println("car3");
		Car c3 = new Car("car3", false);
		System.out.println(c3.createReport());
		System.out.println("");

		System.out.println("car4");
		Car c4 = new Car("car4", true, 9.5);
		System.out.println(c4.createReport());
		System.out.println("");

		System.out.println("Just creating 4 Bicycles\n");

		System.out.println("bicycle1");
		Bicycle b1 = new Bicycle();
		System.out.println(b1.createReport());
		System.out.println("");

		System.out.println("bicycle2");
		Bicycle b2 = new Bicycle("bicycle2");
		System.out.println(b2.createReport());
		System.out.println("");

		System.out.println("bicycle3");
		Bicycle b3 = new Bicycle("bicycle3", true);
		System.out.println(b3.createReport());
		System.out.println("");

		System.out.println("bicycle4");
		Bicycle b4 = new Bicycle("bicycle4", true, 7);
		System.out.println(b4.createReport());
		System.out.println("");

		/**
		 * YOUR CODE ENDS HERE
		 */
	}

}
