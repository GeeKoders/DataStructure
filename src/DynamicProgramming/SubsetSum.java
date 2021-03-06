package DynamicProgramming;

public class SubsetSum {

	public static void main(String[] args) {

		int []numbers = {5, 2, 3, 1} ;
		int sum = 9 ;
		
		SubsetSum subsetSum = new SubsetSum(numbers, sum) ;
		subsetSum.solve() ;
		subsetSum.showIntegers();
		
	}
	
	private boolean[][] dpTable ;
	private int [] S ;
	private int sum ;
	
	public SubsetSum(int []S, int sum) {
		this.S = S ;
		this.sum = sum ;
		this.dpTable = new boolean[S.length+1][sum+1] ;
	}
	
	public void solve(){
		
		//initialize
		for(int i=0; i<S.length+1; i++){
			dpTable[i][0] = true ;
		}
		
		for(int rowIndex = 1; rowIndex<S.length+1; rowIndex++){
			for(int columnIndex = 1; columnIndex < sum+1; columnIndex++){
				
				
				if(columnIndex < S[rowIndex - 1]){
					dpTable[rowIndex][columnIndex] = dpTable[rowIndex - 1][columnIndex] ;
				}else{
					
					if(dpTable[rowIndex - 1][columnIndex] == true){
						dpTable[rowIndex][columnIndex] = dpTable[rowIndex - 1][columnIndex] ;
					}else{
						dpTable[rowIndex][columnIndex] = dpTable[rowIndex-1][columnIndex-S[rowIndex -1]] ;
					}
					
				}
				
			}
		}
		System.out.println("Solution: " + dpTable[S.length][sum]);
	}
	
	
	public void showIntegers(){
		
		int colIndex = sum ;
		int rowIndex = S.length ;

		while(colIndex > 0 && rowIndex > 0){
			
			if(dpTable[rowIndex][colIndex] == dpTable[rowIndex - 1][colIndex]){
				rowIndex = rowIndex - 1 ;
			}else{
				System.out.println("We take: " + S[rowIndex - 1]);
				colIndex = colIndex - S[rowIndex - 1] ;
				rowIndex = rowIndex - 1 ; 
			}
			
		}
		
	}

}
