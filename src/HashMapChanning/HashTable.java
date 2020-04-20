package HashMapChanning;

public class HashTable {
	
	private HashItem[] hashTable ;
	
	public void put(int key, int value){
		
		int hashArrayIndex = hash(key) ;
		
		if(hashTable[hashArrayIndex] == null){
			hashTable[hashArrayIndex] = new HashItem(key, value) ;
		}else{
			
			HashItem hashItem = hashTable[hashArrayIndex] ;
			
			while(hashItem.getNextHashItem() !=null){
				hashItem = hashItem.getNextHashItem() ;
			}
			hashItem.setNextHashItem(new HashItem(key, value));
		}
	}
	
	private int hash(int key){
		return key % Constants.TABLE_SIZE ;
	}
	
	
	

}
