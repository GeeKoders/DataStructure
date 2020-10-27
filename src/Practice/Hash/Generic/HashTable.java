package Practice.Hash.Generic;

public class HashTable<Key, Value> {
	
	private Key[] keys ;
	private Value[] values ;
	private int numOfItems ;
	private int capacity ;
	
	public HashTable() {
		this.keys = (Key[])new Object[Constants.TABLE_SIZE] ;
		this.values = (Value[])new Object[Constants.TABLE_SIZE] ;
		this.capacity = Constants.TABLE_SIZE ;
		this.numOfItems = 0 ;
	}
	
	public HashTable(int newCapacity){
		this.keys = (Key[])new Object[newCapacity] ;
		this.values = (Value[])new Object[newCapacity] ;
		this.capacity = newCapacity ;
		this.numOfItems = 0 ;
	}
	
	public int size(){
		return this.numOfItems ;
	}
	
	public boolean isEmpty(){
		return this.numOfItems == 0 ;
	}
	
	public Value getKey(Key key){
		
		if(key == null) return null;
		
		int index = hash(key) ;
		
		while(keys[index]!=null){
			if(keys[index].equals(key)){
				return values[index] ;
			}
			
			index = (index + 1) % capacity ;
			
		}
		
		return null ;
		
	}
	
	public int hash(Key key){
		return Math.abs(key.hashCode()) % this.capacity ;
	}
	
	
		
	
	
	

}
