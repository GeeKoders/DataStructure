package Practice.DataCompression.LZW;

import java.util.List;

public class App {

	public static void main(String[] args) {

		LZW lzw = new LZW() ;
		
		List<Integer> compressedSting = lzw.compress("CARRARCARCAR") ;
		System.out.println(compressedSting);
	}

}
