package Level2;

import java.util.Stack;

public class 짝지어제거하기 {
	//핵심은 회전을 만들때 넣는 순서가 중요,반복문 증가 감소도 잘생각하기
	int[][] arr;
	public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer =new int[queries.length];
        arr=new int[rows][columns];
        int count=1;
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		arr[i][j]=count;
        		count++;
        	}
        }
        
        for(int i=0;i<queries.length;i++) {
        	answer[i]=move(arr,queries[i]);
             
        }
        
       
        return answer;
    }
	public static int move(int[][] arr,int[] qr) {
		int r1=qr[0]-1;
		int c1=qr[1]-1;
		int r2=qr[2]-1;
		int c2=qr[3]-1;
		int ori=arr[r1][c1];
		int min=ori;
		for(int i=r1;i<r2;i++) {
			arr[i][c1]=arr[i+1][c1];
			if(min>=arr[i][c1])min=arr[i][c1];
		}
		
		for(int i=c1;i<c2;i++) {
			arr[r2][i]=arr[r2][i+1];
			if(min>=arr[r2][i])min=arr[r2][i];
			
		}
		
		for(int i=r2;i>r1;i--) {
			arr[i][c2]=arr[i-1][c2];
			if(min>=arr[i][c2])min=arr[i][c2];
		}
		
		for(int i=c2;i>c1;i--) {
			arr[r1][i]=arr[r1][i-1];
			if(min>=arr[r1][i])min=arr[r1][i];
		}
		
		arr[r1][c1+1]=ori;
		return min;
	}
}
