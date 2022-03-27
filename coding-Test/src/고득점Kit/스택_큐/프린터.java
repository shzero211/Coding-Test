package 고득점Kit.스택_큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;import kdt.pro1;

public class 프린터 {
	class box{
		int location;
		int priority;
		box(int location,int priority){
			this.location=location;
			this.priority=priority;
		}
	}
	public int solution(int[] priorities, int location) {
       Queue<box> q=new LinkedList<box>();
       for(int i=0;i<priorities.length;i++) {
    	   q.add(new box(i, priorities[i]));
       }
       int answer=1;
       while(!q.isEmpty()) {
    	   box b=q.poll();
    	   boolean flag=false;
    	   for(box br:q) {
    		   if(b.priority<br.priority) {
    			   flag=true;
    		   }
    	   }
    	   if(flag) {
    		   q.add(b);
    	   }else {
    		   
    		   if(b.location==location) {
    			   return answer;
    		   }
    		   answer++;
    	   }
       }
       return answer;
    }
}
