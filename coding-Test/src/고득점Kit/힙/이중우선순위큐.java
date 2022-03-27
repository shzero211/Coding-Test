package �����Kit.��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class ���߿켱����ť {
	public int[] solution(String[] operations) {
        int[] answer=new int[2];
        PriorityQueue<Integer> pqmax=new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> pqmin=new PriorityQueue<Integer>();
        for(int i=0;i<operations.length;i++) {
        	String[] str=operations[i].split(" ");
        	//�� ť�� �����͸� ���� ��û ��� ���� ����
            if (pqmax.size() < 1 && str[0].equals("D"))
                continue;
        	if(str[0].equals("I")) {
        		pqmax.add(Integer.parseInt(str[1]));
        		pqmin.add(Integer.parseInt(str[1]));
        		continue;
        	}else if(str[0].equals("D")&&str[1].equals("1")) {
        		int m=pqmax.poll();
        		pqmin.remove(m);
        	}else {
        		int m=pqmin.poll();
        		pqmax.remove(m);
        	}
        }
        if(pqmax.size()>0) {
        	answer[0]=pqmax.poll();
        	answer[1]=pqmin.poll();
        	if(answer[0]==answer[1]) {
        		answer[1]=0;
        	}
        }
        return answer;
    }
}
