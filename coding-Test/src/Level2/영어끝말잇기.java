package Level2;

import java.util.ArrayList;

public class 영어끝말잇기 {
	 public int[] solution(int n, String[] words) {
	        int[] answer =new int[2];
	        ArrayList<String>arr=new ArrayList<String>();
	        String str=words[0];
	        arr.add(str);
	        for(int i=1;i<words.length;i++) {
	        	if(words[i].startsWith(""+str.charAt(str.length()-1))==false||arr.contains(words[i])||words[i].length()==1) {
	        		answer[0]=(i%n)+1;
	        		answer[1]=(i/n)+1;
	        		return answer;
	        	}
	        	arr.add(words[i]);
	        	str=words[i];
	        }
	        return answer;
	    }
}
