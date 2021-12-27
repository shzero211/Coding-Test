package Level2;

import java.util.ArrayList;
import java.util.HashMap;
//���⼭ �ٽ��� hashmap����ϴ°� 
public class ����ä�ù� {
	public String[] solution(String[] record) {
		//����� ������ id������ ���� �迭
		ArrayList<String> arr=new ArrayList();
		//id�� ���� �г��� ���� map
		HashMap<String,String> map=new HashMap<String, String>();
		
		for(int i=0;i<record.length;i++) {
			//�Է°� �޴� ���� 
			String[] command=record[i].split(" ");
			if(command[0].equals("Enter")) {
				arr.add(command[1]+"���� ���Խ��ϴ�.");
				map.put(command[1],command[2]);
			}else if(command[0].equals("Change")){
				map.put(command[1],command[2]);
			}else {
				arr.add(command[1]+"���� �������ϴ�.");
			}
		}
		//���� ����� ���� �迭 
		String[] answer=new String[arr.size()];
		for(int i=0;i<arr.size();i++) {
			int idx=arr.get(i).indexOf("��");
			String id=arr.get(i).substring(0,idx);
			String[] temp=arr.get(i).split(" ");
			answer[i]=map.get(id)+"����"+temp[1];
		}
		return answer;
	}
}
