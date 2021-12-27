package Level2;

public class 유클리드호제법 {
	//앞에 큰수넣어야하는 최대공약수
	public static int gcd(int bn, int sn) {
		// 큰숫자를 작은숫자로 나눈 나머지를 계산
		int r = bn % sn;
		// 나머지가 0이면 작은숫자가 최대공약수이므로 작은숫자 리턴
		if (r == 0) {
		return sn;
		} else {
		// 나머지가 0 이상이면 재귀형태로 호출
		// 이때 파라미터는 작은숫자와 나머지를 넣어줌
		return gcd(sn, r);
		}
	}

//최소공배수
public static int lcm(int a,int b) {
	return a*b/gcd(a,b);
}
public static void main(String[] args) {
	System.out.println(gcd(4,3));
}
}
