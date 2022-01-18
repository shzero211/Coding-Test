package Level2;

import java.util.ArrayList;
import java.util.HashSet;

public class 후보키 {
//후보키인 열의 조합 저장
static ArrayList<ArrayList<Integer>> candidateKey;

//받는 문자열(relation)을 static으로 사용하기위한 Table
static String Table[][];

//문자열의 개수저장
static int length;

//정답
static int answer;

public static int solution(String[][] relation) {
	//초기화
	answer=0;
	//리스트 초기화
	candidateKey=new ArrayList<ArrayList<Integer>>();
	
	Table=relation;
	
	//열의개수
	length=relation[0].length;
	//1~최대열의개수 까지 만들수 있는 후보키 조합 찾기
	for(int i=1;i<=length;i++){
		makeSet(-1,i,0,new ArrayList<Integer>());
	}
	return answer;
}

//makeSet(현재위치,목표열의개수,현재열의개수,현재 조합담기)
public static void makeSet(int index,int target,int count,ArrayList<Integer> set) {
	//목표열의 개수와 현재열의 개수가같다면
	if(count==target) {
		//유일성인지 테스트
		if(!isUnique(set)) {
			return;
		}
		//최소성인지 테스트
		//모든 조합에서
		for(ArrayList<Integer> key:candidateKey) {
			//현재 조합의 원소가 중복이되면(작은 것에서 큰순서로 조합을 담았음으로 containsAll 사용)
			if(set.containsAll(key)) {
				return;
			}
		}
		//조합에 추가
		candidateKey.add(set);
		//정답추가
		answer++;
		return;
	}
	//0부터 시작해서 목표열의 개수에 맞게 dfs
	//이렇게백트래킹하는이유는 set.remove로 값 을 지우기 어려워서
	for(int i=index+1;i<length;i++) {
		//백트래킹을위해
		//값을 옮겨봤고
		ArrayList<Integer> newSet=new ArrayList<Integer>(set);
		//조합 원소 추가
		newSet.add(i);
		//현재인덱스와 현재 열의개수와 현재 상태 추가
		makeSet(i, target, count+1, newSet);
	}
	
}

//유일성 테스트
public static boolean isUnique(ArrayList<Integer> set) {
	ArrayList<String> list=new ArrayList<String>();
	//전체 행에서
	for(int i=0;i<Table.length;i++) {
		String temp="";
		//조합에있는 열로 만든문자열
		for(int index:set) {
			temp+=Table[i][index];
		}
		//중복이아니면 추가
		if(!list.contains(temp)) {
			list.add(temp);
		}else{
			//중복이면 false
			return false;
		}
	}
	//중복 X
	return true;
}
}
