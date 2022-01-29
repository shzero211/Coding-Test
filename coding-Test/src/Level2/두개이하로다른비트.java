package Level2;

public class 두개이하로다른비트 {
	 public long[] solution(long[] numbers) {
	       long[] answer=new long[numbers.length];
	       for(int i=0;i<numbers.length;i++) {
	    	   if(numbers[i]%2==0) {
	    		   answer[i]=numbers[i]+1;
	    	   }else {
	    		   StringBuilder temp=new StringBuilder();
	    		   String binaryString=Long.toBinaryString(numbers[i]);
	    		   if(!binaryString.contains("0")) {
	    			   temp.append("10");
	    			   temp.append(binaryString.substring(1));
	    			   
	    		   }else {
	    			   int lastIndex=binaryString.lastIndexOf("0");
	    			   int firstOneIndx=binaryString.indexOf("1",lastIndex);
	    			   temp.append(binaryString,0,lastIndex).append("10");
	    			   temp.append(binaryString,firstOneIndx+1,binaryString.length());
	    		   }
	    		   System.out.println(temp+" ");
	    		   answer[i]=Long.parseLong(temp.toString(),2);
	    	   }
	       }
	        
	        
	        
	        
	        return answer;
	    }
}
