package Level2;

public class 큰수만들기 {
	    public String solution(String number, int k) {
	    	int idx=0;
	    	int comp=0;
	    	StringBuilder sb=new StringBuilder();
	    	for(int i=0;i<number.length()-k;i++) {
	    		comp=0;
	    		for(int j=idx;j<=i+k;j++) {
	    			if(comp<number.charAt(j)-'0') {
	    				comp=number.charAt(j)-'0';
	    				idx=j+1;
	    			}
	    		}
	    		sb.append(comp);
	    	}
	        
	        return sb.toString();
	    }
}
