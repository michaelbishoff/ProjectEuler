package euler;

public class Prob1620 {

	public static void main(String[] args) {
		System.out.println("Problem 16");
		prob16();

		System.out.println();
		System.out.println("Problem 20");
		prob20();
	}

	public static void prob16(){
		double powered = Math.pow(2, 1000);
		
		System.out.println("2^15 = " + powered);

		System.out.println("Sum = " + sumDigits( powered ) );
	}

	public static void prob20(){

		int start = 100;
		double factorial = 1;

		System.out.print(start + "! = ");

		// Factorial starting from 100 and going to 1
		while (start > 1){

			factorial *= start;

			start--;
		}

		System.out.println( factorial );
		System.out.println("Sum = " + sumDigits( factorial ) );
	}


	public static int sumDigits(double num){
		int sum = 0;

		while (num > 0){
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}


}
