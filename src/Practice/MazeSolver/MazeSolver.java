package Practice.MazeSolver;

import org.w3c.dom.ranges.RangeException;

public class MazeSolver {
	
	private int [][] mazeMap ;
	private boolean [][] visited ;
	private int startPositionCol ;
	private int startPositionRow ;
	
	public MazeSolver(int [][]mazeMap, int startPositionCol, int startPositionRow) {
		this.mazeMap = mazeMap ;
		this.visited = new boolean[mazeMap.length][mazeMap.length] ;
		this.startPositionCol = startPositionCol ;
		this.startPositionRow = startPositionRow ;
	}
	
	public void findWayOut(){
		
		try{
			dfs(startPositionRow, startPositionCol) ;
			System.out.println("No solution found...");
		}catch(RuntimeException e){
			System.out.println("Route found to exit!!!");
		}
		
		
	}

	private void dfs(int i, int j) {
		
		System.out.println("Visiting i=" + i + ", j=" + j);
		
		if(this.mazeMap[i][j] == 3){
			throw new RuntimeException() ; 	 // if we have found the 3 "exit" we break out the iteration with an excaption 
		}
		
		int endOfMap = this.mazeMap.length - 1 ;
		
		if(visited[i][j]){
			return ;
		}else if(i<0 || i >= endOfMap){
			return ;
		}else if(j<0 || j >= endOfMap){
			return ;
		}else if(this.mazeMap[i][j] == 1){
			return ;
		}else{
			
			
			this.visited[i][j] = true ;
			dfs(i+1, j) ;
			dfs(i-1, j) ;
			dfs(i, j+1) ;
			dfs(i, j-1) ;
			
		}
		
	}

}
