package recursion;

public class TowerHanoi {

	public static void main(String[] args) {

		TowerHanoi towerHanoi = new TowerHanoi() ;
		towerHanoi.sovleHanoi(3, 'A', 'B', 'C');
	}
	
	public void sovleHanoi(int n, char rodFrom, char middleRod, char rodTo){
		
		if(n == 1){
			System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
			return ;
		}
		
		sovleHanoi(n-1, rodFrom, rodTo, middleRod) ;
		System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
		sovleHanoi(n-1, middleRod, rodFrom, rodTo);
		
	}

}
