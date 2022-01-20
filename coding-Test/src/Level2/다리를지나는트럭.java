package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	 public int solution(int bridge_length, int weight, int[] truck_weights) {
	        int answer = 0;
	        int sum=0;
	        int time=0;
	        Queue<Integer> q=new LinkedList<Integer>();
	        for(int i=0;i<truck_weights.length;i++) {
	        	int temp=truck_weights[i];
	        	while(true) {
	        		
	        		if(q.size()==bridge_length) {

	        			sum-=q.poll();
	        		}
	        		
	        		if(q.isEmpty()) {
	        			q.add(temp);
	        			sum+=temp;
	        			time++;
	        			break;
	        		}else {
	        			if(sum+temp<=weight) {
	        				q.add(temp);
	        				sum+=temp;
	        				time++;
	        				break;
	        			}else {
	        				q.add(0);
	        				time++;
	        			}
	        		}
	        	}
	        }
	        return answer+bridge_length;
	    }
}
