package Level2;

public class 멀쩡한사각형 {
	//하나의 직선이라고 생각하기 
	 public long solution(int w, int h) {
	        long answer = 0;
	        for(int i=0;i<w;i++) {
	        	answer+=w*i/h;
	        }
	        return answer*2;
	    }

}
