package 고득점Kit.완전탐색;

import java.util.ArrayList;

public class 모의고사 {
	  public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[][] human= {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
	        int[] count=new int[3];
	        int max=0;
	        for(int i=0;i<3;i++) {
	        	
	        	for(int j=0;j<answers.length;j++) {
	        		if(answers[j]==human[i][j%human[i].length]) {
	        			count[i]++;
	        		}
	        	}
	        	if(max<count[i]) {
	        		max=count[i];
	        	}
	        }
	        ArrayList<Integer> arr=new ArrayList<Integer>();
	        for(int i=0;i<count.length;i++) {
	        	if(max==count[i]) {
	        		arr.add(i+1);
	        	}
	        }
	        return arr.stream().mapToInt(Integer::intValue).toArray();
	    }
}
