package MaxItemStack;

public class App {

	public static void main(String[] args) {
		MaxItemStack maxItemStack = new MaxItemStack();

		maxItemStack.push(10);
		maxItemStack.push(5);
		maxItemStack.push(19);
		maxItemStack.push(12);
		maxItemStack.push(11);
		
		System.out.println(maxItemStack.getMaxItem()) ;
	}

}
