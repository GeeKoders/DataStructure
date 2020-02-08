package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	private TestNode first ;
	
	private TestNode last ;
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	public void insertH(String data){
		
		TestNode newNode = new TestNode(data) ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			first = newNode ;
			last = newNode.next ;
		}
		
	}
	
	public boolean isEmpty(){
		return first == null ;
	}
	
}

class TestNode{
	
	public String data;
	
	public TestNode next ;
	
	public TestNode(String data){
		this.data = data ;
		this.next = null ;
	}
}
