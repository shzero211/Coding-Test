package Level2;

import java.util.ArrayList;
import java.util.HashSet;

public class �ĺ�Ű {
//�ĺ�Ű�� ���� ���� ����
static ArrayList<ArrayList<Integer>> candidateKey;

//�޴� ���ڿ�(relation)�� static���� ����ϱ����� Table
static String Table[][];

//���ڿ��� ��������
static int length;

//����
static int answer;

public static int solution(String[][] relation) {
	//�ʱ�ȭ
	answer=0;
	//����Ʈ �ʱ�ȭ
	candidateKey=new ArrayList<ArrayList<Integer>>();
	
	Table=relation;
	
	//���ǰ���
	length=relation[0].length;
	//1~�ִ뿭�ǰ��� ���� ����� �ִ� �ĺ�Ű ���� ã��
	for(int i=1;i<=length;i++){
		makeSet(-1,i,0,new ArrayList<Integer>());
	}
	return answer;
}

//makeSet(������ġ,��ǥ���ǰ���,���翭�ǰ���,���� ���մ��)
public static void makeSet(int index,int target,int count,ArrayList<Integer> set) {
	//��ǥ���� ������ ���翭�� ���������ٸ�
	if(count==target) {
		//���ϼ����� �׽�Ʈ
		if(!isUnique(set)) {
			return;
		}
		//�ּҼ����� �׽�Ʈ
		//��� ���տ���
		for(ArrayList<Integer> key:candidateKey) {
			//���� ������ ���Ұ� �ߺ��̵Ǹ�(���� �Ϳ��� ū������ ������ ��������� containsAll ���)
			if(set.containsAll(key)) {
				return;
			}
		}
		//���տ� �߰�
		candidateKey.add(set);
		//�����߰�
		answer++;
		return;
	}
	//0���� �����ؼ� ��ǥ���� ������ �°� dfs
	//�̷��Թ�Ʈ��ŷ�ϴ������� set.remove�� �� �� ����� �������
	for(int i=index+1;i<length;i++) {
		//��Ʈ��ŷ������
		//���� �Űܺð�
		ArrayList<Integer> newSet=new ArrayList<Integer>(set);
		//���� ���� �߰�
		newSet.add(i);
		//�����ε����� ���� ���ǰ����� ���� ���� �߰�
		makeSet(i, target, count+1, newSet);
	}
	
}

//���ϼ� �׽�Ʈ
public static boolean isUnique(ArrayList<Integer> set) {
	ArrayList<String> list=new ArrayList<String>();
	//��ü �࿡��
	for(int i=0;i<Table.length;i++) {
		String temp="";
		//���տ��ִ� ���� ���繮�ڿ�
		for(int index:set) {
			temp+=Table[i][index];
		}
		//�ߺ��̾ƴϸ� �߰�
		if(!list.contains(temp)) {
			list.add(temp);
		}else{
			//�ߺ��̸� false
			return false;
		}
	}
	//�ߺ� X
	return true;
}
}
