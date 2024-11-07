// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int randomNum1 = (int) (Math.random() * lim);
		int randomNum2 = (int) (Math.random() * lim);
		int randomNum3 = (int) (Math.random() * lim);
		int minNum = Math.min(randomNum3, Math.min(randomNum1, randomNum2));
		int maxnNum = Math.max(randomNum3, Math.max(randomNum1, randomNum2));
		int middle = (randomNum1 + randomNum2 + randomNum3) - (maxnNum + minNum);
		System.out.println(randomNum1 + " " +
			randomNum2 + " " + randomNum3 );
		System.out.println(minNum + " " +
			middle + " " + maxnNum );

	}
}
