package Back_END_SCHOOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p5 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> arr=new ArrayList<>();
	int cnt = 0;
	while(true) {
		String numstr = "";
		while (true) {
			System.out.print("숫자 " + (cnt + 1) + " : ");
			numstr = br.readLine();
			boolean notnum = false;
			for (int i = 0; i < numstr.length(); i++) {
				if (('0' <= numstr.charAt(i) && numstr.charAt(i) <= '9')) {
					continue;
				} else {

					notnum = true;
					break;
				}
			}
			if (!notnum) {
				cnt++;
				break;

			} else {
				System.out.println("[입력오류] : 숫자로 입력해주세요.");
			}

		}
		int num=Integer.parseInt(numstr);
		if(arr.contains(num)) {
			System.out.println("[입력오류] : 이미 입력된 숫자 입니다.");
			cnt--;
			continue;
		}
		if(numstr.equals("0")) {
			break;
		}
		arr.add(num);
	}
	
	Collections.sort(arr);
	System.out.print("결과 : ");
	boolean isfirst=true;
	for(int i=0;i<arr.size();i++) {
		int num=arr.get(i);
		boolean notpr=false;
		if(num<=1)continue;
		if(num%2==0&&num>2) continue;
		for(int j=3;j<=Math.sqrt(num);j+=2) {
			if(num%j==0) {
				notpr=true;
			}
		}
		if(notpr) {
			continue;
		}else {
			if(isfirst) {
				System.out.print(num);
				isfirst=false;
				continue;
			}
			System.out.print(", "+num);
		}
	}


}
}
