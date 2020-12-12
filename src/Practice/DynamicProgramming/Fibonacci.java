package Practice.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci() ;
//		System.out.println(fibonacci.nativeFibonacci(1000)) ;
		System.out.println(fibonacci.fibonacciDP(1000));
		
	}

	private Map<Integer, Integer> map ;
	
	public Fibonacci(){
		map = new HashMap<>() ;
		map.put(0, 0) ;
		map.put(1, 1) ;
	}
	
	public int fibonacciDP(int n){
		
		if(map.containsKey(n)) return map.get(n) ;
		
		
		map.put(n-1, fibonacciDP(n - 1)) ;
		map.put(n-2, fibonacciDP(n - 2)) ;
		
		int result = map.get(n-1) + map.get(n-2) ;
		map.put(n, result) ;
		return result ;
		
		
	}
	
	
	//time complexity: O(2^N)
	public int nativeFibonacci(int n){

		if(n == 0) return 0 ;
		if(n == 1) return 1 ;
		
		return nativeFibonacci(n - 2) + nativeFibonacci(n - 1) ;
	}
}
