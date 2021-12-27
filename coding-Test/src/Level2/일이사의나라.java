package Level2;

public class 일이사의나라 {
	  public String solution(int n) {
	        String answer = "";
	        String[] str= {"4","1","2"};
	       while(n>0) {
	    	   
	    	  int remain=n%3;
	    	  n/=3;
	    	  if(n%3==0) n--;
	    	  
	    	  
	    	  answer=str[remain]+answer; 
	       }
	        return answer;
	    }
}
