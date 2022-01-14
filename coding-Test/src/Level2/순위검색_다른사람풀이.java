package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class �����˻�_�ٸ����Ǯ�� {
	
	//������Ǽ��� ���� �л��� ������ ���� hashmap
	static HashMap<String,ArrayList<Integer>> map;
	
	 public int[] solution(String[] info, String[] query) {
		 
	        int[] answer =new int[query.length];
	        map=new HashMap<String,ArrayList<Integer>>();
	        
	        
	        for(String s:info){
	        	String[] arr=s.split(" ");
	        	//������� ���� �����ϰ� �׽�Ʈ������ �־��ִ� �Լ����� 
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
	 

//s�� ��츦 �����ϰ� idx�� �׽�Ʈ���������� �Է��޾Ҵ��� Ȯ���ϰ� arr�� info ������ �ڸ� ���� �迭�� ����
	public static void comb(String s,int idx,String[] arr) {
		 if(idx==4) {
			 int score=Integer.parseInt(arr[4]);
			 //Ű���� �̹������ϸ�
			 if(map.containsKey(s)) map.get(s).add(score);
			 else {
				 //�� ����Ʈ ���� ���� �߰��ؼ� ����
				 ArrayList<Integer> list=new ArrayList<Integer>();
				 list.add(score);
				 map.put(s,list);
			 }
			 return;
			 
		 }
		 //����츦 ���
		 comb(s+"-",idx+1,arr);
		 comb(s+arr[idx],idx+1,arr);
	 }
	//�̺�Ž���� ���� start�� ��ġ�� ã�� ��ü �迭���̿��� ���ָ� �ο����� ���´�
	//�̺�Ž���� mid �� �������� start,end�� ���̰ų� �÷��� Ư�� ���ؿ� �´� ���ڸ� ã�ư��� ���
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
