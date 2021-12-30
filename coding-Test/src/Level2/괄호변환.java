package Level2;

public class 괄호변환 {
	
	//문제 순서에따른 구현을 StringBuilder를 통해서 하는게 중요
	  public static boolean check(String str) {
		  int open=0;
		  if(str.charAt(0)==')') return false;

		  for(int i=0;i<str.length();i++) {
			  if(str.charAt(i)=='(') open++;
			  else {
				  open--;
				  if(open<0) return false;
			  }
		  }
		  return true;
	  }
	  
	  public static String reverse(String str) {
		  StringBuilder s=new StringBuilder();
		  for(int i=1;i<str.length()-1;i++) {
			  if(str.charAt(i)==')') {
				  s.append("(");
			  }else {
				  s.append(")");
			  }
		  }
		  return s.toString();
	  }
	  
	  public static String split(String w) {
		  
	        // 1. 입력된 문자열 w를 u와 v로 나누어 저장하는 StringBuilder클래스 객체.
	        StringBuilder u = new StringBuilder();
	        StringBuilder v = new StringBuilder();
	        
	        // 2. 빈 문자열인 경우, 빈 문자열을 반환.
	        if(w.length() == 0) return "";
	        
	        // 3. (의 개수를 저장하는 변수.
	        int open = 0;
	        for(int i =0;i<w.length();i++){ 
	            // 4. 한 문자가 (인 경우 open은 증가.
	            if(w.charAt(i) == '(') open++;    
	            // 5. )인 경우 open은 감소.
	            else open--;
	            
	            // 6. 처음 open이 0이 된 경우가 가장 작은 단위의 "균형잡힌 괄호 문자열".
	            if(open == 0){
	                // 7. 해당 인덱스를 기점으로 u와 v로 분리.
	                u.append(w.substring(0,i+1));
	                v.append(w.substring(i+1,w.length()));
	                
	                // 8. u가 "올바른 괄호 문자열"이라면,
	                if(check(u.toString())){
	                    // 9. v에 대해 재귀호출 후, u에 이어 붙인다. 이 과정 후 break에 걸려 u를 반환하므로 변환 과정에 성립.
	                    u.append(split(v.toString())); 
	                // 10. u가 "올바른 괄호 문자열"이 아니라면,    
	                }else{
	                    // 11. 새로운 StringBuilder 객체 생성.
	                    StringBuilder str = new StringBuilder();
	                    // 12. (를 붙인다.
	                    str.append("(");
	                    // 13. v에 대해 재귀호출 후 붙인다.
	                    str.append(split(v.toString()));
	                    // 14. )를 붙인다.
	                    str.append(")");
	                    // 15. u를 조작해 붙인다.
	                    str.append(reverse(u.toString()));
	                    // 16. 새로운 문자열을 반환한다.
	                    return str.toString();
	                }
	                break;             
	            }
	        }
	        // 17. u가 올바른 문자인 경우에만 반환되는 u.
	        return u.toString();  
		  
	  }
	  public String solution(String p) {
	        String answer;
	        
	        // 1. 올바른 괄호 문자열이라면, 바로 문자열을 반환한다.
	        if(check(p))
	            return p;
	        // 2. 나머지 균현잡힌 괄호 문자열 => 올바른 괄호 문자열 변환 메소드 호출 및 answer에 저장.        
	        answer = split(p);
	    
	        return answer;
	    }
}
