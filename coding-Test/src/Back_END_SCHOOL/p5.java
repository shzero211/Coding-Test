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
			// �Է��Ѽ��ڸ� ���ڿ��� ���� ����
			String numstr = "";
			// ���ڷ� �����Ǿ��ִ��� Ȯ���ϴ� while ��
			while (true) {
				System.out.print("���� " + (cnt + 1) + " : ");
				numstr = br.readLine();
				// ���ڷ� �����Ǿ��ִ��� Ȯ���ϴ� boolean
				boolean notnum = false;
				// ���ڿ��� ��� ������ ���ڰ� 0~9�� �̷���� �ִ��� Ȯ���ϴ� �ݺ���
				for (int i = 0; i < numstr.length(); i++) {
					if (('0' <= numstr.charAt(i) && numstr.charAt(i) <= '9')) {
						continue;
					} else {

						notnum = true;
						break;
					}
				}
				// ���ڷθ� �̷����������
				if (!notnum) {
					cnt++;
					break;

				} else {
					System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
				}

			}
			// ���ڿ��� ���ڷ� ��ȯ
			int num = Integer.parseInt(numstr);

			// �ߺ��Ǵ� ������ Ȯ��
			if (arr.contains(num)) {
				System.out.println("[�Է¿���] : �̹� �Էµ� ���� �Դϴ�.");
				cnt--;
				continue;
			}
			// ���������� 0�̸� �Է� ����
			if (numstr.equals("0")) {
				break;
			}
			// ����Ʈ�� �����߰�
			arr.add(num);
		}
		// ����������������
		Collections.sort(arr);
		System.out.print("��� : ");

		// ù��°�� , �� ������ �������� Ȯ���� ���� boolean
		boolean isfirst = true;
		
		// ����Ʈ�� �ִ� ������ �Ҽ��� ����ϴ� �ݺ���
		for (int i = 0; i < arr.size(); i++) {
			int num = arr.get(i);
			// �Ҽ����� Ȯ���ϴ� boolean
			boolean notpr = false;
			if (num <= 1)
				continue;
			if (num % 2 == 0 && num > 2)
				continue;
			// ������ �������� ������ ���� ������ �Ҽ��� ����
			for (int j = 3; j <= Math.sqrt(num); j += 2) {
				if (num % j == 0) {
					notpr = true;
				}
			}
			// �Ҽ��� �ƴѰ��
			if (notpr) {
				continue;
			} else {
				// ù��°��������
				if (isfirst) {
					System.out.print(num);
					isfirst = false;
					continue;
				}
				// �ƴϸ� ���
				System.out.print(", " + num);
			}
		}

	}
}
