package HashMapChanning;

public class App {

	public static void main(String[] args) {
		
		HashTable hashTable = new HashTable() ;
		System.out.println();
		hashTable.put(1, 10);
		System.out.println();
		hashTable.put(2, 100);
		System.out.println();
		hashTable.put(3, 1000);
		System.out.println();
		hashTable.put(4, 10000);
		
		System.out.println(hashTable.get(3));

	}

}
