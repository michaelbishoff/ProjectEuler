package euler;

public class Prob48 {
	
	public static void main(String[] args) {
		
		long sum = 0;
		String last_10_digits = "";

		for (int i = 0; i <= 1000; i++){
			sum += Math.pow(i, i);
		}

		System.out.println("Sum = " + sum);

		for (int i = 0; i < 10; i++){
			last_10_digits = (sum % 10) + last_10_digits;
			sum /= 10;
		}

		System.out.println("Last 10 Digits = " + last_10_digits);
	}


}