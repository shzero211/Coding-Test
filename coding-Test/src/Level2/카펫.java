package Level2;

public class Ä«Æê {
	public int[] solution(int brown, int yellow) {
		int num=brown+yellow;
		int[] answer=new int[2];
		for(int i=3;i<num;i++) {
			if(num%i==0&&num/i<=i) {
				int col=num/i;
				int row=i;
				if((col-2)*(row-2)==yellow) {
					answer[0]=row;
					answer[1]=col;
					return answer;
				}
				
			}
		}
		return null;
	}
}
