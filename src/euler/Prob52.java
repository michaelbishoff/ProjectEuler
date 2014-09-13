package euler;

public class Prob52 {

	public static void main(String[] args) {
		
		int i = 1;
		int num = -1;
		
		while (num == -1){
			
			MultiplicitySet ms = getDigits(i);
			MultiplicitySet mso = getDigits(i * 2);
			
			if (ms.equals(mso)){
				mso = getDigits(i * 3);
				
				if (ms.equals(mso)){
					mso = getDigits(i * 4);
					
					if (ms.equals(mso)){
						mso = getDigits(i * 5);
						
						if (ms.equals(mso)){
							mso = getDigits(i * 6);
						
							if (ms.equals(mso)){
								num = i;
							}
						}
					}
				}
			}
			
			i++;
		}
		
		for(int x = 1; x < 7; x++){
			System.out.println("Num * " + x + " = " + (num * x));
		}
	}
	
	public static MultiplicitySet getDigits(int num){
		
		MultiplicitySet ms = new MultiplicitySet();
		
		while (num > 0){
			ms.add(num % 10);
			num /= 10;
		}
		
		return ms;
	}
	
	
	private static class MultiplicitySet {
		
		
		SetObj[] set;
		
		public MultiplicitySet(){
			set = new SetObj[10];
			
			for (int i = 0; i < set.length; i++){
				set[i] = new SetObj();
			}
			
		}
		
		public void add(int value){
			set[value].increaseMultiplicity();
		}
		
		public boolean equals(Object temp){
			
			MultiplicitySet o = (MultiplicitySet) temp;
			
			for (int i = 0; i < set.length; i++){
				if (this.set[i].multiplicity != o.set[i].multiplicity){
					return false;
				}
			}
			
			return true;
		}
		
		
		public String toString(){
			String output = "";
			
			for (int i = 0; i < set.length; i++){
				output += i + ": " + set[i].multiplicity;
			}
			
			return output;
		}
		
	}
	
	private static class SetObj {
		
		int multiplicity;
		
		public SetObj(){
			this.multiplicity = 0;
		}
		
		public void increaseMultiplicity(){
			multiplicity++;
		}
		
		
	}
	
	

}
