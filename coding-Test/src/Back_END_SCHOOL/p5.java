package Back_END_SCHOOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p5 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		int cnt = 0;

		while (true) {
			// 입력한숫자를 문자열로 담을 변수
			String numstr = "";
			// 숫자로 구성되어있는지 확인하는 while 문
			while (true) {
				System.out.print("숫자 " + (cnt + 1) + " : ");
				numstr = br.readLine();
				// 숫자로 구성되어있는지 확인하는 boolean
				boolean notnum = false;
				// 문자열의 모든 길이의 문자가 0~9로 이루어져 있는지 확인하는 반복문
				for (int i = 0; i < numstr.length(); i++) {
					if (('0' <= numstr.charAt(i) && numstr.charAt(i) <= '9')) {
						continue;
					} else {

						notnum = true;
						break;
					}
				}
				// 숫자로만 이루어져있으면
				if (!notnum) {
					cnt++;
					break;

				} else {
					System.out.println("[입력오류] : 숫자로 입력해주세요.");
				}

			}
			// 문자열을 숫자로 변환
			int num = Integer.parseInt(numstr);

			// 중복되는 수인지 확인
			if (arr.contains(num)) {
				System.out.println("[입력오류] : 이미 입력된 숫자 입니다.");
				cnt--;
				continue;
			}
			// 종료조건인 0이면 입력 종료
			if (numstr.equals("0")) {
				break;
			}
			// 리스트에 숫자추가
			arr.add(num);
		}
		// 오름차순으로정렬
		Collections.sort(arr);
		System.out.print("결과 : ");

		// 첫번째는 , 가 나오지 않음으로 확인을 위한 boolean
		boolean isfirst = true;
		
		// 리스트에 있는 숫자중 소수만 출력하는 반복문
		for (int i = 0; i < arr.size(); i++) {
			int num = arr.get(i);
			// 소수인지 확인하는 boolean
			boolean notpr = false;
			if (num <= 1)
				continue;
			if (num % 2 == 0 && num > 2)
				continue;
			// 제곱근 범위까지 나뉘어 지지 않으면 소수가 맞음
			for (int j = 3; j <= Math.sqrt(num); j += 2) {
				if (num % j == 0) {
					notpr = true;
				}
			}
			// 소수가 아닌경우
			if (notpr) {
				continue;
			} else {
				// 첫번째숫자인지
				if (isfirst) {
					System.out.print(num);
					isfirst = false;
					continue;
				}
				// 아니면 출력
				System.out.print(", " + num);
			}
		}

	}
}
