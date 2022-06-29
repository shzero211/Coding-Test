package Fighting_Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;
//문제핵심
//자료구조만드는거
public class 신고결과받기 {
	 public int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int[id_list.length];
	        Map<String,HashSet<String>> map=new HashMap<>();
	        Map<String,Integer> illegal=new HashMap<>();
	        for(int i=0;i<id_list.length;i++) {
	        	map.put(id_list[i],new HashSet<>());
	        	illegal.put(id_list[i],0);
	        }
	        for(int i=0;i<report.length;i++) {
	        	String[] repo=report[i].split(" ");
	        	if(!map.get(repo[0]).contains(repo[1])) {
	        		map.get(repo[0]).add(repo[1]);
		        	illegal.put(repo[1],illegal.get(repo[1])+1);
	        	}
	        }
	        
	       for(int i=0;i<id_list.length;i++) {
	    	   int cnt=0;
	    	  for(String str:map.get(id_list[i])) {
	    		  if(illegal.get(str)>=k)cnt++;
	    	  }
	    	  answer[i]=cnt;
	       }
	        return answer;
	    }
}
