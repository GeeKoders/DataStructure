package Trie;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Trie trie = new Trie() ;
		
//		trie.insert("joe");
//		trie.insert("joell");
//		trie.insert("adamovich");
//		trie.insert("helloworld");
//
//		
//		System.out.println(trie.search("helloworlds"));
		
//---------------------------------------------------------		
//		trie.insert("joe",1);
//		trie.insert("adam",2);
		
//		System.out.println(trie.searchAsMap("joe"));
		
//---------------------------------------------------------	

//		trie.insert("adam", 1) ;
//		trie.insert("adr", 2) ;
//		trie.insert("adda", 3) ;
//		trie.insert("adada", 4) ;
//		trie.insert("adazzz", 1) ;
//
//		List<String> list = trie.allWordsWithPrefix("ada") ;
//		
//		for(String s:list){
//			System.out.println(s);
//		}
//---------------------------------------------------------	

//		trie.insert("adam", 1) ;
//		trie.insert("kevin", 2) ;
//		trie.insert("evelin", 3) ;
//		trie.insert("addams", 4) ;
//		trie.insert("junior", 5) ;
//		
//		List<String> list = trie.allWordsWithPrefix("") ;
//		
//		for(String s:list){
//			System.out.println(s);
//		}
//---------------------------------------------------------			
		
		trie.insert("adam", 1) ;
		trie.insert("adamm", 2) ;
		trie.insert("adamee", 3) ;
		
		System.out.println(trie.longestCommonPrefix());
		
		
		
	}

}
