package AssignTwo;

/* Student name: jiin jeon
 * Assignment 02, CST 8116_363
 * */

/* DrinkMachine Class : defining each names and sized of beverages
 *                   : receive input data via AssignTwo and User classes
 *                   : calculate input data and filter data for final output in main class
 * */

public class DrinkMachine {
	
	public static final String SMALL = "small";
	public static final String MEDIUM = "medium";
	public static final String LARGE = "large";
	
	public static final double SMALL_VOLUME = 250.0;
	public static final double MEDIUM_VOLUME = 400.0;
	public static final double LARGE_VOLUME = 500.0;
	
	
	// ToDo: declare an EPSILON constant with value of 10.0
	//       i.e. is measured volume within 10ml of expected volume?
	
	public static final double EPSILON= 10.0;
	
	
	
	private double volume; // (ml)
	private String size; // "small", "medium", "large"
	
	
	/* default constructor */
	
	public DrinkMachine() {
	
		//this(DrinkMachine.MEDIUM_VOLUME, DrinkMachine.MEDIUM);
		
	}
	
	/* Constructor for input data via Main and User classes */
	
	public DrinkMachine(double volume, String size) {
		
		
		this.volume=volume;
		this.size=size;
		
	}

	

	/* Getter of volume */
	
	public double getVolume() {
		
		return volume;
		
	}
	

	/* Setter of volume */
	
	public void setVolume(double volume) {
		
		this.volume = volume;
	}

	/* Getter of size */
	
	public String getSize() {
		
		return size;
		
	}

	/* Setter of size */
	
	public void setSize(String size) {
		
		this.size = size;
		
	}

	/* VerifySize Class : receive volume and size data
	 *                  : compare entered strings and required strings of size
	 *                  : if strings match, it will calculate difference
                        : with comparing the entered volume and required volume number
                        : conditional output for tolerance information based on the entered data */
	
	
	
	public String verifySize(double volume, String size) {
		
		String report = "";
		
		
		this.volume=volume;
		this.size=size;
		
		//System.out.println(volume);
		//System.out.println(size);
		
		
		int i=0;
		
		int str1_ch = (int)size.charAt(i); // check entered size string
		int str2_ch = (int)SMALL.charAt(i); // check Small size string
		
		int str3_ch = (int)MEDIUM.charAt(i); // check Medium size string
		int str4_ch = (int)LARGE.charAt(i); // check Large size string
		
		
		//System.out.println(str1_ch); 
		//System.out.println(str2_ch);
		//System.out.println(str4_ch);
		
		double cal;
		
		String myName="Jiin Jeon"; // name of student
		String by=""; // value for 'String.format();'
		
		
		
		if(str1_ch == str2_ch) {
			
			cal=SMALL_VOLUME-volume; // calculate difference
			
				if(cal>=-10.0 && cal<=10.0) {
					report=String.format("Entered size : %s | Entered volume : %.5f (ml)%n | Difference : %.1f , within 10ml tolerance %n ", size, volume, cal);
					System.out.println(report);
				} else {
					
					report=String.format("Entered size : %s | Entered volume : %.5f (ml)%n | Difference : %.1f , outside 10ml tolerance %n ", size, volume, cal);
				    System.out.println(report);
				    }
				
				
				by=String.format("programmed by %s%n",myName);
				System.out.println(by);
			
			
		    } else if (str1_ch == str3_ch) {
		    	
			 
		    	cal=MEDIUM_VOLUME-volume; // calculate difference
	
			
	            if(cal>=-10.0 && cal<=10.0) {
					report=String.format("Entered size : %s | Entered volume : %.5f (ml)%n| Difference : %.1f , within 10ml tolerance %n ", size, volume, cal);
					System.out.println(report);
					
				} 
				
	            else {
	            	
	            	report=String.format("Entered size : %s | Entered volume : %.5f (ml)%n| Difference : %.1f , outside 10ml tolerance %n ", size, volume, cal);
				    System.out.println(report);
				    
				    }
				
				
				by=String.format("programmed by %s%n",myName);
				System.out.println(by);
			
			//return report;

		    
		    } else if (str1_ch == str4_ch) {
			
			
			cal=LARGE_VOLUME-volume; // calculate difference
			
			
	            if(cal>=-10.0 && cal<=10.0) {
					report=String.format("Entered size : %s | Entered volume : %.5f (ml)%n | Difference : %.1f , within 10ml tolerance %n ", size, volume, cal);
					System.out.println(report);
				} else {
				
				    report=String.format("Entered size : %s | Entered volume : %.5f (ml)%n | Difference : %.1f , outside 10ml tolerance %n ", DrinkMachine.LARGE, DrinkMachine.LARGE_VOLUME, cal);
				    System.out.println(report);
				    
				    }
				
				
				by=String.format("programmed by %s%n",myName);
				System.out.println(by);
		
			
            }   else {
            	
            	System.out.println("you have three sizes | small, medium, large"); // exception : let users know only three sizes are available
            	
            }
		
		return report; // return final string data
		
		
	}
	
	/* Print out drink name and size */
	
	//ToDo: verify the menu is correct and fix any problems.
	
	public String drinkSizeMenu() {
		
		
		
		String report = String.format(
				"Drink sizes:%n%s is %.1f (ml)%n%s is %.1f (ml)%n%s is %.1f (ml)%n",
				DrinkMachine.SMALL, DrinkMachine.SMALL_VOLUME,
				DrinkMachine.MEDIUM, DrinkMachine.MEDIUM_VOLUME,
				DrinkMachine.LARGE, DrinkMachine.LARGE_VOLUME
				);
		
		//System.out.println(report);
		
		return report;
	}

}

