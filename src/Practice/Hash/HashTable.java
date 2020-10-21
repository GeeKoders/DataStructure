package Practice.Hash;

public class HashTable {
	
	private HashItem[] hashTable ;
	
	public HashTable() {
		this.hashTable = new HashItem[Constants.TABLE_SIZE] ;
		
	}
	
	public int get(int key){
		int index = hash(key) ;
		
		if(hashTable[index] == null ){
			return -1 ;
		}else{
			HashItem hashItem = hashTable[index] ;
			
			while(hashItem!=null && hashItem.getKey()!=key){
				hashItem = hashItem.getNextHashItem() ;
			}
			
			if(hashItem == null){
				return -1 ;
			}else{
				return hashItem.getValue() ;
			}
		}
		
		
		
	}
	
	public void put(int key, int value){
		
		int index = hash(key) ;
		
		if(hashTable[index] == null){
			System.out.println("No collision simple insertion...");
			hashTable[index] = new HashItem(key, value) ;
		}else{
			
			System.out.println("Collision with key " + key);
			HashItem hashItem = hashTable[index] ;
			
			while(hashItem.getNextHashItem()!=null){
				hashItem = hashItem.getNextHashItem() ;
				System.out.println("Consider the next item in linked list " + hashItem.getValue());
			}
			
			System.out.println("Finally we have found the place to insert...");
			hashItem.setNextHashItem(new HashItem(key, value));
		}
		
		
	}
	
	private int hash(int key){
//		return key % Constants.TABLE_SIZE ;
		return 1 ;
	}
	

}
