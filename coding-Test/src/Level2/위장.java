package Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ¿ß¿Â {
	 public int solution(String[][] clothes) {
		 int answer=1;
			Map<String,Integer> map=new HashMap<String, Integer>();
			for(String[] s:clothes) {
				map.put(s[1],map.getOrDefault(s[1],0)+1);
			}
			for(String s:map.keySet()) {
				answer*=map.get(s)+1;
			}
			return answer-1;
		  }

}
