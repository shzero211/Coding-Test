package °íµæÁ¡Kit.Èü;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ´õ_¸Ê°Ô {
	 public int solution(int[] scoville, int K) {
		 PriorityQueue<Integer>arr=new PriorityQueue<Integer>();
		 int answer = 0;
		 for(int i=0;i<scoville.length;i++) {
			 arr.add(scoville[i]);
		 }
		 int i=0;
		 while(arr.peek()<K) {
			 if(arr.size()>=2) {
				 int num=arr.poll()+(arr.poll()*2);
				 arr.add(num);
				 answer++;
			 }else {
				 break;
			 }
			
		 }
		 
	        
	        
	        return arr.peek()>=K?answer:-1;
	    }
}
