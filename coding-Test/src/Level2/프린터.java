package Level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class «¡∏∞≈Õ {
	 public int solution(int[] priorities, int location) {
		 int answer=0;
	       PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
	       
	       for(int i=0;i<priorities.length;i++) {
	    	   pq.add(priorities[i]);
	       }
	       
	       while(!pq.isEmpty()) {
	    	   for(int i=0;i<priorities.length;i++) {
	    		   if(priorities[i]==pq.peek()) {
	    			   if(i==location) {
	    				   answer++;
	    				   return answer;
	    			   }else {
	    				   pq.poll();
	    				   answer++;
	    				   
	    			   }
	    		   }
	    	   }
	       }
	        return answer;
	    }
}
