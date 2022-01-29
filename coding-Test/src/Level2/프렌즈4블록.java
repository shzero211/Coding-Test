package Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class «¡∑ª¡Ó4∫Ì∑œ {
    static char[][] map;
	static int answer = 0;
	
	public int solution(int m, int n, String[] board) {
	 map=new char[m][n];
	 for(int i=0;i<m;i++) {
		 for(int j=0;j<n;j++) {
			 map[i][j]=board[i].charAt(j);
		 }
	 }
	 while(update(m,n));
	 return answer;
	}
	public static boolean update(int m,int n) {
		boolean[][] c=new boolean[m][n];
		int cnt=0;
		Queue<Character> arr=new LinkedList<Character>();
		for(int i=0;i<m-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(map[i][j]=='0') continue;
				if(check(i,j)==true) {
					c[i][j]=true;
					c[i+1][j]=true;
					c[i][j+1]=true;
					c[i+1][j+1]=true;
					
				}
			}
		}
		
		
		for(int j=0;j<n;j++) {
			for(int i=m-1;i>=0;i--) {
				
				if(c[i][j]==true) {
					cnt++;
					continue;
				}else {
					arr.add(map[i][j]);
				}
			}
			
			
			
			
			for(int i=m-1;i>=0;i--) {
				if(arr.size()>0) {
					map[i][j]=arr.poll();
				}
				else map[i][j]='0';
			}
		}
		answer+=cnt;
		return cnt>0?true:false;
	}
	public static boolean check(int i, int j) {
		char std = map[i][j];
		
		if(map[i][j+1] == std && map[i+1][j] == std && map[i+1][j+1] == std) return true;
		return false;
	}
}
