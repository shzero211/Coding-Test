package �����Kit.��;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ��ũ_��Ʈ�ѷ� {
	public int solution(int[][] jobs) {
        int answer = 0;
        int end=0;
        int jobsIdx=0;
        int count=0;
        Arrays.sort(jobs,(k1,k2)->k1[0]-k2[0]);
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>((k1,k2)->k1[1]-k2[1]);
        while(count<jobs.length) {
        	while(jobsIdx<jobs.length&&jobs[jobsIdx][0]<=end) {
        		pq.add(jobs[jobsIdx++]);
        	}
        	if(pq.isEmpty()) {
        		end=jobs[jobsIdx][0];
        	}else {
        		int[] temp=pq.poll();
        		answer+=end-temp[0]+temp[1];
        		end+=temp[1];
        		count++;
        	}
        }
        
        return (int)Math.floor(answer/jobs.length);
    }
}
