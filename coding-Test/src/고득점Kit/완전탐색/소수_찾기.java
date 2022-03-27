package 고득점Kit.완전탐색;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 소수_찾기 {
	static boolean visited[];
	static Set<Integer> arr;
	static ArrayList<Integer >numarr;
	 public int solution(String numbers) {
	        int answer = 0;
	        visited=new boolean[numbers.length()];
	        arr=new HashSet<Integer>();
	        dfs(numbers,0,"");
	        numarr=new ArrayList<Integer>();
	        for(int m:arr) {
	        	numarr.add(m);
	        }
	        answer=find(numarr);
	        return answer;
	    }
	 public static void dfs(String numbers,int count,String str) {
		 if(count!=0) {
			 arr.add(Integer.parseInt(str));
			 
		 }
		 for(int i=0;i<numbers.length();i++) {
			 if(!visited[i]) {
				 visited[i]=true;
				 dfs(numbers,count+1,str+numbers.charAt(i));
				 visited[i]=false;
			 }
		 }
	 }
	 public static int  find(List<Integer> arr) {
		 int[] num=new int[10000001];
		 int count =0;
		 for(int i=2;i<=10000000;i++) num[i]=1;
		 
		 for(int i=2;i<=10000000;i++) {
			 if(num[i]==0)continue;
			 for(int j=2*i;j<=10000000;j+=i)num[j]=0;
		 }
		 
		 for(int i=0;i<arr.size();i++) {
			 if(num[arr.get(i)]!=0)count++;
		 }
		 return count;
	 }
}
