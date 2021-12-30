package Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class �޴������� {
	
	//hashmap ����ϰ� �ִ밪�� ���� priority queue�� ���� �ϴ°� �߿� 
	//������ �����ϱ����ؼ� for(int i=idx;i<length;i++)�߿�
	static HashMap<String,Integer> map;
	static int max;
	  public String[] solution(String[] orders, int[] course) {
		  	PriorityQueue<String> pq=new PriorityQueue<String>();
		  	
	        for(int i=0;i<course.length;i++) {
	        	map=new HashMap<String, Integer>();
	        	max=0;
	        	for(int j=0;j<orders.length;j++) {
	        		find(0,"",0,course[i],orders[j]);
	        	}
	        	for(String s:map.keySet()) {
	        		if(map.get(s)==max&&max>1) {
	        			pq.offer(s);
	        		}
	        	}
	        	
	        }
	        String answer[]=new String[pq.size()];
	        int k=0;
	        while(!pq.isEmpty()) {
	        	answer[k++]=pq.poll();
	        }
	        
	        return answer;
	    }
	  public static void find(int cnt,String str,int idx,int target,String word) {
		  if(cnt==target) {
			  char[] c=str.toCharArray();
			  Arrays.sort(c);
			  String temp="";
			  for(int i=0;i<c.length;i++)temp+=c[i];
			  map.put(temp,map.getOrDefault(temp,0)+1);
			  max=Math.max(max, map.get(temp));
			  return;
		  }
		  
		  for(int i=idx;i<word.length();i++) {
			  find(cnt+1, str+word.charAt(i),i+1, target, word);
			  
		  }
	  }
	  
	  

}
