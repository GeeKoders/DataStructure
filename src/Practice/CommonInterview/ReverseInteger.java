package Practice.CommonInterview;

public class ReverseInteger {

	
	public static void main(String[] args) {
		
		System.out.println(reverse(4321));
	}
	
	
	public static int reverse(int n){
		
		
		int reversed = 0 ;
		int remainder = 0 ;
		
		while(n>0){
			
			remainder = n % 10 ;
			n = n / 10 ;
			reversed = reversed * 10 + remainder ;
			
		}
		
		return reversed ;
		
	}
	
	
	
	
}
