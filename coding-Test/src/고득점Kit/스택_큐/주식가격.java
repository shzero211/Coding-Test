package �����Kit.����_ť;

import java.util.ArrayList;

public class �ֽİ��� {
	 public int[] solution(int[] prices) {
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 	for(int i=0;i<prices.length;i++) {
		 		int len=i+1;
		 		int count=0;
		 		while(len<prices.length) {
		 			if(prices[len]>=prices[i]) {
		 				len++;
			 			count++;
			 			
		 			}else {
		 				count++;
		 				break;
		 			}
		 			
		 			
		 		}
		 		arr.add(count);
		 		
		 	}
	        
	        return arr.stream().mapToInt(Integer::intValue).toArray();
	    }
}
