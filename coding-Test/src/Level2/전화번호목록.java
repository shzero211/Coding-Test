package Level2;

import java.util.ArrayList;
import java.util.Collections;

public class 전화번호목록 {
	public boolean solution(String[] phone_book) {
       ArrayList<String> arr=new ArrayList<String>();
       for(String s: phone_book) {
    	   arr.add(s);
       }
       Collections.sort(arr);
       for(int i=0;i<arr.size();i++) {
    	   System.out.println(arr.get(i));
       }
       for(int i=0;i<phone_book.length-1;i++) {
    	   if(arr.get(i+1).startsWith(arr.get(i))) {
    		   return false;
    	   }
       }
       return true;
    }
}
