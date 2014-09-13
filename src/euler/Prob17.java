package euler;

public class Prob17{

	// The number of letters in the nmbers 1 to 9 inclusive
	public static final int[] ONES = {0,3,3,5,4,4,3,5,5,4};

	public static final int[] TENS = {0,0,6,6,5,5,5,7,6,6};

	public static final int HUNDRED = 7;

	public static final int AND = 3;

	public static final int[] TEENS = {3,6,6,8,8,7,7,9,8,8};


	public static void main(String[] args){
		int sum = 0;
		int thisSum;

		// Hundreds Digit
		for (int i = 0; i < 10; i++){
			
			// Tens Digit
			for (int x = 0; x < 10; x++){
				
				// Ones Digit
				for (int y = 0; y < 10; y++){
					thisSum = 0;

					if ( i > 0 ){
						thisSum += ONES[i] + HUNDRED;
						
						if ( x > 0 || y > 0 ){
							thisSum += AND;
						}
					}

					if (x == 1){
						thisSum += TEENS[y];
					}
					else {
						thisSum += TENS[x] + ONES[y];
					}

					System.out.println(i + "" + x + "" + y + " = " + thisSum);

					sum += thisSum;
				}
			}
		}

		// One Thousand
		thisSum = ONES[1] + 8;
		System.out.println("1000 = " + thisSum);
		sum += thisSum;

		System.out.println("Sum = " + sum);
	}



}