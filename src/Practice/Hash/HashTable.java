package Practice.Hash;

public class HashTable {
	
	private HashItem[] hashTable ;
	
	public HashTable() {
		this.hashTable = new HashItem[Constants.TABLE_SIZE] ;
		
	}
	
	public int get(int key){
		
	}
	
	public void put(int key, int value){
		
	}
	
	private int hash(int key){
		return key % Constants.TABLE_SIZE ;
	}
	

}
