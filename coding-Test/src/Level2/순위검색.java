package Level2;

public class �����˻� {
	 public int[] solution(String[] info, String[] query) {
		 //�������Ǳ��غ��� ���������� ���� ������Ǽ��� ����
	        int[] answer =new int[query.length];
	        int count=0;
	        
	        //����
	        for(int i=0;i<query.length;i++) {
	        	// and�� �����ְ� ������ �������� ���ڹ迭�� ����
	        	String[] a=query[i].replace(" and","").split(" ");
	        	
	        	//�׽�Ʈ�������
	        	for(int j=0;j<info.length;j++){
	        		
	        	//������ �������� ���ڹ迭 ����
	        	String[] b=info[j].split(" ");
	        	
	        	//�������� ���ؿ� �����ϴ���
	        	for(int k=0;k<4;k++) {
	        		if(!a[k].equals(b[k])) {
		        		if(!a[k].equals("-")) {
		        			break;
		        		}
		        	}
	        		count++;
	        	}
	        	//������ �̻��̸�
	        	if(Integer.valueOf(b[4])>=Integer.valueOf(a[4])) {
	        		count++;
	        	}
	        	//��θ����ϸ� 
	        	if(count==5)answer[i]++;
	        	count=0;
       }
	        	
	        }
	        return answer;
	    }
}
