package Practice.DynamicProgramming;

public class Knapsack {
	
	
	public static void main(String[] args) {
		
		int numOfItems = 3 ;
		int capacityOfKnapsack = 5 ;
		
		int[] weightOfitems = new int[numOfItems + 1] ;
		weightOfitems[1] = 4 ;
		weightOfitems[2] = 2 ;
		weightOfitems[3] = 3 ;
		
		int[]profitOfItems = new int[capacityOfKnapsack + 1] ;
		profitOfItems[1] = 10 ;
		profitOfItems[2] = 4 ;
		profitOfItems[3] = 7 ;
		
		Knapsack knapsack = new Knapsack(numOfItems, capacityOfKnapsack, weightOfitems, profitOfItems) ;
		knapsack.solve();
		knapsack.showResult();
	}

	
	private int numOfItems ;
	
	private int capacityOfKnapack ;
	
	private int[][] knapsackTable ;
	
	private int totalBenefit ;
	
	private int[] weights ;
	
	private int[] values ;
	
	public Knapsack(int numOfItems, int capacityOfKnapack, int []weights, int []values) {
		this.numOfItems = numOfItems ;
		this.capacityOfKnapack = capacityOfKnapack ;
		this.weights = weights ;
		this.values = values ;
		this.knapsackTable = new int[numOfItems+1][capacityOfKnapack+1] ;
	}
	
	public void solve(){
		
		//time complexity: O(N*W)
		for (int i = 1; i < numOfItems + 1; i++) {
			for (int w = 1; w < capacityOfKnapack + 1; w++) {

				int notTakingItem = knapsackTable[i - 1][w]; // not taking item
																// i
				int takingItem = 0;

				if (weights[i] <= w) {
					takingItem = values[i]
							+ knapsackTable[i - 1][w - weights[i]];
				}
				knapsackTable[i][w] = Math.max(notTakingItem, takingItem);
			}
		}
		totalBenefit = knapsackTable[numOfItems][capacityOfKnapack];
		
	}
	
	public void showResult(){
		
		System.out.println("Total benefit: " + totalBenefit);

		for (int n = numOfItems, w = capacityOfKnapack; n > 0; n--) {

			if (knapsackTable[n][w] != 0
					&& knapsackTable[n][w] != knapsackTable[n - 1][w]) {
				System.out.println("We take item: #" + n);
				w = w - weights[n];
			}
		}
	}
	
	
}
