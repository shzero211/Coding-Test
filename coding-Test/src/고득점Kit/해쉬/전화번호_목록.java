package �����Kit.�ؽ�;

import java.util.HashMap;
import java.util.Map;

public class ��ȭ��ȣ_��� {
	 public boolean solution(String[] phone_book) {
	       Map<String,Integer>map=new HashMap<String,Integer>();
		 for(String str:phone_book) {
	    	  map.put(str,0);
	       }
		 //�ٽ�:���ڿ�����,���ξ�,�ؽ����
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
