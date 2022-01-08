package Level2;

public class 거리두기확인 {
	public int[] solution(String[][] places) {
        int[] answer =new int[places.length];
      
        for(int t=0;t<places.length;t++) {
        	String[] map=places[t];
              boolean flag=false;
        	for(int i=0;i<map.length;i++) {
        		for(int j=0;j<map[i].length();j++) {
        			if(map[i].charAt(j)=='P') {
        				if(find(i,j,map)) {
        					flag=true;
        					break;
        				}
        			}
        		}
        		if(flag) {
        			answer[t]=0;
        			break;
        		}
        	}
        	if(!flag) {
        		answer[t]=1;
        	}
        }
        
        return answer;
    }
	
	public static boolean find(int i,int j,String[] map) {
		int[] di= {-1,1,0,0};
		int[] dj= {0,0,-1,1};
		for(int k=0;k<4;k++) {
			int ni=i+di[k];
			int nj=j+dj[k];
			if(ni<0||ni>=5||nj<0||nj>=5) continue;
			if(map[ni].charAt(nj)=='P') {
				return true;
			}
		}
		
		int[] di2= {-2,2,0,0};
		int[] dj2= {0,0,-2,2};
		for(int k=0;k<4;k++) {
			int ni=i+di2[k];
			int nj=j+dj2[k];
			if(ni<0||ni>=5||nj<0||nj>=5) continue;
			if(map[ni].charAt(nj)=='P') {
				if(map[(i+ni)/2].charAt((j+nj)/2)!='X') {
					return true;
				}
			}
		}
		
		int[] di3= {1,-1,1,-1};
		int[] dj3= {1,1,-1,-1};
		for(int k=0;k<4;k++) {
			int ni=i+di3[k];
			int nj=j+dj3[k];
			if(ni<0||ni>=5||nj<0||nj>=5) continue;
			if(map[ni].charAt(nj)=='P') {
				if(!(map[i].charAt(nj)=='X'&&map[ni].charAt(j)=='X')) {
					return true;
				}
			}
		}
		
		return false;
		
	}
}
