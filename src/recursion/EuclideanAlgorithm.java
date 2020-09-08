package recursion;

public class EuclideanAlgorithm {

	public static void main(String[] args) {
		
		EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm() ;
//		System.out.println(euclideanAlgorithm.gcdIterative(30, 100)) ;
		System.out.println(euclideanAlgorithm.gcdRecursive(7, 9));
		
	}
	
	public int gcdIterative(int num1, int num2){
		
		while(num2 != 0){
		
			int tmp = num1 ;
			num1 = num2 ;
			num2 = tmp % num2 ;
		}
		
		return num1 ;
		
	}
	
	public int gcdRecursive(int num1, int num2){
		
		if(num2 == 0) return num1 ;
		return gcdRecursive(num2, num1 % num2) ;
	}

}
