package Trie;

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
		
		
		trie.insert("joe",1);
		trie.insert("adam",2);
		
		System.out.println(trie.searchAsMap("joe"));
		
	}

}
