package Level2;

import java.util.ArrayList;
import java.util.List;


public class 빛의경로사이클 {
	static int R,C;
	static int[] dr= {1,0,-1,0},dc= {0,-1,0,1};
	static boolean[][][] visited;
	public int[] solution(String[] grid) {
		ArrayList<Integer> answer=new ArrayList<Integer>();
		
		R=grid.length;
		C=grid[0].length();
		visited=new boolean[R][C][4];
		for(int i=0;i<R;i++) {
			for(int j =0;j<C;j++) {
				for(int k=0;k<4;k++) {
					if(!visited[i][j][k])
						answer.add(light(grid,i,j,k));
				}
			}
		}
		return answer.stream().sorted().mapToInt(i->i).toArray();
	}
	public static int light(String[] grid,int i,int j,int k) {
		int cnt=0;
		while(!visited[i][j][k]) {
			cnt++;
			visited[i][j][k]=true;
			if(grid[i].charAt(j)=='L') {
				k= k==0?3:k-1;
			}else if(grid[i].charAt(j)=='R') {
				k= k==3?0:k+1;
			}
			i=(i+dr[k]+R)%R;
			j=(j+dc[k]+C)%C;
		}
		return cnt;
	}
}

