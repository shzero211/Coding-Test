package Level2;
import java.util.*;
public class ½Å°í {
  	 public int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int [id_list.length];
	        Map<String,Set<String>> map=new HashMap<String,Set<String>>();
	        Map<String,Integer> arr=new HashMap<String,Integer>();
	        
	        for(String id:id_list) {
	        	arr.put(id, 0);
	        	map.put(id, new HashSet<String>());
	        }
	        
	        for(String cur:report) {
	        	String[] v=cur.split(" ");
	        	if(map.get(v[0]).add(v[1])) {
	        		arr.put(v[1], arr.get(v[1])+1);
	        	}
	        }
	        for(String cur:report) {
	        	String[] v=cur.split(" ");
	        	if(arr.get(v[1])<k) 
	        		map.get(v[0]).remove(v[1]);
	        }
	        for(int i=0;i<id_list.length;i++) {
	        	answer[i]=map.get(id_list[i]).size();
	        }
	        return answer;
	    }
}
