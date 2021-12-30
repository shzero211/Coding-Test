package Level2;

public class ��ȣ��ȯ {
	
	//���� ���������� ������ StringBuilder�� ���ؼ� �ϴ°� �߿�
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
		  
	        // 1. �Էµ� ���ڿ� w�� u�� v�� ������ �����ϴ� StringBuilderŬ���� ��ü.
	        StringBuilder u = new StringBuilder();
	        StringBuilder v = new StringBuilder();
	        
	        // 2. �� ���ڿ��� ���, �� ���ڿ��� ��ȯ.
	        if(w.length() == 0) return "";
	        
	        // 3. (�� ������ �����ϴ� ����.
	        int open = 0;
	        for(int i =0;i<w.length();i++){ 
	            // 4. �� ���ڰ� (�� ��� open�� ����.
	            if(w.charAt(i) == '(') open++;    
	            // 5. )�� ��� open�� ����.
	            else open--;
	            
	            // 6. ó�� open�� 0�� �� ��찡 ���� ���� ������ "�������� ��ȣ ���ڿ�".
	            if(open == 0){
	                // 7. �ش� �ε����� �������� u�� v�� �и�.
	                u.append(w.substring(0,i+1));
	                v.append(w.substring(i+1,w.length()));
	                
	                // 8. u�� "�ùٸ� ��ȣ ���ڿ�"�̶��,
	                if(check(u.toString())){
	                    // 9. v�� ���� ���ȣ�� ��, u�� �̾� ���δ�. �� ���� �� break�� �ɷ� u�� ��ȯ�ϹǷ� ��ȯ ������ ����.
	                    u.append(split(v.toString())); 
	                // 10. u�� "�ùٸ� ��ȣ ���ڿ�"�� �ƴ϶��,    
	                }else{
	                    // 11. ���ο� StringBuilder ��ü ����.
	                    StringBuilder str = new StringBuilder();
	                    // 12. (�� ���δ�.
	                    str.append("(");
	                    // 13. v�� ���� ���ȣ�� �� ���δ�.
	                    str.append(split(v.toString()));
	                    // 14. )�� ���δ�.
	                    str.append(")");
	                    // 15. u�� ������ ���δ�.
	                    str.append(reverse(u.toString()));
	                    // 16. ���ο� ���ڿ��� ��ȯ�Ѵ�.
	                    return str.toString();
	                }
	                break;             
	            }
	        }
	        // 17. u�� �ùٸ� ������ ��쿡�� ��ȯ�Ǵ� u.
	        return u.toString();  
		  
	  }
	  public String solution(String p) {
	        String answer;
	        
	        // 1. �ùٸ� ��ȣ ���ڿ��̶��, �ٷ� ���ڿ��� ��ȯ�Ѵ�.
	        if(check(p))
	            return p;
	        // 2. ������ �������� ��ȣ ���ڿ� => �ùٸ� ��ȣ ���ڿ� ��ȯ �޼ҵ� ȣ�� �� answer�� ����.        
	        answer = split(p);
	    
	        return answer;
	    }
}
