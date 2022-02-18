package Level1;
import java.util.*;
public class ½Å°í {
  	 public int[] solution(String[] id_list, String[] report, int k) {
  		 int[] answer=new int[id_list.length];
  		 Map<String,Set<String>> m=new HashMap<String,Set<String>>();
  		 Map<String,Integer> m2=new HashMap<String, Integer>();
  		 for(String s:id_list) {
  			 m.put(s,new HashSet<String>());
  			 m2.put(s,0);
  		 }
  		 for(String s:report) {
  			 String[]v=s.split(" ");
  			 if(m.get(v[0]).add(v[1])) {
  				m2.put(v[1],m2.get(v[1])+1);
  			 }
  			 
  		 }
  		 for(String s:report) {
  			 String[] v=s.split(" ");
  			 if(m2.get(v[1])<k) {
  				 m.get(v[0]).remove(v[1]);
  			 }
  		 }
  		 for(int i=0;i<id_list.length;i++) {
  			 answer[i]=m.get(id_list[i]).size();
  		 }
  		 return answer;
	    }
}
