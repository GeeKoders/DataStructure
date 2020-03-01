package BinarySearchTree;

public interface Tree<T> {

	public void traversal() ; 
	public void insertNode(T data, Node<T> node) ;
	public void delete(T data) ;
	public T getMax() ;
	public T getMin() ;
	
}
