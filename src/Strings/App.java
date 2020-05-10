package Strings;

import java.util.List;

public class App {

	public static void main(String[] args) {

		StringOperations operations = new StringOperations() ;
		
		System.out.println(operations.reverseString("Hello World!"));
	
		
		List<String> suffixes = operations.getSuffixes("Hello") ;
		
		for(String s:suffixes){
			System.out.println(s);
		}
		
	}

}
