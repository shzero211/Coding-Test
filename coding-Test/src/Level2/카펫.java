package Level2;

public class ī�� {
	public int[] solution(int brown, int red) {

		int height = 0;
		int width = 0;
		for (height = 3; height <= (int) (brown + 4) / 2; height++) {

			width = ((brown + 4) / 2) - height;
			

			int redCount = (width - 2) * (height - 2);
			if (red == redCount) {
				break;
			}
		}

		int[] answer = new int[] { width, height };
		return answer;
	}
}
