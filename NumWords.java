// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int hundreds, tens, ones;
		int originalNum = Integer.parseInt(args[0]);
		hundreds = originalNum / 100;
		tens = originalNum % 100 / 10;
		ones = originalNum % 10;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
