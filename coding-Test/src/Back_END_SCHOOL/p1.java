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
		System.out.print("첫번쨰 숫자를 입력해주세요 : ");
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
			System.out.println("[입력오류] : 숫자로 입력해주세요.");
		}
		
	}
	
	num1=Integer.parseInt(numstr);
	numstr="";
	
	while(true) {
		System.out.print("두번쨰 숫자를 입력해주세요 : ");
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
			System.out.println("[입력오류] : 숫자로 입력해주세요.");
		}
		
	}
	num2=Integer.parseInt(numstr);
	System.out.print("결과 : ");
	System.out.print(num1+num2);
	
}
}
