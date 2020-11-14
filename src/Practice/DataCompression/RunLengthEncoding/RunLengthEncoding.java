package Practice.DataCompression.RunLengthEncoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunLengthEncoding {

	public static void main(String[] args) {

		RunLengthEncoding rle = new RunLengthEncoding() ;
//		System.out.println(rle.encode("AAABB"));
		System.out.println(rle.decode("4A3B2C"));
		
	}
	
	public String encode(String text){
		
		StringBuilder sb = new StringBuilder() ;

		for(int index=0; index<text.length(); index++){
			
			int runLength = 1 ;
			
			
			while(index+1 < text.length() && text.charAt(index) == text.charAt(index + 1)){
				runLength ++ ;
				index++ ;
			}
			
			sb.append(runLength) ;
			sb.append(text.charAt(index)) ;
			
		}
		
		return sb.toString() ;
	}
	
	public static String decode(String compressText) {
		// non thread-safe
		StringBuilder stringBuilder = new StringBuilder();

		Pattern pattern = Pattern.compile("[0-9]+|[a-zA-z]");
		Matcher matcher = pattern.matcher(compressText);

		while (matcher.find()) {

			int runLength = Integer.parseInt(matcher.group());
			System.out.println("group:" + matcher.group());
			matcher.find();

			while (runLength-- != 0) {
				stringBuilder.append(matcher.group()); // 4A -> AAAA
			}

		}

		return stringBuilder.toString();

	}

}
