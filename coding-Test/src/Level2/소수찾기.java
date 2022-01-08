package Level2;

import java.util.ArrayList;
import java.util.Collections;

public class 소수찾기 {
	static int answer;
	static boolean[] visited;
	static ArrayList<Integer> numarr;
	public int solution(String numbers) {
        answer=0;
        visited=new boolean[numbers.length()];
        numarr=new ArrayList<Integer>();
        for(int i=1;i<=numbers.length();i++) {
        	search(numbers,"",i);
        }
        Collections.sort(numarr);
        int[] intarr=numarr.stream().mapToInt(Integer::intValue).toArray();
        find(intarr);
        
        return answer;
    }
	
	public static void search(String numbers,String temp,int idx) {
		
			if(temp.length()==idx) {
				if(!numarr.contains(Integer.valueOf(temp))) numarr.add(Integer.valueOf(temp));
					
				return ;
			}
			
			for(int i=0;i<numbers.length();i++) {
				if(visited[i]) continue;
				visited[i]=true;
				search(numbers,temp+numbers.charAt(i),idx);
				visited[i]=false;
			}
			
	}
	
	
	public static void find(int[] numarr) {
		for(int i=0;i<numarr.length;i++) {
			int num=numarr[i];
			System.out.println(num);
			if(num==0) continue;
			if(num==1) continue;
			for(int j=2;j<=Math.sqrt(num);j++) {
				if(num%j==0) return;
			}
			answer++;
		}
	}
	
}
