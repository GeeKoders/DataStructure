package Practice.DataCompression.RunLengthEncoding;

public class RunLengthEncoding {

	public static void main(String[] args) {

		RunLengthEncoding rle = new RunLengthEncoding() ;
		System.out.println(rle.encode("AAABB"));
		
		
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

}
