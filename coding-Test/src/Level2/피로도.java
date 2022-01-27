package Level2;

public class ÇÇ·Îµµ {
	   static boolean[] visited;
		static int answer=0;
		 public int solution(int k, int[][] dungeons) {
		        visited=new boolean[dungeons.length];
		        
		        dfs(0,k,dungeons);
		        return answer;
		    }
		 public static void dfs(int depth,int k,int [][] dangerous) {
			 
			 for(int i=0;i<dangerous.length;i++) {
				 if(!visited[i]&&k>=dangerous[i][0]) {
					 visited[i]=true;
					 dfs(depth+1,k-dangerous[i][1],dangerous);
					 visited[i]=false;
				 }
			 }
			 answer=Math.max(answer,depth);
		 }
}
