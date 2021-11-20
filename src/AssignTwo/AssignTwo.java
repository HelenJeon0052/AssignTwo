package AssignTwo;

/* Student name : Jiin Jeon
 * Assignment 02, CST 8116_363
 */


import java.util.Scanner;

public class AssignTwo {
	
	public static void main(String[] args) {
		
		
		
		User u1 = new User(); // make new object of User class
		
		Scanner keyboard1=new Scanner(System.in); // Scanner object in order to receive input data for do-while structure condition
		
		
		do { 
			
			System.out.printf("%n"); // space between lines
			
			System.out.println("input the size | small, medium, large"); // message for the guidance of input date, size
		
			
			String string = u1.inputString(); // receive input data and give it to the 'inputString()'method in User class
			
			
			System.out.println("input the volume | decimal value (to fifth)"); // message for the guidance of input data, volume
			
			double d1 = u1.inputDouble();  // receive input data and give it to the 'inputDouble()'method in User class
			
			
			DrinkMachine m1 = new DrinkMachine(); // create 'DrinkMachine()' object
			
			m1.verifySize(d1,string); // give 'size', 'volume' data to 'verifySize()' method
			
			System.out.println(m1.drinkSizeMenu()); // print out drink size and menu as of user guide
			
			
			System.out.println("Continue? yes or no"); // question for the next step : continue or not
			
		
		} while (keyboard1.next().equalsIgnoreCase("yes")); // condition of the do-while break : if input data is "yes", it will continue
		

		System.out.println("-----End-----"); // do-while loop end
		
	}

}

