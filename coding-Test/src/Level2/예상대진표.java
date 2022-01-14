package Level2;

public class 예상대진표 {
	public int solution(int n, int a, int b)
    {
    //라운드횟수
	 int count=0;
    //값 교환을위한변수
	 int temp=0;
    //작은값이 a,큰값이 b에들어가게
	 if(a>b) {
		 temp=a;
		 a=b;
		 b=temp;
	 }
	while(true) {
        //작은값이 홀수로오고 큰값이 짝수로오면 다음라운드에서 만남
		  if(!(a%2==0)&&a+1==b) {
             count++;
			 break;
		 }
        
        //다음라운드에 홀수이면 +1한후/2 짝수이면/2
        
		 if(a%2==0) {
			 a/=2;
		 }else {
			 a=(a+1)/2;
		 }
        //다음라운드에 홀수이면 +1한후/2 짝수이면/2
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
