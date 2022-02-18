package Level2;

public class 신규아이디추천 {
	   public String solution(String new_id) {
	        String answer = "";
	        //1
	        String id1=new_id.toLowerCase();
	        //2
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<id1.length();i++) {
	        	if((id1.charAt(i)>='0'&&id1.charAt(i)<='9')||(id1.charAt(i)>='a'&&id1.charAt(i)<='z')||id1.charAt(i)=='-'||id1.charAt(i)=='_'||id1.charAt(i)=='.') {
    				sb.append(id1.charAt(i));
    			}
    	
	        }
	        String id2=sb.toString();
	        //3
	        StringBuilder sb2=new StringBuilder();
	        for(int i=0;i<id2.length();i++) {
	        	if(i==0) {
	        		sb2.append(id2.charAt(0));
	        		continue;
	        	}
	        	if(id2.charAt(i)=='.'&&id2.charAt(i-1)=='.') {
    			continue;
    			}
	        	sb2.append(id2.charAt(i));
    	
	        }
	        String id3=sb2.toString();
	        //4
	        if(id3.startsWith(".")) {
	        	id3=id3.substring(1,id3.length());
	        }
	        if(id3.endsWith(".")) {
	        	id3=id3.substring(0,id3.length()-1);
	        }
	        //5
	        if(id3.isEmpty()) {
	        	id3="a";
	        }
	        //6
	        if(id3.length()>=16) {
	        	id3=id3.substring(0,15);
	        }
	        //7
	        if(id3.endsWith(".")) {
	        	id3=id3.substring(0,id3.length()-1);
	        }
	        
	        //8
	        StringBuilder sb3=new StringBuilder(id3);
	        if(id3.length()<=2) {
	        	while(sb3.length()!=3) {
	        		sb3.append(id3.charAt(id3.length()-1));
	        	}
	        }
	        System.out.println(sb3.toString());
	        return answer;
	    }
}
