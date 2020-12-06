package Practice.Recursion;

public class TowersOfHanoi {


	public static void main(String[] args) {
		
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi() ;
		towersOfHanoi.solveHanoi(3, 'A', 'B', 'C');
	}
	
	
	public void solveHanoi(int n, char rodFrom, char middleRod, char rodTo){
		
		// move the smallest one to the destination
		if(n == 1){
			System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
			return ;
		}
		
		solveHanoi(n-1, rodFrom, rodTo, middleRod) ;
		System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
		solveHanoi(n-1, middleRod, rodFrom, rodTo) ;
		
	}
	
	
}
