package 고득점Kit.해쉬;

import java.util.HashMap;
import java.util.Map;

public class 전화번호_목록 {
	 public boolean solution(String[] phone_book) {
	       Map<String,Integer>map=new HashMap<String,Integer>();
		 for(String str:phone_book) {
	    	  map.put(str,0);
	       }
		 //핵심:문자열길이,접두어,해쉬사용
		 for(int i=0;i<phone_book.length;i++) {
			 for(int j=0;j<phone_book[i].length();j++) {
				 
				 if(map.containsKey(phone_book[i].substring(0,j))) {
					 
					 return false;
				 }
			 }
		 }
		 return true;
		 
	    }
}
