package Back_END_SCHOOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String numstr="";
	int num1=0;
	int num2=0;
	
	while(true) {
		System.out.print("ù���� ���ڸ� �Է����ּ��� : ");
		numstr=br.readLine();
		boolean notnum=false;
		for(int i=0;i<numstr.length();i++) {
			if(('0'<=numstr.charAt(i)&&numstr.charAt(i)<='9')) {
				continue;
			}else {
				
				notnum=true;
				break;
			}
		}
		if(!notnum) {
			break;
		}else {
			System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
		}
		
	}
	
	num1=Integer.parseInt(numstr);
	numstr="";
	
	while(true) {
		System.out.print("�ι��� ���ڸ� �Է����ּ��� : ");
		numstr=br.readLine();
		boolean notnum=false;
		for(int i=0;i<numstr.length();i++) {
			if(('0'<=numstr.charAt(i)&&numstr.charAt(i)<='9')) {
				continue;
			}else {
				
				notnum=true;
				break;
			}
		}
		if(!notnum) {
			break;
		}else {
			System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
		}
		
	}
	num2=Integer.parseInt(numstr);
	System.out.print("��� : ");
	System.out.print(num1+num2);
	
}
}
