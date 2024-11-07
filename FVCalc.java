// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		System.out.println("please enter the initial ammount, the annual interest, " + 
			"and the numbers of investment years (by order)");
		int currentValue = Integer.parseInt(args[0]);
		Double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow(1 + rate/100, n); 
		System.out.println("After " + n + " years, " + "$" + currentValue  + 
		 	" saved at " + rate + "% " + "will yield " + " $" + (int) futureValue);
	}
}