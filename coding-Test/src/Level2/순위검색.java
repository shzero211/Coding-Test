package Level2;

public class 순위검색 {
	 public int[] solution(String[] info, String[] query) {
		 //쿼리들의기준보다 높은점수를 얻은 사람들의수를 저장
	        int[] answer =new int[query.length];
	        int count=0;
	        
	        //기준
	        for(int i=0;i<query.length;i++) {
	        	// and를 없애주고 공백을 기준으로 문자배열을 생성
	        	String[] a=query[i].replace(" and","").split(" ");
	        	
	        	//테스트받은사람
	        	for(int j=0;j<info.length;j++){
	        		
	        	//공백을 기준으로 문자배열 생성
	        	String[] b=info[j].split(" ");
	        	
	        	//점수전의 기준에 부합하는지
	        	for(int k=0;k<4;k++) {
	        		if(!a[k].equals(b[k])) {
		        		if(!a[k].equals("-")) {
		        			break;
		        		}
		        	}
	        		count++;
	        	}
	        	//점수가 이상이면
	        	if(Integer.valueOf(b[4])>=Integer.valueOf(a[4])) {
	        		count++;
	        	}
	        	//모두만족하면 
	        	if(count==5)answer[i]++;
	        	count=0;
       }
	        	
	        }
	        return answer;
	    }
}
