package kdt;

import java.util.LinkedList;

import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


public class pro2 {
	static Stack<String> stk;
	static Queue<String> que;
	 public String[] solution(String[] records) {
		 stk=new Stack<String>();
		 que=new LinkedList<String>();
	        for(int i=0;i<records.length;i++) {
	        	String str=records[i];
	        	stk.add(str);
	        	if(i!=0)
	        		check(str);
	        }

			return records;
	    }
	 public static void check(String str) {
		 	
		 if(str.contains("share")) {
			 String[] strar=str.split(" ");
			 if(stk.peek().contains("share")) {
				 
				 String[] arr=stk.peek().split(" ");
				 int num=Integer.parseInt(arr[2]);
				 String n;
				 if(num>=2&&num<=100) {
					n=arr[0]+" "+arr[1]+" "+String.valueOf(num+1)+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6];
				 }else if(arr[2]!="your") {
					n=arr[0]+" "+arr[1]+" "+"2"+" "+"others"+" "+arr[3]+" "+arr[4]+" "+arr[5];
				 }else {
					n=arr[0]+" "+"and"+" "+strar[0]+" "+arr[1]+" "+arr[2]+" "+arr[3];
				 }
				 stk.pop();
				 stk.add(n);
				 return;
			 }
			 String n=strar[0]+" "+"shared"+" "+"your"+" "+"post";
			stk.add(n);
		 }else if(str.contains("comment")) {
			 String[] strar=str.split(" ");
			 if(stk.peek().contains("comment")) {
				 
				 String[] arr=stk.peek().split(" ");
				 int num=Integer.parseInt(arr[2]);
				 String n;
				 if(num>=2&&num<=100) {
					n=arr[0]+" "+arr[1]+" "+String.valueOf(num+1)+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7];
				 }else if(arr[2]!="on") {
					n=arr[0]+" "+arr[1]+" "+"2"+" "+"others"+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6];
				 }else {
					n=arr[0]+" "+"and"+" "+strar[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4];
				 }
				 stk.pop();
				 stk.add(n);
				 return;
			 }
			 String n=strar[0]+" "+"commented"+" "+"on"+" "+"your"+" "+"post";
			stk.add(n);
		 }else if(str.contains("notification")) {
			 que.add(stk.pop());
		 }
		 return ;
	 }
}
