package 고득점Kit.해쉬;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
	public int solution(String[][] clothes) {
		 int answer = 0;
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<clothes.length;i++) {
			map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
		}
		
		for(Map.Entry<String,Integer>cloth:map.entrySet()) {
			answer+=cloth.getValue();
		}
		
       
        return answer;
    }
}
