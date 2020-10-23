package Practice.Hash.LinearProbing;

public class HashTable {
	
	private HashItem[] hashTable ;
	
	public HashTable() {
		this.hashTable = new HashItem[Constants.TABLE_SIZE] ;
	}
	
	public int get(int key){
		int index = hash(key) ;
		
		while(hashTable[index] != null && hashTable[index].getKey()!=key){
			
			index = index + 1 ;
			System.out.println("Hoping to the next index: " + index);
			
		}
		
		if(hashTable[index] == null){
			return -1 ;
		}else{
			return hashTable[index].getValue() ;
		}
		
	}
	
	
	public void put(int key, int value){
		int index = hash(key) ;
		System.out.println("put() method called with value: " + value + " - index:" + index );
		
		while(hashTable[index] != null){
			index = index + 1 ;
			System.out.println("Collision -> nextIndex: " + index);
		}
		System.out.println("Inserted finally with index: " + index);
		hashTable[index] = new HashItem(key, value) ;
		
	}
	
	public int hash(int key){
		return 0 ;
	}

}
