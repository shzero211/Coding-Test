package Level2;

public class ���ͽ�Ʈ��˰��� {
	// ���Ұ���
	static int num = 6;
	// ����
	static int INF = 1000000000;
	// ��ü�׷���
	static int[][] arr = { { 0, 2, 5, 1, INF, INF }, { 2, 0, 3, 2, INF, INF }, { 5, 3, 0, 3, 1, 5 },
			{ 1, 2, 3, 0, 1, INF }, { INF, INF, 1, 1, 0, 2 }, { INF, INF, 5, INF, 2, 0 } };
	// �湮ǥ��
	static boolean[] v = new boolean[num];
	// ���۳�忡�� �ִܰŸ� ����
	static int[] d = new int[num];

	public static void main(String[] args) {
		dijkstra(0);
		for (int i = 0; i < num; i++) {
			System.out.println(d[i]);
		}
	}

//���۳�尡 �־����� �ٸ������� �ִܰŸ��� ������
	public static void dijkstra(int start) {
		// ���۳�忡 ����Ȱ� �ʱ�ȭ
		for (int i = 0; i < num; i++) {
			d[i] = arr[start][i];
		}

		// �׷����� ����Ž�� ����
		// i��带 ��ĥ��
		for (int i = 0; i < num; i++) {
			// j���ΰ���
			for (int j = 0; j < num; j++) {
				// 1->i,i->j�� 1->j���� �������� ���������� �ִܰŸ� ����
				if (d[i] + arr[i][j] < d[j]) {
					d[j] = d[i] + arr[i][j];
				}
			}
		}
	}
}
