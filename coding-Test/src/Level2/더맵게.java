package Level2;

import java.util.PriorityQueue;

public class ´õ¸Ê°Ô {
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        for(int i=0;i<scoville.length;i++) {
        	queue.add(scoville[i]);
        }
        int count=0;
        while(!queue.isEmpty()&&queue.peek()<=K) {
        	int top=queue.poll();
        	if(queue.isEmpty()) {
        		return top>=K?count:-1;
        	}
        	int second=queue.poll();
        	queue.add(top+second*2);
        	count++;
        }
        
        return queue.poll()>=K?count:-1;
    }
}
