package Level2;

public class ��Ŭ����ȣ���� {
	//�տ� ū���־���ϴ� �ִ�����
	public static int gcd(int bn, int sn) {
		// ū���ڸ� �������ڷ� ���� �������� ���
		int r = bn % sn;
		// �������� 0�̸� �������ڰ� �ִ������̹Ƿ� �������� ����
		if (r == 0) {
		return sn;
		} else {
		// �������� 0 �̻��̸� ������·� ȣ��
		// �̶� �Ķ���ʹ� �������ڿ� �������� �־���
		return gcd(sn, r);
		}
	}

//�ּҰ����
public static int lcm(int a,int b) {
	return a*b/gcd(a,b);
}
public static void main(String[] args) {
	System.out.println(gcd(4,3));
}
}
