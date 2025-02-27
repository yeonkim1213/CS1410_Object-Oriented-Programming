package lecture.lec2;

public class lecture2 {
	public static void main(String[] args) {
		// char myLetter = 'a';
		
		// Note that the expression is evaluated from left to right,
		// and the types of the leftmost values determine the operation
		// performed.
		String myString = "William" + 5 + 6 + 7;
		// "William5" + 6 + 7
		// "William56" + 7
		// "William567"
		System.out.println(myString);
		
		System.out.println(((5 + 6) + 7) + "William");
		// 11 + 7 + "William"
		// 18 + "William"
		// "18William"
		
//		a + b + c + d
//		(a + b) + c + d
//		((a + b) + c) + d
		
		// String formatting example using String.format
//		String myString2 = String.format("My number: %d and my string is %s", 5, "Bob");
//		
//		System.out.println(myString2);
//		
//		System.out.println("myString2");
		
//		int myNumber1 = 5;
//		int myNumber2 = 6;
//		
//		System.out.println(myNumber1 - myNumber2);
//		
//		System.out.println(myNumber2);
		
		
		//System.out.println(7.0);
		
		printAreaOfRectangle(2, 3);
		System.out.println("Area plus 1: " + (1 + returnAreaOfRectangle(2, 3)));
		
		//printStrings(5, 6);
		
		
	}
	
	public static void printStrings(String s1, String s2) {
		System.out.println(s1 + s2);
	}

	public static void printAreaOfRectangle(int length, int height) {
		double result = length * height;
		System.out.println("area result is " + result);
	}
	public static double returnAreaOfRectangle(double length, double height) {
		double result = length * height;
		return result;
	}
}
