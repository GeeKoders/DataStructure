package MazeSolver;

public class App {

	public static void main(String[] args) {
		
		FileReader fileReader = new FileReader("D:\\workspace\\DataStructure\\src\\MazeSolver\\map.txt", 5, 5);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartPositionRow(),fileReader.getStartPositionCol());
		mazeSolver.findWayOut();
		
	}
}