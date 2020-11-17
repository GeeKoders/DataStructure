package Practice.MazeSolver;

public class App {

	public static void main(String[] args) {

		FileReader fileReader = new FileReader("D:\\workspace\\DataStructure\\src\\Practice\\MazeSolver\\map.txt", 5, 5) ;
		fileReader.parseFile(); 
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMpa(), fileReader.getStartPositionCol(), fileReader.getStartPositionRow()) ;
		mazeSolver.findWayOut();
	}

}
