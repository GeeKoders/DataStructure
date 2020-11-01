package Practice.Substring.BoyerMoore;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class App {
	
	
	public static void main(String[] args) {
		String text = "My name is Joe!" ;
		String pattern = "name" ;
		
		BoyerMoore boyerMoore = new BoyerMoore(text, pattern) ;
		boyerMoore.precomputeTable(); 
		System.out.println(boyerMoore.search());
		
	}
	
	
	
}
