package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 순위검색_다른사람풀이 {
	
	//모든경우의수에 따른 학생의 점수를 담을 hashmap
	static HashMap<String,ArrayList<Integer>> map;
	
	 public int[] solution(String[] info, String[] query) {
		 
	        int[] answer =new int[query.length];
	        map=new HashMap<String,ArrayList<Integer>>();
	        
	        
	        for(String s:info){
	        	String[] arr=s.split(" ");
	        	//모든경우의 수를 조합하고 테스트점수를 넣어주는 함수실행 
	        	comb("",0,arr);
	        }
	        
	        for(String key:map.keySet()) {
	        	Collections.sort(map.get(key));
	        }
	        int queryIdx=0;
	        for(String s:query) {
	        	String str=s.replace(" and ", "");
	        	String[] tmp=str.split(" ");
	        	answer[queryIdx++]=binarySearch(tmp[0],Integer.parseInt(tmp[1]));
	        }
	        return answer;
	    }
	 

//s는 경우를 저장하고 idx는 테스트점수전까지 입려받았는지 확인하고 arr는 info 내용을 자른 문자 배열을 저장
	public static void comb(String s,int idx,String[] arr) {
		 if(idx==4) {
			 int score=Integer.parseInt(arr[4]);
			 //키값이 이미존재하면
			 if(map.containsKey(s)) map.get(s).add(score);
			 else {
				 //새 리스트 만들어서 값을 추가해서 삽입
				 ArrayList<Integer> list=new ArrayList<Integer>();
				 list.add(score);
				 map.put(s,list);
			 }
			 return;
			 
		 }
		 //모든경우를 재귀
		 comb(s+"-",idx+1,arr);
		 comb(s+arr[idx],idx+1,arr);
	 }
	//이분탐색을 통해 start의 위치를 찾고 전체 배열길이에서 빼주면 인원수가 나온다
	//이분탐색은 mid 를 기준으로 start,end를 줄이거나 늘려서 특정 기준에 맞는 숫자를 찾아가는 방식
	 public static int binarySearch(String s, int score) {
		 if(!map.containsKey(s)) return 0;
		 ArrayList<Integer> arr=map.get(s);
		int start=0;
		int end=arr.size()-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr.get(mid)<score) start=mid+1;
			else end=mid-1;
		}
		return arr.size()-start;
	}
}
