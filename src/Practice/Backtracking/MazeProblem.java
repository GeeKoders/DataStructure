package Practice.Backtracking;

public class MazeProblem {

	public static void main(String[] args) {
		
		int mazeTable[][] = new int[][]{
				{1, 1, 1, 1, 1},
				{1, 0, 0, 1, 0},
				{0, 0, 0, 1, 0},
				{1, 1, 1, 1, 1},
				{1, 1, 1, 0, 1}	
				
		};
		
		MazeProblem mazeProblem = new MazeProblem(mazeTable) ; 
		mazeProblem.solveMaze();
	}
	
	private int[][]mazeTable ;
	private int[][]solutionTable ;
	private int mazeSize ;
	
	public MazeProblem(int[][] mazeTable) {
		this.mazeTable = mazeTable ;
		this.mazeSize = mazeTable.length ;
		this.solutionTable = new int[this.mazeSize][this.mazeSize] ;
	}
	
	public void solveMaze(){
		
		if(!solve(0, 0)){
			System.out.println("No feasible solution has found... ");
			return ;
		}
		
		showResult() ;
	}

	private boolean solve(int x, int y) {

		if(isFinished(x, y)){
			return true ;
		}
		
		if(isValid(x, y)){
			
			solutionTable[x][y] = 1 ;
			
			if(solve(x+1, y)){
				return true ;
			}
			
			if(solve(x, y+1)){
				return true ;
			}
			
			solutionTable[x][y] = 0 ;
			
		}
		
		return false;
	}

	private boolean isValid(int x, int y) {

		if(x<0 || x>=this.mazeSize) return false ;
		if(y<0 || y>=this.mazeSize) return false ;
		
		if(this.mazeTable[x][y]!=1) return false ;
		
		return true; 
	}

	private boolean isFinished(int x, int y) {

		if(x == this.mazeSize - 1 && y == this.mazeSize - 1){
			solutionTable[x][y] = 1; 
			return true ;
		}
		return false;
	}

	private void showResult() {

		for(int i=0; i<this.mazeSize; i++){
			for(int j=0; j<this.mazeSize; j++){
				
				if(this.solutionTable[i][j] == 1){
					System.out.print(" S ");
				}else{
					System.out.print(" - ");
				}
				
			}
			System.out.println();
			
		}
		
	}
	
	
}
