package Stack;


import java.util.Scanner;

public class Stack {
	
	private static int top = -1;
	
	private static int num[] = new int[5];


	public static void main(String[] args) {

		Stack stack = new Stack();
		
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		while (ans!= -1) {
			System.out.print("1:pop, 2:push, 3:peek, -1:exit the game:");
			ans = sc.nextInt();
			switch (ans) {
				case 1:
					stack.pop(num);
					break;
				case 2:
					stack.push(num);
					break;
				case 3:
					stack.peek(num);
					break;
				case -1:
					System.exit(0);
					break;
				default:
					System.out.println("please input your number again");
		}
			stack.print(num);
	}
}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull(int[] num) {
		return top == num.length - 1 ;
	}
	
	public void push(int[] num){
		
		if(isFull(num)){
			System.out.println("Stack is full");
		}else{
			num[++top] = 1;
		}
	}
	
	public void pop(int[] num) {
		
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			num[top--] = 0;
		}
	}
	
	public void peek(int[] num) {
		
		top--;
		
		if(top <= -1){
			System.out.println("peek is under flow()");
			top = -1;
		}
	}
	
	public void print(int[] num) {
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}