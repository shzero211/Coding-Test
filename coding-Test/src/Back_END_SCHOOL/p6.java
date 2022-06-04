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
		System.out.print("명령어) ");
		String order=br.readLine();
		if(order.equals("등록")) {
			Board b=new Board();
			System.out.print("제목 : ");
			b.setTitle(br.readLine());
			System.out.print("내용 : ");
			b.setContent(br.readLine());
			System.out.println("[알림] "+(boards.size()+1)+"글이 등록되었습니다.");
			boards.add(b);
		}else if(order.equals("조회")) {
			System.out.println("번호 / 제목");
			System.out.println("-------------------");
			if(boards.size()!=0) {
				for(int i=boards.size()-1;i>=0;i--) {
					System.out.println((i+1)+" / "+boards.get(i).getTitle());
				}
			}
		}else if(order.equals("종료")) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}else {
			continue;
		}
	}
	
}
}
