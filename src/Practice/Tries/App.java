package Practice.Tries;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Trie trie = new Trie() ;
		
//		trie.insert("joe");
//		trie.insert("joell");
//		trie.insert("adamovich");
//		trie.insert("helloworld");
//		
//		System.out.println(trie.search("joee"));
		
        /////////////////////////////////
		
//		trie.insert("joe", 1);
//		trie.insert("adam", 2);
//
//		System.out.println(trie.searchAsMap("adam"));

		/////////////////////////////////
		
		trie.insert("adam");
		trie.insert("adr");
		trie.insert("adda");
		trie.insert("adada");
		trie.insert("adazzz");
		
		List<String> list = trie.allWordsWithPrefix("") ;
		
		for(String s: list){
			System.out.println(s);
		}
		
		
		
		
		
	}

}
