package DynamicProgramming;

public class Knapsack {

	public static void main(String[] args) {

		int numOfitems = 3 ;
		int capacityOfKnapsack = 5 ;
		
		//int[] weightOfItems = {4, 2, 3} ;
		//int[] profitOfItems = {10, 4, 7} ;
		
		int []weightOfitems = new int[numOfitems + 1] ;
		weightOfitems[1] = 4 ;
		weightOfitems[2] = 2 ; 
		weightOfitems[3] = 3 ;
		
		int []profitOfItems = new int[capacityOfKnapsack + 1] ;
		profitOfItems[1] = 10 ;
		profitOfItems[2] = 4 ;
		profitOfItems[3] = 7 ;
		
		Knapsack knapsack = new Knapsack(numOfitems, capacityOfKnapsack, weightOfitems, profitOfItems) ;
		knapsack.solve();
		knapsack.showResault(); 
		
	}

	private int numOfitems;

	private int capacityOfKnapsack;

	private int[][] knapsackTable;

	private int totalBenefit;

	private int[] weights;

	private int[] values;

	public Knapsack(int numOfitems, int capacityOfKnapsack, int[] weights,
			int[] values) {
		this.numOfitems = numOfitems;
		this.capacityOfKnapsack = capacityOfKnapsack;
		this.weights = weights;
		this.values = values;
		this.knapsackTable = new int[numOfitems + 1][capacityOfKnapsack + 1];
	}

	public void solve() {

		// time complexity: O(N*W)
		for (int i = 1; i < numOfitems + 1; i++) {
			for (int w = 1; w < capacityOfKnapsack + 1; w++) {

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
		totalBenefit = knapsackTable[numOfitems][capacityOfKnapsack];
	}

	public void showResault() {

		System.out.println("Total benefit: " + totalBenefit);

		for (int n = numOfitems, w = capacityOfKnapsack; n > 0; n--) {

			if (knapsackTable[n][w] != 0
					&& knapsackTable[n][w] != knapsackTable[n - 1][w]) {
				System.out.println("We take item: #" + n);
				w = w - weights[n];
			}
		}

	}

}
