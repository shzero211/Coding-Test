package Back_END_SCHOOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Board{
	private String title;
	private String content;
	public void setTitle(String title) {
		this.title=title;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public String getTitle() {
		return this.title;
	}
	public String getContent(String content) {
		return this.content;
	}
}
public class p6 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Board> boards=new ArrayList<>();
	while(true) {
		System.out.print("��ɾ�) ");
		String order=br.readLine();
		if(order.equals("���")) {
			Board b=new Board();
			System.out.print("���� : ");
			b.setTitle(br.readLine());
			System.out.print("���� : ");
			b.setContent(br.readLine());
			System.out.println("[�˸�] "+(boards.size()+1)+"���� ��ϵǾ����ϴ�.");
			boards.add(b);
		}else if(order.equals("��ȸ")) {
			System.out.println("��ȣ / ����");
			System.out.println("-------------------");
			if(boards.size()!=0) {
				for(int i=boards.size()-1;i>=0;i--) {
					System.out.println((i+1)+" / "+boards.get(i).getTitle());
				}
			}
		}else if(order.equals("����")) {
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}else {
			continue;
		}
	}
	
}
}
