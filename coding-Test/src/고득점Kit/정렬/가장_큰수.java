package �����Kit.����;
//���� ���ذ��߾ȵ�
public class ����_ū�� {
	static boolean[] visited;
	static int max=0;
	  public String solution(int[] numbers) {
		  visited=new boolean[numbers.length];
	        String answer = "";
	        dfs(numbers,0,"");
	        return answer;
	    }
	  
	  public static void dfs(int[] numbers,int count,String numstr) {
		  if(count==numbers.length) {
			  System.out.println(numstr);
			  if(max<Integer.parseInt(numstr)) {
				  max=Integer.parseInt(numstr);
				  return;
			  }
		  }
		  for(int i=0;i<numbers.length;i++) {
			  if(!visited[i]) {
				  visited[i]=true;
				  
				  dfs(numbers,count+1,numstr+String.valueOf(numbers[i]));
				  visited[i]=false;
			  }
		  }
	  }
}
