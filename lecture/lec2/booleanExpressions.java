package lecture.lec2;

public class booleanExpressions {

	public static void main(String[] args) {
//		int number = 2;
		
//		boolean result = number < number2;
//		System.out.println(result);
		
//		if (number == 5) {
//			System.out.println("We got true!");
//			System.out.println("Still true!");
//		} else if (number == 4) {
//			System.out.println("We got 4");
//		} else if (number >= 4 ) {
//			System.out.println("More than 4");
//		} else {
//			System.out.println("Less than 3");
//		}
		
		// BAD - don't put semicolon after parentheses with if
//		if (number == 3); {
//			System.out.println("It's 3");
//		}
		
//		if (number > -10) {
//			if (number < 100) {
//				System.out.println("The number is in the range");
//			}
//		}
//		
//		if (number > -10 && number < 100) {
//			System.out.println("The number is in the range");
//		}
		
//		boolean myResult = printWhenTrue(5 == 5);
//		if (false && myResult) {
//			System.out.println("&& was true");
//		} else {
//			System.out.println("&& was false");
//		}
	
//      // Note that compound conditions need &&
//		//1 < x < 4 // this won't work
//		1 < x && x < 4
//		1 < x && 4 < x
		
		// Beware order of operations!
		System.out.println(4 + 5 * 10);
		System.out.println(printWhenTrue(true) || printWhenTrue(true) && printWhenTrue(true));
		// Both of these are implicitly grouped the same as:
		System.out.println(4 + (5 * 10));
		System.out.println(printWhenTrue(true) || (printWhenTrue(true) && printWhenTrue(true)));
		// If we want a different order, explicitly use parentheses!
		System.out.println((4 + 5) * 10);
		System.out.println((printWhenTrue(true) || printWhenTrue(true)) && printWhenTrue(true));
		// Frankly, just always use paretheses!
		
		boolean highSalary = false;
		boolean benefitsGood = true;
		boolean promotionSoon = true;
		
		if (benefitsGood || promotionSoon && highSalary) {
			System.out.println("accept");
		} else {
			System.out.println("Don't accept");
		}
		// is not the same as
		if ((benefitsGood || promotionSoon) && highSalary) {
			System.out.println("accept");
		} else {
			System.out.println("Don't accept");
		}
		
		System.out.println("Done");

	}
	
	public static boolean printWhenTrue(boolean arg) {
		if (arg) {
			System.out.println("printWhenTrue got true");
		}
		return arg;
	}
	

}
