package Back_END_SCHOOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//게시물 클래스
class Board {
	private String title;
	private String content;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 게시물을 저장할 리스트
		ArrayList<Board> boards = new ArrayList<>();

		while (true) {
			System.out.print("명령어) ");
			String order = br.readLine();
			// 등록이 입력되면
			if (order.equals("등록")) {
				// 새로운 게시물객체에 title,과content를 set
				Board b = new Board();
				System.out.print("제목 : ");
				b.setTitle(br.readLine());
				System.out.print("내용 : ");
				b.setContent(br.readLine());
				System.out.println("[알림] " + (boards.size() + 1) + "글이 등록되었습니다.");
				boards.add(b);
			} else if (order.equals("조회")) {
				// 모든 게시물을 출력
				System.out.println("번호 / 제목");
				System.out.println("-------------------");
				// 게시물총개수가 0이 아니면
				if (boards.size() != 0) {
					for (int i = boards.size() - 1; i >= 0; i--) {
						System.out.println((i + 1) + " / " + boards.get(i).getTitle());
					}
				}
			} else if (order.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				continue;
			}
		}

	}
}
