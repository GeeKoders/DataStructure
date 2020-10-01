package Practice.Tree;

public class PersonNode<T> {

	public PersonNode <T> left;
	public PersonNode <T> right;
	public T data ;
	
	public PersonNode(T data) {
		this.data = data ;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
	
}
