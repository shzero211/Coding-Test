package 고득점Kit.그리드;

public class 조이스틱 {
	 public int solution(String name) {
	        int answer=0;
	        int len=name.length();
	        int min=len-1;
	        for(int i=0;i<len;i++) {
	        	char c=name.charAt(i);
	        	int m=(c-'A'<'Z'-c+1?c-'A':'Z'-c+1);
	        	
	        	answer+=m;
	        	
	        	int nextIdx=i+1;
	        	while(nextIdx<len&&name.charAt(nextIdx)=='A')
	        		nextIdx++;
	        	min=Math.min(min,(i*2)+len-nextIdx);
	        	 min=Math.min(min,(len-nextIdx)*2+i);
	        }
	        answer+=min;
	        return answer;
	    }
}
