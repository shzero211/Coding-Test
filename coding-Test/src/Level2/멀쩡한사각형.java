package Level2;

public class �����ѻ簢�� {
	//�ϳ��� �����̶�� �����ϱ� 
	 public long solution(int w, int h) {
	        long answer = 0;
	        for(int i=0;i<w;i++) {
	        	answer+=w*i/h;
	        }
	        return answer*2;
	    }

}
