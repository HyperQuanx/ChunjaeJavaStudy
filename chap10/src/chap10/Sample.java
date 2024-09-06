package chap10;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// 부모클래스 변수 = new 부모클래스();
		// 부모클래스 변수 = new 자식클래스();
//		Human std = new Student();
//		Human job = new Job();
//		
//		std.eat();
//		std.sleep();
////		std.goToSchool(); // 자료형을 부모클래스 타입으로 데이터를 놔서 안됨
//		
//		job.eat();
//		job.sleep();
////		job.goToSchool();
		

		
		
		NoticeImpl bbs = new NoticeImpl();
		bbs.setIdx(1);
		bbs.setName("홍길동");
		bbs.setUserId("user1");
		bbs.setPwd("1234");
		bbs.setEmail("aaa@email.net");
		bbs.setTitle("제목입니다.");
		bbs.setContent("글 내용입니다.");
		bbs.setDisplayDate("2024-10-01");
		bbs.setRegDate("2024-09-04");
		
//		Integer a = bbs.getIdx();  a.toString()
		
//		String[] bbsContent = {
//				String.valueOf(bbs.getIdx()),
//				bbs.getName(),
//				bbs.getUserId(),
//				bbs.getPwd(),
//				bbs.getEmail(),
//				bbs.getTitle(),
//				bbs.getContent(),
//				bbs.getDisplayDate(),
//				bbs.getRegDate()
//		};
		
		
		
		
		
		
		
		
		
		// 리스트를 출력
//		bbs.regist(bbsContent);
//		bbs.bbsList(0, 0, null, null);
		
		
		// 글 내용을 출력
//		bbs.view(1);
		
		
		// 글 삭제
//		bbs.delete(1);
		
//		Scanner a = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		String input = new Scanner(System.in).next();
		
		bbs.bbsList(input);
		
		// 다음엔 계속 되묻는게 아닌 bbs.bbsList(input1, input2, input3, input4로 만들자);
		
		
		
	}

}
