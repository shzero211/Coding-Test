package Level2;

import java.util.*;
//이문제 핵심은 스택에 남은 기간을 넣는것
class Solution {
   	public int[] solution(int[] progresses, int[] speeds) {
		
       Stack<Integer> s=new Stack<Integer>();
       for(int i=progresses.length-1;i>=0;i--) {
    	   
    	   s.add((100-progresses[i])/speeds[i]+((100-progresses[i])%speeds[i]>0?1:0));
       }
       ArrayList<Integer> arr=new ArrayList<Integer>();
       while(!s.isEmpty()) {
    	   int top=s.pop();
    	   int count=1;
    	   while(!s.isEmpty()&&s.peek()<=top) {
    		count++;
    		s.pop();
    	   }
    	   arr.add(count);
       }
       int[] answer=new int[arr.size()];
       for(int i=0;i<arr.size();i++) {
    	   answer[i]=arr.get(i);
       }
       return answer;
    }
}