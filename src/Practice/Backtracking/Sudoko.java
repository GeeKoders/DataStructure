package Practice.Backtracking;

import backtracking.Sudoku;

public class Sudoko {

	
	public static void main(String[] args) {
		int sudokuTable[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
				{ 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		Sudoku sudoku = new Sudoku(sudokuTable);
		sudoku.solveSudokuProblem();
	}
	
	
	private int boardSize = 9 ;
	private int minNumber = 1 ;
	private int maxNumber = 9 ;
	private int boxSize = 3 ;
	
	private int[][] sudokuTable ;
	
	public Sudoko(int[][] sudokuTable) {
		this.sudokuTable = sudokuTable ;
	}
	
	public void solveSudokuProblem(){
		
		if(!solve(0, 0)){
			System.out.println("No feasible solution found...");
		}else{
			showResult() ;
		}
		
	}

	private boolean solve(int rowIndex, int columnIndex) {

		System.out.println("Before Called solve method: rowIndex=" + rowIndex
				+ " colIndex=" + columnIndex);

		if(rowIndex == boardSize && columnIndex == boardSize){
			System.out.println("Vegere ertunk");
			return true;
		}
		
		System.out.println("After Called solve method: rowIndex=" + rowIndex
				+ " colIndex=" + columnIndex);
		
		if(rowIndex == boardSize){
			System.out.println("Hop to next column, reinitialize rowIndex=0");
			rowIndex = 0;
		}
		
		if(sudokuTable[rowIndex][columnIndex]!=0){
			return solve(rowIndex + 1, columnIndex) ;
		}
		
		for(int numbers= minNumber; numbers<=maxNumber; numbers++){
			
			if(valid(rowIndex, columnIndex, numbers)){
				
				sudokuTable[rowIndex][columnIndex] = numbers ;
				
				if(solve(rowIndex+1, columnIndex)){
					return true; 
				}
				sudokuTable[rowIndex][columnIndex] = 0 ;
			}
			
			
		}
		
		
		return false;
	}

	private boolean valid(int rowIndex, int columnIndex, int actualNumber) {
		
		// if the given number is already in the row: the number cannot be part
		// of the solution
		
		for(int i=0; i<boardSize; i++){
			
			if(sudokuTable[i][rowIndex] == actualNumber){
				return false;
			}
		}
		
		// if the given number is already in the column: the number cannot be
		// part of the solution
		
		for(int k=0; k<boardSize; k++){
			if(sudokuTable[columnIndex][k] == actualNumber){
				return false ;
			}
		}
		
		// if the given number is already in the box: the number cannot be part
		// of the solution
		
		int boxRowOffset = (columnIndex / 3) * boxSize ;
		int boxColumnOffset = (rowIndex / 3) * boxSize ;
		
		for(int i=0; i<boxSize; i++){
			for(int j=0; j<boxSize; j++){
				
				if(actualNumber == sudokuTable[boxRowOffset + i][boxColumnOffset + j]){
					return false ;
				}
				
			}
			
		}
		
		return true ;
		
	}
	
	
	private void showResult() {

		for (int i = 0; i < boardSize; ++i) {

			if (i % 3 == 0)
				System.out.println(" ");

			for (int j = 0; j < boardSize; ++j) {

				if (j % 3 == 0)
					System.out.print(" ");
				System.out.print(sudokuTable[i][j] + " ");
			}

			System.out.println(" ");
		}
		
	}
	
}
