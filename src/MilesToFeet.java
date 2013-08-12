
public class MilesToFeet {

	public static void main(String[] args) {
		//Declare and initialize named constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		float uncleMiles = 8.5f;
		float uncleFeet = uncleMiles * FEET_PER_MILE;
		//DisplayOutPut
		System.out.println("The Distance to my uncles house is " + uncleMiles + " miles.");
		System.out.println("That's " + uncleFeet + " feet!");
		
		
		
	}

}
