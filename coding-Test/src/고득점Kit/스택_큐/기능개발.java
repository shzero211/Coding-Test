package 고득점Kit.스택_큐;

import java.util.ArrayList;
import java.util.Stack;

public class 기능개발 {
	 public int[] solution(int[] progresses, int[] speeds) {
		 Stack<Integer> s=new Stack<Integer>();
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 for(int i=progresses.length-1;i>=0;i--) {
			 s.add((100-progresses[i])/speeds[i]+((100-progresses[i])%speeds[i]>0?1:0));
			 
		 }
		 
		 while(!s.isEmpty()) {
			 int m=s.pop();
			 int count=1;
			 while(!s.isEmpty()&&m>=s.peek()) {
				 count++;
				 s.pop();
			 }
			 arr.add(count);
			
		 }
		 
		 
	        
	        return arr.stream().mapToInt(Integer::intValue).toArray();
	    }
}
