package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	private TestNode first ;
	
	private TestNode last ;
	
	public static void main(String[] args) {
//		 linkedListInserHead() ;
		
		
	}
	
	public static void linkedListInserHead(){
		
		Scanner scanner = new Scanner(System.in) ;
		
		Test test = new Test() ;
		
		for(int i=0; i<5; i++){
			
			System.out.print("Please input your score:");
			int score = scanner.nextInt() ;
			test.insertH(score);
		}
		
		test.print();
	}
	
	
	public void insertH(int data){
		
		TestNode newNode = new TestNode(data) ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			newNode.next = first ;
			first = newNode ;
		}
		
	}
	
	
	public void print(){
		
		TestNode current = first ;
		while(current!=null){
			System.out.println(current.data);
			current = current.next ;
		}
	}
	
	
	public boolean isEmpty(){
		return first == null ;
	}
	
}

class TestNode{
	
	public int data;
	
	public TestNode next ;
	
	public TestNode(int data){
		this.data = data ;
		this.next = null ;
	}
}
