package Level2;

import java.util.Stack;

public class 괄호회전하기 {
	static int answer = 0;
	public int solution(String s) {
        
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<s.length();i++) {
        	String str=s.substring(i,s.length())+s.substring(0,i);
        	search(str,stack);
        }
        return answer;
    }
	public static void search(String s,Stack<String> stack) {
		int flag=0;
		 for(int i=0;i<s.length();i++) {
	        	if(s.charAt(i)=='{') {
	    			stack.add("}");
	    		}else if(s.charAt(i)=='(') {
	    			stack.add(")");
	    		}else if(s.charAt(i)=='[') {
	    			stack.add("]");
	    		}
	    		else {
	    			if(stack.isEmpty()) {
	    				flag=1;
	    				break;
	    			}
	    			if(!stack.peek().equals(String.valueOf(s.charAt(i)))) {
	    				flag=1;
	    				break;
	    			}
	    			stack.pop();
	    		}
	        }
	        if(flag==0&&stack.isEmpty()) {
	        	answer++;
	        }
	}
}
