import java.util.Scanner;

import javax.swing.JOptionPane;

public class MilesToFeetInteractive {
		
		
		
		
		
		public static void main(String[] args) {
			//Declare and initialize named constant FEET_PER_MILE
			final int FEET_PER_MILE = 5280;
			
			//Declare and initialize variables
			float uncleMiles, uncleFeet;
			Scanner kbrd = new Scanner(System.in);
			//User Input
			System.out.println("What is the distance in miles to your uncles house.");
			uncleMiles = kbrd.nextFloat();
			
			//Calculations
			uncleFeet = uncleMiles * FEET_PER_MILE;
			
			//DisplayOutPut
			JOptionPane.showMessageDialog(null, "The Distance to my uncles house is " + uncleMiles + " miles. That's " + uncleFeet + " feet!");
			
			
	}

}
