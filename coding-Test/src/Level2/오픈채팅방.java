package Level2;

import java.util.ArrayList;
import java.util.HashMap;
//여기서 핵심은 hashmap사용하는것 
public class 오픈채팅방 {
	public String[] solution(String[] record) {
		//출력의 개수및 id정보를 담을 배열
		ArrayList<String> arr=new ArrayList();
		//id에 따른 닉네임 담을 map
		HashMap<String,String> map=new HashMap<String, String>();
		
		for(int i=0;i<record.length;i++) {
			//입력값 받는 변수 
			String[] command=record[i].split(" ");
			if(command[0].equals("Enter")) {
				arr.add(command[1]+"님이 들어왔습니다.");
				map.put(command[1],command[2]);
			}else if(command[0].equals("Change")){
				map.put(command[1],command[2]);
			}else {
				arr.add(command[1]+"님이 나갔습니다.");
			}
		}
		//최종 출력을 담을 배열 
		String[] answer=new String[arr.size()];
		for(int i=0;i<arr.size();i++) {
			int idx=arr.get(i).indexOf("님");
			String id=arr.get(i).substring(0,idx);
			String[] temp=arr.get(i).split(" ");
			answer[i]=map.get(id)+"님이"+temp[1];
		}
		return answer;
	}
}
