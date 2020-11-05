package Practice.String;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {
	
	public static void main(String[] args) {
		
		StringOperations so = new StringOperations() ;
		
//		List<String> result = so.getPrefixes("house") ;
		
//		List<String> result = so.getSuffixes("house") ;
//		
//		for(String item: result){
//			System.out.println(item);
//		}
		
		
		System.out.println(so.longestCommonPrefix("Hello", "He"));
		
	}
	
	public List<String> getPrefixes(String text){
		
		List<String> list = new ArrayList<>() ;
		
		for(int index=0;index<text.length();index++){
			list.add(text.substring(0, index+1)) ;
		}
		return list ;
		
	}
	
	public List<String> getSuffixes(String text){
		
		List<String> list = new ArrayList<>() ;
		
		for(int index=0;index<text.length();index++){
			list.add(text.substring(index, text.length())) ;
		}
		return list ;
	}
	
	public String longestCommonPrefix(String text1, String text2){
		
		int commonLength = Math.min(text1.length(), text2.length()) ;
		
		for(int index=0; index < commonLength; index++){
			
			if(text1.charAt(index) != text2.charAt(index)){
				return text2.substring(0, index) ;
			}
			
		}
		
		return text2.substring(0, commonLength) ;
		
		
	}
	
	
	
}
