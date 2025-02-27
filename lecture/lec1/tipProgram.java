package lecture.lec1;

public class tipProgram {

	public static void main(String[] args) {
		// Compute and print a tip amount.
		double basePrice = 27.13;
		double percent = 18.0;
		// We can change the value of a variable.
		percent = percent + 1;

		// If you remove the slashes commenting this line, you can
		// see the updated value of the percent variable.
		//System.out.println(percent);

		System.out.println(basePrice * percent / 100.0);
	}
}
