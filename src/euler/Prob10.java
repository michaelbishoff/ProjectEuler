package euler;

public class Prob10 {
	

	public static void main(String[] args) {
		
		int sum = 2;

		for (int i = 3; i < 2000000; i++){
			if (isPrime(i)){
				sum += i;
			}
		}

		// Sum = 1179908154
		System.out.println("Sum = " + sum);
	}



	public static boolean isPrime(int num){

		if (num % 2 == 0){
			return false;
		}

		for (int i = 3; i < num / 2; i += 2){
			if (num % i == 0){
				return false;
			}
		}

		return true;
	}

}