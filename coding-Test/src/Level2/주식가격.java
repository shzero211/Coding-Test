package Level2;

public class 주식가격 {
	  public int[] solution(int[] prices) {
	        int[] answer =new int[prices.length];
	        for(int i=0;i<prices.length-1;i++) {
	        	int num=i;
	        	int ans=0;
	        	while(true) {
	        		
	        		
	        		num++;
	        		ans++;
	        		if(num==prices.length||prices[num-1]<prices[i]) {
	        			
	        			answer[i]=ans-1;
	        			break;
	        			
	        		}
	        	}
	        }
	        return answer;
	    }
}
