package Level2;

public class �������ǥ {
	public int solution(int n, int a, int b)
    {
    //����Ƚ��
	 int count=0;
    //�� ��ȯ�����Ѻ���
	 int temp=0;
    //�������� a,ū���� b������
	 if(a>b) {
		 temp=a;
		 a=b;
		 b=temp;
	 }
	while(true) {
        //�������� Ȧ���ο��� ū���� ¦���ο��� �������忡�� ����
		  if(!(a%2==0)&&a+1==b) {
             count++;
			 break;
		 }
        
        //�������忡 Ȧ���̸� +1����/2 ¦���̸�/2
        
		 if(a%2==0) {
			 a/=2;
		 }else {
			 a=(a+1)/2;
		 }
        //�������忡 Ȧ���̸� +1����/2 ¦���̸�/2
		 if(b%2==0) {
			 b/=2;
		 }else {
			 b=(b+1)/2;
		 }
		 count++;
		
	       
	}
        return count;
    }

}
