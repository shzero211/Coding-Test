package Level2;

import java.util.ArrayList;
import java.util.Collections;

public class 뉴스클러스트링 {
public int solution(String str1,String str2) {
	ArrayList<String> multiSet1=new ArrayList<String>();
	ArrayList<String> multiSet2=new ArrayList<String>();
	ArrayList<String> union=new ArrayList<String>();
	ArrayList<String> intersection=new ArrayList<String>();
	
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	
	for(int i=0;i<str1.length()-1;i++) {
		char first=str1.charAt(i);
		char second=str1.charAt(i+1);
		if(first>='a'&&first<='z'&&second>='a'&&second<='z') {
			
			multiSet1.add(first+""+second);
		}
		
	}
	
	for(int i=0;i<str2.length()-1;i++) {
		char first=str2.charAt(i);
		char second=str2.charAt(i+1);
		if(first>='a'&&first<='z'&&second>='a'&&second<='z') {
			
			multiSet2.add(first+""+second);
		}
	}
	Collections.sort(multiSet1);
	Collections.sort(multiSet2);
	
	for(String s:multiSet1) {
		if(multiSet2.remove(s)) {
			intersection.add(s);
		}
		union.add(s);
	}
	for(String s:multiSet2) {
		union.add(s);
	}
	
	if(union.size()==0) {
		return 1*65536;
	}else {
		return (int)(((double)intersection.size()/(double)union.size())*65536);
	}
	}
}
