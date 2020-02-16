package Tree;

import java.util.Scanner;

public class TreeApp {

	private NodeApp root ;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int [] num = new int[5] ;
		
		
		for(int i=0; i<5; i++){
			System.out.print("input your value:") ;
			num[i] = sc.nextInt();
		}
		
		TreeApp tree = new TreeApp(num) ;
		
		System.out.println("Create binary tree success") ;
		
	}
	
	
	public TreeApp(int []item){
		
		for(int value: item){
			addNodeToTree(value) ;
		}
		
	}


	private void addNodeToTree(int value) {
		
		NodeApp current = root ;
		
		if(root == null){
			root = new NodeApp(value) ;
		}else{
			
			//left 
			while(true){
				if(value < current.value){
					if(current.leftChild == null){
						current.leftChild = new NodeApp(value) ;
						return ;
					}else{
						current = current.leftChild ;
					}
				}else{ //right
					
					if(current.rightChild == null){
						current.rightChild = new NodeApp(value) ;
						return ;
					}else{
						current = current.rightChild ;
					}
					
				}
			}
			
		}
		
		
	}
	
	
	

}

class NodeApp{
	
	public int value ;
	
	public NodeApp leftChild ;
	
	public NodeApp rightChild ;
	
	
	public NodeApp(int value){
		this.value = value ;
		this.leftChild = null ;
		this.rightChild = null ;
	}
	
}
