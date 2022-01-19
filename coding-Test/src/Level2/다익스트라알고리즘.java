package Level2;

public class 다익스트라알고리즘 {
	// 원소개수
	static int num = 6;
	// 무한
	static int INF = 1000000000;
	// 전체그래프
	static int[][] arr = { { 0, 2, 5, 1, INF, INF }, { 2, 0, 3, 2, INF, INF }, { 5, 3, 0, 3, 1, 5 },
			{ 1, 2, 3, 0, 1, INF }, { INF, INF, 1, 1, 0, 2 }, { INF, INF, 5, INF, 2, 0 } };
	// 방문표시
	static boolean[] v = new boolean[num];
	// 시작노드에서 최단거리 모음
	static int[] d = new int[num];

	public static void main(String[] args) {
		dijkstra(0);
		for (int i = 0; i < num; i++) {
			System.out.println(d[i]);
		}
	}

//시작노드가 주어지면 다른노드까지 최단거리를 구해줌
	public static void dijkstra(int start) {
		// 시작노드에 연결된것 초기화
		for (int i = 0; i < num; i++) {
			d[i] = arr[start][i];
		}

		// 그래프의 완전탐색 느낌
		// i노드를 거칠때
		for (int i = 0; i < num; i++) {
			// j노드로갈때
			for (int j = 0; j < num; j++) {
				// 1->i,i->j가 1->j보다 더빠르게 갈수있으면 최단거리 갱신
				if (d[i] + arr[i][j] < d[j]) {
					d[j] = d[i] + arr[i][j];
				}
			}
		}
	}
}
