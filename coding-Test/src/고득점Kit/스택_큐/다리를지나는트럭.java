package 고득점Kit.스택_큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	 public int solution(int bridge_length, int weight, int[] truck_weights) {
	     Queue<Integer> numarr=new LinkedList<Integer>();
	     Queue<Integer> bridge=new LinkedList<Integer>();
	     Queue<Integer> location=new LinkedList<Integer>();
	     int answer = 0;
	     
	     for(int num:truck_weights) {
	    	 numarr.add(num);
	     }
	     
	     for(int i=0;i<bridge_length;i++) {
	    	 bridge.add(0);
	     }
	     
	     int sum=0;
	     int time=0;
	     
	     while(!numarr.isEmpty()) {
	    	 for(int num:bridge) {
	    		 if(num!=0)sum+=num;
	    	 }
	    	 if(sum+numarr.peek()-bridge.peek()<=weight&&!numarr.isEmpty()) {
	    		 bridge.poll();
	    		 System.out.println(numarr.peek());
	    		 bridge.add(numarr.poll());
	    		 
	    	 }else {
	    		 bridge.poll();
	    		 bridge.add(0);
	    	 }
	    	 time++;
	    	 System.out.println(time);
	    	 sum=0;
	     }
	   
		
	        
	        return time+=bridge_length;
	    }
}
