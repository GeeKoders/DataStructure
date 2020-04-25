package HashMapLinearProbing;

public class HashTable {
	
	private HashItem[] hashTable ;
	
	public HashTable() {
		this.hashTable = new HashItem[Constants.TABLE_SIZE] ;
	}
	
	public void put(int key, int value){
		int generatedIndex = hashFunction(key) ;
		
		while(hashTable[generatedIndex] != null){
			generatedIndex = (generatedIndex+1) % Constants.TABLE_SIZE ;
		}
		
		hashTable[generatedIndex] = new HashItem(key, value) ;
		
	}

	private int hashFunction(int key) {
		return key % Constants.TABLE_SIZE;
	}
	
	

}
