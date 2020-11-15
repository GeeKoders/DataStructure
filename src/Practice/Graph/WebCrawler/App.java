package Practice.Graph.WebCrawler;

public class App {

	public static void main(String[] args) {
		String root = "https://www.google.com" ;
		WebCrawler webCrawler = new WebCrawler() ;
		webCrawler.discoverWeb(root);
	}

}
