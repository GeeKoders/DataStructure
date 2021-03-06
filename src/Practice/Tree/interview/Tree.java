package Practice.Tree.interview;

public interface Tree<T> {
	public int getAgeSum() ;
	public Node<T> getKSmallest(Node<T> node, int k) ;
	public Node<T> getRoot() ;
	public int treeSize(Node <T> node) ;
	public void traversal() ; 
	public void insert(T data) ;
	public void delete(T data) ;
	public T getMaxValue() ;
	public T getMinValue() ;
	
}
