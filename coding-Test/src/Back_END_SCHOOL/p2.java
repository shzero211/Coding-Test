package Back_END_SCHOOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;

		int cnt = 0;
		for (int k = 0; k < 10; k++) {
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
			sum += Integer.parseInt(numstr);
		}
		System.out.println("결과 : " + sum);
	}
}
