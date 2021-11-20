package AssignTwo;

/* Student name : jiin jeon
 * Assignment 02, CST 8116_363 */

import java.util.Scanner;
import java.util.*;

/* User class : receive data from users
 *            : having three data categories > interger, double, string
 *            : double is for volume
 *            : string is for size
 *            : catch exceptions with using try-catch structures */

public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	/* new data from users
	 * should be 'private', because preventing information from being demaged */
	
	
	
	
	/* try-catch : catch exceptions of data format other than integers */
	
	public int inputInteger() {
		
		//ToDo: See lecture notes and stop this from crashing the program
		//      if the user enters text, you can copy and paste code from
		//      the lecture notes, but cite the lecture handout.
		
		int value=0;
		
		try {
			
			value=keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Data is "+value);
			
			
		}
		
		catch (InputMismatchException ex) {
			
			System.out.println("Data you have entered is wrong. Only Integer numbers are valid.");
		
		}
		
		
		return value;
	}
	
	/* method for receiving integers with using a parameter of String value */
	
	public int inputInteger(String message) {
		// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}
	
	/* try-catch : catch exceptions of data format other than double */
	public double inputDouble() {
		
		//ToDo: See lecture notes and stop this from crashing the program
		//      if the user enters text, you can copy and paste code from
		//      the lecture notes, but cite the lecture handout.
		
		double value=0;
		
		try {
			
			value=keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("volume is "+value+"ml");
			
			if (value < 0 || value > 2000000000.0) {
				
				System.out.println("wrong value");
				return 0;
				
			} else { 
				
				return value;
				
			}
			
			
		}
		
		catch (InputMismatchException ex) {
			
			System.out.println("Data you have entered is wrong. Only decimals are valid.");
		
		}
		
		
		return value;
	}
	
	
	/* method for receiving double with using a parameter of String value */
	
	public double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}
	
	/* receiving input data of String , size */
	
	public String inputString() {
		
		String value = keyboard.nextLine();
		System.out.println("Entered size : "+value);
		
		return value;
		
	}
	
	/* method for receiving String with using a parameter of String value */
	
	public String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
}
