package Level1;

import java.util.*;

public class 로또의최고순위와최저순위 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		int max = 0;
		int min = 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int num : lottos) {
			if (num != 0) {
				list.add(num);
			} else {
				max++;
			}
		}

		for (int num : win_nums) {
			if (list.contains(num)) {
				min++;
				max++;
			}
		}
		answer[0] = min;
		answer[1] = max;
		for (int i = 0; i < answer.length;i++) {
			if (answer[i] == 6) {
				answer[i] = 1;
			} else if (answer[i] == 5) {
				answer[i] = 2;
			} else if (answer[i] == 4) {
				answer[i] = 3;
			} else if (answer[i] == 3) {
				answer[i] = 4;
			} else if (answer[i] == 2) {
				answer[i] = 5;
			} else {
				answer[i] = 6;
			}

			
		}
		Arrays.sort(answer);
		return answer;
}
}