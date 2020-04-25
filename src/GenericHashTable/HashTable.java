package GenericHashTable;

@SuppressWarnings("unchecked")
public class HashTable<Key, Value> {

	private Key[] keys;
	private Value[] values;
	private int numOfItems;
	private int capacity; // it is the maximum number of items that can be
							// inserted in the table: numOfItems <= capacity

	public HashTable() {
		this.keys = (Key[]) new Object[Constants.TABLE_SIZE];
		this.values = (Value[]) new Object[Constants.TABLE_SIZE];
		this.capacity = Constants.TABLE_SIZE;
		this.numOfItems = 0;
	}

	public HashTable(int newCapacity) {
		this.keys = (Key[]) new Object[newCapacity];
		this.values = (Value[]) new Object[newCapacity];
		this.capacity = newCapacity;
		this.numOfItems = 0;
	}

	// O(1)
	public int size() {
		return this.numOfItems;
	}

	// O(1)
	public boolean isEmpty() {
		return this.numOfItems == 0;
	}

	public void put(Key key, Value value) {

		if (key == null || value == null)
			return;

		if (numOfItems >= capacity * 0.75) { // O(1) -> O(N)
			resize(2 * capacity);
		}

		int index = hash(key);

		while (keys[index] != null) {

			//update
			if (keys[index].equals(key)) {
				values[index] = value;
				return;
			}
			index = (index + 1) % capacity;
		}
		
		keys[index] = key ;
		values[index] = value ;
		numOfItems ++ ; 
		
		
		
		

	}

	public Value get(Key key) {

		if (key == null)
			return null;

		int index = hash(key);

		while (keys[index] != null) {

			if (keys[index].equals(key)) {
				return values[index];
			}

			index = (index + 1) % capacity;

		}

		return null;

	}

	public int hash(Key key) {
		return key.hashCode() % capacity;
	}

}
