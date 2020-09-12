package backtracking;

public class KnightTour {

	public static void main(String[] args) {
		
		KnightTour knightTour = new KnightTour() ;
		knightTour.sovleTour(); 
	}
	
	
	private int boardSize = 8 ;
	private int numOfMoves = 8 ;
	private int[][] solutionMatrix ;
	private int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2} ;
	private int[] yMoves = {1, 2, 2, 1, -1, -2, -2, -1} ;
	
	public KnightTour() {
		this.solutionMatrix = new int[boardSize][boardSize] ;
		this.initializeBoard() ;
	}

	private void initializeBoard() {

		for(int i=0; i<boardSize; i++){
			for(int j=0; j<boardSize; j++){
				solutionMatrix[i][j] = Integer.MIN_VALUE ;
			}
			
		}
		
	}
	
	public void sovleTour(){
		
		solutionMatrix[0][0] = 1 ;
		
		if(solve(2, 0, 0)){
			
			printSolution() ;
			
			
		}else{
			System.out.println("No feasible solution...");
		}
		
	}

	private boolean solve(int stepCount, int x, int y) {

		
		if(stepCount == boardSize * boardSize + 1){
			return true ;
		}
		
		for(int i=0; i<numOfMoves; i++){
			
			int nextX = x + xMoves[i] ;
			int nextY = y + yMoves[i] ;
			
			if(isStepVaild(nextX, nextY)){
				solutionMatrix[nextX][nextY] = stepCount ;
				
				if( solve(stepCount+1, nextX, nextY)){
					return true ;
				}
				//backtracking
				solutionMatrix[nextX][nextY] = Integer.MIN_VALUE ;
			}
		}
		
		
		return false;
	}

	private boolean isStepVaild(int x, int y) {
		
		if(x < 0 || x >= boardSize) return false ;
		if(y <0 || y >=boardSize) return false ;
		
		if(solutionMatrix[x][y] != Integer.MIN_VALUE) return false ;
		return true ;
		
	}

	private void printSolution() {
		
		for(int i=0; i<boardSize; i++){
			for(int j=0; j<boardSize; j++){
				System.out.print(solutionMatrix[i][j] + " ") ;
			}
			System.out.println();
		}
		
	}

}
