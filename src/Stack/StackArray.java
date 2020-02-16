package Stack;

public class StackArray {

	private static int top = -1;

	private static int[] stack = new int[5];

	private static int[] stackCopy = stack;

	public static void main(String[] args) {

		StackArray stackArray = new StackArray();

		stackArray.push(1);
		stackArray.push(2);
		stackArray.push(3);

		stackArray.pop();
		stackArray.pop();

		stackArray.push(4);
		stackArray.push(5);
		stackArray.push(6);
		stackArray.push(7);
		stackArray.push(8);
		stackArray.push(9);

		stackArray.pop();
		System.out.println("size:" + stack.length);

	}

	public void push(int number) {

		if (isFull()) {
			
			resize() ;
		}
		stack[++top] = number;
		System.out.println("push:" + stack[top]);

	}

	public void pop() {

		int length = stack.length;
		if (top == -1) {
			System.out.println("It is empty to pop");
		} else {
			if (top > -1 && top < 0.25 * length) {
				resize() ;
			}
			System.out.println(stack[top--]);
		}
	}

	public boolean isFull() {
		return top == stack.length - 1;
	}

	public int size() {
		return stack.length;
	}
	
	public void resize(){
		stack = new int[stack.length * 2];
		for (int i = 0; i < stackCopy.length; i++) {
			stack[i] = stackCopy[i];
		}
	}
}
