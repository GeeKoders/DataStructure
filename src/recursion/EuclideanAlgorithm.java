package recursion;

public class EuclideanAlgorithm {

	public static void main(String[] args) {
		
		EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm() ;
		System.out.println(euclideanAlgorithm.gcdIterative(30, 100)) ;
	
	}
	
	public int gcdIterative(int num1, int num2){
		
		while(num2 != 0){
		
			int tmp = num1 ;
			num1 = num2 ;
			num2 = tmp % num2 ;
		}
		
		return num1 ;
		
	}

}
