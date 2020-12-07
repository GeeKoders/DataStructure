package Practice.Backtracking;

public class ColoringProblem {

	
	public static void main(String[] args) {
		
		int[][] graphMatrix = new int[][]{
			
				{0, 1, 0, 1, 0},
				{1, 0, 1, 1, 0},
				{0, 1, 0, 1, 0},
				{1, 1, 1, 0, 1},
				{0, 0, 0, 1, 0}
				
		};
		
		int numOfColors = 4 ;
		ColoringProblem coloringProblem = new ColoringProblem(graphMatrix, numOfColors) ;
		coloringProblem.solveColoringProblem();
	}
	
	private int numOfVertices ;
	private int numOfColors ;
	private int [] colors ;
	private int[][] adjacencyMatrix ;
	
	public ColoringProblem(int[][] adjacencyMatrix, int numOfColors) {
		this.numOfVertices = adjacencyMatrix.length ;
		this.numOfColors = numOfColors ;
		this.colors = new int[numOfVertices] ;
		this.adjacencyMatrix = adjacencyMatrix ;
	}
	
	public void solveColoringProblem(){
		
		if(solve(0)){
			showResult() ;
		}else{
			System.out.println("No solution with the given parameter...");
		}
		
		
	}

	private boolean solve(int nodeIndex) {
		
		//if we find a color to the last node: the problem is solved
		//this is the base case for recursion
		if(nodeIndex == numOfVertices){
			return true ;
		}
		
		//try all colors(color indexs at starts with 1)
		for(int colorIndex=1; colorIndex<=numOfColors; colorIndex++){
			
			if(isColorValid(nodeIndex, colorIndex)){
				
				//assign and proceed with next vertex (node)
				colors[nodeIndex] = colorIndex ;
				
				//if we can solve the problem for the next node
				//then we return true
				if(solve(nodeIndex + 1)){
					return true ;
				}
				
				//otherwise BACKTRACK so increment the color index
				
			}
			
		}
		//no solution because we tried all the colors withour any result
		return false ;
	
	}

	private boolean isColorValid(int nodeIndex, int colorIndex) {

		//check the nodes 
		for(int i=0; i<numOfVertices; i++){
			if(adjacencyMatrix[nodeIndex][i] == 1 && colorIndex == colors[i]){
				return false ;
			}
		}
		
		return true;
	}

	private void showResult() {

		for(int i=0; i<numOfVertices; i++){
			System.out.println("Node " + (i+1) + " has color index: " + colors[i] + " ");
		}
		System.out.println();
	}
	
}
