package Level2;

import java.util.Arrays;

public class H_index {
	  public int solution(int[] citations) {
	        Arrays.sort(citations);
	        int h=0;
	        int answer=0;
	        for(int i=0;i<citations.length;i++) {
	        	h=citations.length-i;
	        	if(citations[i]>=h) {
	        		answer=h;
	        		break;
	        		
	        	}
	        }
	        return answer;
	    }
}
