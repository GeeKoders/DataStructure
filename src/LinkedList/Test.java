package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Test {
	
	private TestNode first ;
	
	private TestNode last ;
	
	private int count = 0 ;
	
	public static void main(String[] args) {
		Test test = new Test() ;
//		insert
		
//		test.insertH(1) ; 
//		test.insertH(2) ;
//		test.insertH(3) ; 
//		test.insertH(4) ;
//		test.insertH(5) ;
//		
//		test.print() ; // 5 4 3 2 1
		
//		test.insertT(1) ;
//		test.insertT(2) ;
//		test.insertT(3) ;
//		test.insertT(4) ;
//		test.insertT(5) ;
//		test.print() ; // 1 2 3 4 5
//		System.out.println("==================================") ;
//		
//		test.insertM(6, 3) ;
//		test.print() ; // 1 2 3 6 4 5
		
		test.insertComplete("T", 1, -1);
		test.insertComplete("T", 2, -1);
		test.insertComplete("T", 3, -1);
		test.insertComplete("T", 4, -1);
		test.insertComplete("T", 5, -1);
		test.insertComplete("M", 6, 3);
		test.print();
		
		System.out.print("size:" + test.size()) ;
		
//		System.out.println("==================================") ;		
		
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
	
	public void insertT(int data){
		
		TestNode newNode =  new TestNode(data) ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			last.next = newNode ; 
			last = newNode ;
		}
		
	}
	
	public void insertM(int data, int afterData){
		
		TestNode newNode = new TestNode(data) ;
		TestNode current = first ;
		boolean searchFlag = false ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			while(current.next!=null && current.data != afterData){
				current = current.next ;
				if(current.data == afterData){
					searchFlag = true ;
					newNode.next = current.next ;
					current.next = newNode ;
				}
					
			}
		}
		
		if(!searchFlag) System.out.println("It can't find target value:" + afterData);
		
	}
	
	public void insertComplete(String type, int data, int target){
		
		TestNode newNode = new TestNode(data) ;
		
		if(isEmpty()){
			first = newNode ;
			last = newNode ;
		}else{
			if(target == -1){
				if(StringUtils.equals("H", type)){ //Head
					newNode.next = first ; 
					first = newNode ;
				}else if(StringUtils.equals("T", type)){ //Tail
					last.next = newNode ;
					last = newNode ;
				}
			}else{ //Middle

				TestNode current = first ;
				while(current.next!=null && current.data != target){
					
					current = current.next ;
					if(current.data == target){
						newNode.next = current.next ;
						current.next = newNode ;
					}
				}
				
			}
			
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
	
	public int size(){
		
		TestNode current = first ;
		
		while(current != null){
			count ++ ;
			current = current.next ;
		}
		
		return count ;
		
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
