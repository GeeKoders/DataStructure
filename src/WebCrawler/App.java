package WebCrawler;

public class App {

	public static void main(String[] args) {
		
		String root = "https://www.google.com.tw/";		
		BFS bfs = new BFS();	
		bfs.discoverWeb(root);
		
	}
}
