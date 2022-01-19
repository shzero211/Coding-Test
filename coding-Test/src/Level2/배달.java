package Level2;

public class 배달 {
	static int INF=500001;

    public int solution(int N, int[][] road, int K) {
    	int answer=0;
    	int[][] arr=new int[N][N];
    	int[] d=new int [N];
    	
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<N;j++) {
    			if(i==j) {
    				arr[i][j]=0;
    				continue;
    			}
    			arr[i][j]=INF;
    		}
    	}
    	
    	for(int i=0;i<road.length;i++) {
            if(arr[road[i][0]-1][road[i][1]-1]<road[i][2]) continue;
    		arr[road[i][0]-1][road[i][1]-1]=road[i][2];
    		arr[road[i][1]-1][road[i][0]-1]=road[i][2];
    	}

    	
    	for(int i=0;i<N;i++) {
    		d[i]=arr[0][i];
    	}
    	
        for (int k = 0; k < N; k++) {                                           //플로이드 와샬 알고리즘
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(i == j) continue;
                    if (arr[i][j] > arr[i][k] + arr[k][j]) {
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }

    	
    	for(int i=0;i<N;i++) {
    		if(arr[0][i]<=K) answer++;
    	}
    	return answer;
    }
}
