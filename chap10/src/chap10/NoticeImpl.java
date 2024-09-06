package chap10;

import java.util.Scanner;

public class NoticeImpl implements BasicBbsIf {
	int idx;
	int pageSize;
	int pageNo;
	int total;
	String searchCategory;
	String searchWord;
	String name;
	String pwd;
	String userId;
	String email;
	String title;
	String content;
	String regDate;
	String displayDate;
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getSearchCategory() {
		return searchCategory;
	}

	public void setSearchCategory(String searchCategory) {
		this.searchCategory = searchCategory;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(String displayDate) {
		this.displayDate = displayDate;
	}

	public void getStartPage(int pageNo, int pageSize) {
		
	}
	
	public void getEndPage(int pageNo, int pageSize) {
		
	}	
	
	public void getStartBlockPage(int pageNo, int pageSize) {
		
	}
	
	public void getEndBlockPage(int pageNo, int pageSize, int total) {
		
	}
	
	
	
	@Override
	public void bbsList(int pageSize, int pageNo, String searchCategory, String searchKeyWord) {
		String[] [] userList ={
				{"2", "한덕용", "user2", "1234", "abcqqq@naver.com", "제목.", "내용.", "2024-10-01", "2024-09-09"},
				{"3", "한덕순", "user3", "1234", "abcwww@naver.com", "제목.", "내용.", "2023-10-01", "2025-09-09"},
				{"4", "한덕돌", "user4", "4321", "abcccc@naver.com", "제목.", "내용.", "2022-10-01", "2025-09-09"},
		};
		
		for(String[] user : userList) {
			for (String item : user) {
				System.out.print(item+"\t");
			}
			System.out.println();
		}
		
		System.out.println("PageSize : " + pageSize + ", pageNo : " + pageNo + ", searchCategory : " + searchCategory + ", searchKeyWord : " + searchKeyWord);
	}

	@Override
	public void regist(String[] arrInput) {
		for (String item : arrInput) {
			System.out.println("arrInput Item : " + item);
		}
		System.out.println("공지사항을 등록합니다.");
	}

	@Override
	public void view(int bbsIdx) {
		System.out.println("게시글 조회 bbsIdx : " + bbsIdx); // 게시글 조회
		String [] [] contentList = {
				{"글 내용 1"},
				{"글 내용 2"},
				{"글 내용 3"},
				{"글 내용 4"},
				{"글 내용 5"},
				{"글 내용 6"},
				{"글 내용 7"},
				{"글 내용 8"},
				{"글 내용 9"}
		};
		
		System.out.println(contentList[bbsIdx][0]);
		
	}

	@Override
	public void delete(int bbsIdx) {
		System.out.println("게시글 삭제 bbsIdx : " + bbsIdx); // 게시글 삭제
		String [] [] contentList = {
				{"글 내용 1"},
				{"글 내용 2"},
				{"글 내용 3"},
				{"글 내용 4"},
				{"글 내용 5"},
				{"글 내용 6"},
				{"글 내용 7"},
				{"글 내용 8"},
				{"글 내용 9"}
		};
		
		for(int i=0; i<contentList.length; i++) {
			for(int j=0; j<contentList[i].length; j++) {
				if(i == bbsIdx) {
					System.out.print(contentList[i][j] + "를 삭제했습니다.");
					continue;
				}
				System.out.print(contentList[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void bbsList(String w) {
		String[] [] list = {
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕수", "애국가 2절", "남산 위에 저 소나무 철갑을 두른듯\n바람 서리 불변함은 우리 기상일세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-09-01", "2024-10-31"},
				{"한덕순", "애국가 3절", "가을 하늘 공활한데 높고 구름 없이\n밝은 달은 우리 가슴 일편 단심일세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-10-01", "2024-11-30"},
				{"용덕한", "애국가 4절", "이 기상과 이 맘으로 충성을 다하여\n괴로우나 즐거우나 나라 사랑하세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-11-01", "2024-12-31"},
				{"리덕용", "조선민주주의인민공화국 1절", "아침은 빛나라 이 강산\r\n"
						+ "은금(銀金)에 자원도 가득한\r\n"
						+ "이 세상 아름다운 내 조국\r\n"
						+ "반만년 오랜 력사에\r\n"
						+ "\r\n"
						+ "찬란한 문화로 자라난\r\n"
						+ "슬기론 인민의 이 영광\r\n"
						+ "몸과 맘 다 바쳐 이 조선\r\n"
						+ "길이 받드세"
						, "2024-11-01", "2024-12-31"},
				{"리덕순", "조선민주주의인민공화국 2절", "백두산기상을 다 안고\r\n"
						+ "근로의 정신은 깃들어\r\n"
						+ "진리로 뭉쳐진 억센 뜻\r\n"
						+ "온 세계 앞서나가리\r\n"
						+ "\r\n"
						+ "솟는 힘 노도(怒濤)도 내밀어\r\n"
						+ "인민의 뜻으로 선 나라\r\n"
						+ "한없이 부강하는 이 조선\r\n"
						+ "길이 빛내세"
						, "2024-11-01", "2024-12-31"},
				{"Mr.Han", "Hi", "Hello World!", "2024-11-01", "2024-12-31"},
				{"Ms.Han", "Bye", "GoodBye World!", "2024-11-01", "2024-12-31"},
				{"한덕용", "애국가 11절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 12절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 13절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 14절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 15절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 16절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 17절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 18절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 19절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 102절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 111절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 112절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 112절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 113절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 114절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 115절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 116절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 117절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1178절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 132절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 132절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1412절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 155절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 122절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 133절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 155절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 112절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 133절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 17절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 199절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 100절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1--절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 112절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 133절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1ㅇㅇ절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1123절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1545절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 16456절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 17457절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1457절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1677절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1887678절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1678678절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1123절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1231절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 5451절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 661절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 616절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 7561절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 156절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 156절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1567절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 12134절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1123절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 11234절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 12323절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 144절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 155절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 661절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 881절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 771절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 991절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"이스터에그", "찾기 성공!", "링","딩","동"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세ㅁㄴㅇㄻㄴㅇㄹ\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산ㅁㄴㅇㄻㄴㅇ이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나ㅁㄴㅇㄻㄴㅁㄴㅇㄹㅇㄹ라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보ㅁㄴㅇㄻㄴㅇㄹ우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님ㅁㄴㅇㄻㄴㅇㄹ이 보우하ㄻㄴㅇㄹ사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화ㅓㅏㅎ려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우ㅇㄻㄴㅇ리나라 만세\n무궁ㅁㄴㅇㅏ호ㄻ화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르고 닳도록\n하느님이 보ㅇㄻㄴ우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 호ㅓ보우하사 우리나라 만세\nㄴㅇㄻㄴㅇ무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두ㅁㄴㅇ산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이ㅁㄴㅇㄻㄴ 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대ㅗㅓㅏㅎ한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백ㅁㄴㅇ두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇㅁㄴ물과 백두ㅏㅗ산이 마르고 닳도록\n하느ㅓㄱ서님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르호ㅓㅏ고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리ㅓㅏㅗㅅㅓ나ㅁㄴㅇㄹ라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백ㅁㄴㅇ두산이 마르고 닳도록\nㅁㄴㅇㄹ하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르호ㅓㅏ고 닳도록\n하느님이 보우하ㅁㄴㅇㄴㅇㄹ홀호ㄹ사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르고 닳도록\n하느님이 보우하쇼ㅕ사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물ㅇㅁㄴㅇ과 백두산이 마르고 닳도록\n하느님ㅗㅓㅏ이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강ㅗㅓㅏ산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화ㅛㅓ 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물ㅁㄴㅇ과 백두산이ㅓㅏ 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n호ㅓㅏㅎ무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 ㅛ셔ㅏㅓ만세\n무궁ㅏㅎㅁㄴㅇㄹ몬ㅇ화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르고 닳도록호ㅓ\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백ㄴㅇㅁㄴㅇ두산이 마르고 닳도록\n하느호ㅓㅏ님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 ㅁㄴㅇㅁㄴㅇㅁㄴ사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 호ㅓㅏ만세\n무궁ㅗㅓㅏ화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼ㅇㅁㄴㅇㅁㄴㅇㅁㄴㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㄴㅇㅇㅂㅈㅈㅈㅈㅈㅈㅈ천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로ㅗㅓㅏ호 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우ㅓㅏ리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물ㅁㄴㅇ과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천ㅓㅏㅎㅗ리 화려 강ㅁㄴ산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하호ㅓㅏ사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 호ㅓㅏ호ㅓㅏ만세ㅁㄴㅇ\n무궁화 삼천리 화려 강산\n대한 사ㅇㅁㄴㅇ람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동ㅁ해물과 백두산이 마르고 닳도록\n하느님이 보우하호ㅓㅏ호ㅓㅏ사 우리나라 ㅁㅇㄴ만세호ㅁㄴㅇㅓㅏ호ㅓㅏ\nㅁㄴㅇㅁㄴㅇ무궁화 삼ㅁㄴㅇ천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르고 닳도록\n하ㄱㄷㅂㅈㄷㄱ느님이 보호ㅓㅏ호ㅓ우하사 우리나호ㅓㅏ호ㅓㅏ라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 ㅂㅈㄷㅂㅈㄷ보우하사 우리나라 만세\n무궁화 삼천리 화려 강ㅇㄴㅁ산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 ㅂㅈㄷㅂㅈㄷ백두산이 마르고 닳도ㄷㅂㅈㄷ록\n하느님이ㅂㅈㄷㅇㅁㄴㅂㅈ 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르ㅂㅈㄷ고 닳도록\n하느ㅂㅈㄷㅂㅈ님이 보우하ㄷㅂㅈㄷ사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화ㅂㅈㄷㅂ려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우ㅇㄴㅁ리나라 만세\nㅂㅈ무궁화 삼천리 화려 강산\n대한 사람 대한ㅁㄴㅇ으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우ㅈㄷㅈ리나라 만세\n무궁화 삼천리 화려 강산\n대한ㅈㄷㅂㅈ 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 ㅂㅈㄷ닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대ㄷㅂㅈ한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리ㄷㅂㅈㄷㅂㅈㄷㅂㅈㄷ나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 ㅇㄴㅁ보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\nㅇㄴㅁ강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르고 닳ㅂㅈㄷ도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대ㅁㄴㅇ한 사람ㅁㄴㅇ 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳ㅇㄴㅁㅇㅁㄴ도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㄴㅇ물과 백두산이 마르고 닳도록\n하느님이 보우하ㄷㅁㄴㅇ사 우리나라 만세\n무궁화 삼천리 화려 강ㅁㄴㅇ산\n대한 사ㅁㄴㅇ람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만ㅁㅇ세\n무궁화 삼천리 화ㅂㅈㄷ려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르ㅈㄷㅂㅈ고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나ㅁㄴㅇ라 만세ㅁㄴㅇ\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㅁㅇㄴ물과 백두산이 마ㅁㄴㅇ르고 닳도록\n하느님이 ㅁㄴㅇㅁㄴㅇ우하사ㅂㅈㄷㅂ 우ㅁㄴㅇ리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동ㅁㄴㅇ해물과 백두산이 마르고 닳도록\n하느님이 ㅁㄴㅇㅁㅇㄴ보우하사 우리나라 만세\n무궁화 삼ㅂㅈㄷㅂㅈㄷ천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과ㅇㅁㄴ 백두산이 마르고 닳도ㅁㄴㅇ록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산ㅁㄴㅇ이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동ㅁㄴㅇ해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물ㅇㅁㄴ과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물ㅁㄴㅇ과 백두산이 마르고 닳도록\n하느ㅁㄴㅁㄴㅇㅇ님이 보우하사 우리ㅁㄴㅇ나라 만세\n무궁화 삼ㅁㄴㅇ천리 ㅁㄴㅇ화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물과 백두산이 마르고 닳도록\n하느님이 보우하ㅁㄴㅇ사 우리나라 만세\n무궁화 삼ㅁㄴㅇ천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해물ㅁㄴㅇ과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
				{"한덕용", "애국가 1절", "동해ㄴㅁㅇ물과 백두산이 마르ㅁㄴㅇ고 닳도록\n하느님이 보우하사 우리나라 만세\n무궁화 삼천리 화려 강산\n대한 사람ㅁㄴㅇㅁㄴ 대한으로 길이 보전하세", "2024-08-01", "2024-09-30"},
		};
		
		int cnt = 0;
		
		int findIdx = 0;
		
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j].contains(w)) {
					System.out.println("작성자 : "+ list[i][0]);
					System.out.println("글 제목 : "+ list[i][1]);
					System.out.println("\""+ w  + "\" " + "문자가 포함되어 있는 문장의 인덱스" + "(" + i + "." + j + ")");
					System.out.println();
					if(j == 2) {
						System.out.println(list[i][j]);
					} else if(j == 0) {
						System.out.println("찾은 작성자 : " + list[i][j]);
					} else if(j == 1) {
						System.out.println("찾은 글 제목 : " + list[i][j]);
					} else if(j == 3) {
						System.out.println("찾은 이벤트 시작일 : " + list[i][j]);
					} else if(j == 4) {
						System.out.println("찾은 이벤트 마감일 : " + list[i][j]);
					}
					System.out.println();
					cnt += 1;
				}
			}
		}
		
		String[][] findArr = new String[cnt][];
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j].contains(w)) {
					findArr[findIdx] = list[i];
					findIdx++;
				}
			}
		}
		
		System.out.println("검색 결과가 총 " + cnt + "개 나왔습니다.");
		
		
		
		int pageCnt1;
		
		if (cnt >= 2) {
			System.out.println("검색 결과가 총 " + cnt + "개 나왔습니다.");
			System.out.println("페이지 당 몇개로 보시겠습니까?");
			@SuppressWarnings("resource")
			int pageInput = new Scanner(System.in).nextInt();
			
			if(pageInput > cnt) {
				System.out.println("잘못된 값을 입력하였습니다.");
			}
			
			if(cnt % pageInput == 0) {
				pageCnt1 = (int)cnt / pageInput;
			} else {
				pageCnt1 = (int)cnt / pageInput + 1;
			}
			
			
			System.out.println("검색 결과과 총 " + pageCnt1 + " 페이지 나왔습니다.");
			System.out.println("몇 페이지 보시겠습니까?");
			
			@SuppressWarnings("resource")
			int arrInput = new Scanner(System.in).nextInt();
			
			if(arrInput > pageCnt1) {
				System.out.println("잘못된 값을 입력하였습니다.");
			}
			
			int pageNum = pageInput * (arrInput - 1);
			int pageLastNum = pageInput * arrInput;
			
			if(pageLastNum > findArr.length) {
				pageLastNum = findArr.length;
			}
			
			for(int i = pageNum; i < pageLastNum; i++) {
				System.out.println("[" + i + "]");
				for(int j = 0; j < findArr[i].length; j++) {
					System.out.println(findArr[i][j]);
				}
				System.out.println();
			}
			
			System.out.print("첫 페이지 이전 10개  ");
			for(int i = 1; i <= pageCnt1; i++) {
				if(arrInput == i) {
					System.out.print("\u001B[31m [" + i + "] \u001B[0m");
				} else {
					System.out.print(" [" + i + "] ");
				}
			}
			System.out.println("  다음 10개 끝 페이지");
			System.out.println("---------------------------------------------------------------");
		} else if(cnt == 0) {
			System.out.println("찾는 문자가 없습니다.");
		    System.out.println("입력값 : " + w);
		}
		
		System.out.println("하고 싶은 작업이 있으신가요? 숫자로 입력해주세요");
		System.out.println("1. 글 삭제");
		System.out.println("2. 글 업데이트");
		System.out.println("3. 글 등록");
		
		@SuppressWarnings("resource")
		int play = new Scanner(System.in).nextInt();
		
		if(play == 1) {
			System.out.println("글 삭제를 선택하였습니다.");
			System.out.println("어떤 문자가 포함된 글을 삭제하시겠습니까?");
			@SuppressWarnings("resource")
			String deletePost = new Scanner(System.in).next();
			
			int findPostCnt = 0;
			
			
			for(int i=0; i<list.length; i++) {
				for(int j=0; j<list[i].length; j++) {
					if(list[i][j].contains(deletePost)) {
						System.out.println("[" + (i + 1) + "]");
						System.out.println("작성자 : "+ list[i][0]);
						System.out.println("글 제목 : "+ list[i][1]);
						System.out.println("글 내용 : "+ list[i][2]);
						System.out.println("이벤트 시작일 : "+ list[i][3]);
						System.out.println("이벤트 마감일 : "+ list[i][4]);
						System.out.println();
						findPostCnt++;
					}
				}
			}
			
			System.out.println();
			System.out.println("---------------------------------------------------------------");
			System.out.println();
			
			
			if(findPostCnt == 0) {
				System.out.println("찾는 문자가 없습니다.");
			    System.out.println("입력값 : " + deletePost);
			}
			
			
			String[][] findDelArr = new String[findPostCnt][];
			int findDelIdx = 0;
			
			
			for(int i=0; i<list.length; i++) {
				for(int j=0; j<list[i].length; j++) {
					if(list[i][j].contains(deletePost)) {
						findDelArr[findDelIdx] = list[i];
						findDelIdx++;
					}
				}
			}
			
			System.out.println("몇번 지우시겠습니까? (다중 선택 불가)");
			
			@SuppressWarnings("resource")
			int deletePostNum = new Scanner(System.in).nextInt();
			int delPoNo = deletePostNum - 1;
			
			
			System.out.println(deletePostNum + "번을 선택하였습니다.");
			
			int findPostCntQ = findDelArr.length - 1;
			
			String[][] findDelArrResult = new String[findPostCntQ][];
			int findDelResultIdx = 0;
			
			for(int i=0; i<findDelArr.length; i++) {
				if(i != delPoNo) {
					findDelArrResult[findDelResultIdx] = findDelArr[i];
			        findDelResultIdx++;
				}
			}
			

			
			
			System.out.println("삭제 후 결과값입니다.");
			
			if(findDelArrResult.length == 0) {
				System.out.println("결과값이 모두 삭제되었습니다.");
			}
			

			
			for(int i=0; i<findDelArrResult.length; i++) {
					System.out.println("[" + (i + 1) + "]");
					System.out.println("작성자 : "+ findDelArrResult[i][0]);
					System.out.println("글 제목 : "+ findDelArrResult[i][1]);
					System.out.println("글 내용 : "+ findDelArrResult[i][2]);
					System.out.println("이벤트 시작일 : "+ findDelArrResult[i][3]);
					System.out.println("이벤트 마감일 : "+ findDelArrResult[i][4]);
					System.out.println();
			}
			System.out.println("ㄳ");
			
		} else if (play == 2) {
			System.out.println("글 업데이트를 선택하였습니다.");
			System.out.println("어떤 문자가 포함된 글을 업데이트 하시겠습니까?");
			
			@SuppressWarnings("resource")
			String updatePost = new Scanner(System.in).next();
			
			int cCnt = 0;
			
			for(int i=0; i<list.length; i++) {
				for(int j=0; j<list[i].length; j++) {
					if(list[i][j].contains(updatePost)) {
						System.out.println("[" + (i + 1) + "]");
						System.out.println("작성자 : "+ list[i][0]);
						System.out.println("글 제목 : "+ list[i][1]);
						System.out.println("글 내용 : "+ list[i][2]);
						System.out.println("이벤트 시작일 : "+ list[i][3]);
						System.out.println("이벤트 마감일 : "+ list[i][4]);
						System.out.println();
						cCnt++;
					}
				}
			}
			
			String [][] arrFindPost = new String[cCnt][];
			int cCcCnt = 0;
			
			for(int i=0; i<list.length; i++) {
				for(int j=0; j<list[i].length; j++) {
					if(list[i][j].contains(updatePost)) {
						arrFindPost[cCcCnt] = list[i];
						cCcCnt++;
					}
				}
			}
			

			System.out.println("몇 번째 검색결과를 업데이트 하시겠습니까?");
			
			@SuppressWarnings("resource")
			int updatePostNo = new Scanner(System.in).nextInt();
			int chooseUpt = updatePostNo - 1;
			
			String [][] oneChoArr = new String[1][];
			
			for(int i = 0; i<arrFindPost.length; i++) {
				if(i == chooseUpt) {
					oneChoArr[0] = arrFindPost[chooseUpt];
				}
			}
			
			System.out.println("어떤 값을 바꾸시겠습니까? 숫자로 입력해주세요.");
			System.out.println("1. 작성자");
			System.out.println("2. 글 제목");
			System.out.println("3. 글 내용");
			System.out.println("4. 이벤트 시작일");
			System.out.println("5. 이벤트 마감일");
			
			@SuppressWarnings("resource")
			int updatePostCon = new Scanner(System.in).nextInt();
			
			if(updatePostCon <= 0 && updatePostCon >= 6) {
				System.out.println("잘못된 값을 입력하였습니다.");
			}
			
			System.out.println("뭐라고 바꾸시겠습니까?");
			
			@SuppressWarnings("resource")
			String updatePostConStr = new Scanner(System.in).next();
			
			
			for(int i = 0; i < oneChoArr[0].length; i++) {
				if(updatePostCon == i) {
					oneChoArr[0][i] = updatePostConStr;
				}
			}
			
			System.out.println("수정되었습니다.");
			
			System.out.println("작성자 : "+ oneChoArr[0][0]);
			System.out.println("글 제목 : "+ oneChoArr[0][1]);
			System.out.println("글 내용 : "+ oneChoArr[0][2]);
			System.out.println("이벤트 시작일 : "+ oneChoArr[0][3]);
			System.out.println("이벤트 마감일 : "+ oneChoArr[0][4]);
			System.out.println();
			

		} else if(play == 3) {
			System.out.println("글 추가를 선택하였습니다.");
			
			
			System.out.println("작성자 : ");
			@SuppressWarnings("resource")
			String add1 = new Scanner(System.in).next();
			
			System.out.println("글 제목 : ");
			@SuppressWarnings("resource")
			String add2 = new Scanner(System.in).next();
			
			System.out.println("글 내용 : ");
			@SuppressWarnings("resource")
			String add3 = new Scanner(System.in).next();
			
			System.out.println("이벤트 시작일 : ");
			@SuppressWarnings("resource")
			String add4 = new Scanner(System.in).next();
			
			System.out.println("이벤트 마감일 : ");
			@SuppressWarnings("resource")
			String add5 = new Scanner(System.in).next();
			
			
			
			String[][] newList = new String[list.length + 1][];
			
			for (int i = 0; i < list.length; i++) {
			    newList[i] = list[i];
			}

			newList[list.length] = new String[] {add1, add2, add3, add4, add5};
			
			list = newList;

			for (int i = 0; i < newList.length; i++) {
	            System.out.println("작성자 : "+ newList[i][0]);
	    		System.out.println("글 제목 : "+ newList[i][1]);
	    		System.out.println("글 내용 : "+ newList[i][2]);
	    		System.out.println("이벤트 시작일 : "+ newList[i][3]);
	    		System.out.println("이벤트 마감일 : "+ newList[i][4]);
	            System.out.println();
	        }
			System.out.println("추가되었습니다.");
			
		} else if(play == 4) {
			System.out.println("어서오세요!");
			System.out.println("어떤 작업을 하고 싶으신가요?");
			System.out.println("1. n개로 나누었을 때 nn 페이지의 첫 번째 쪽");
			System.out.println("2. n개로 나누었을 때 nn 페이지의 마지막 쪽 ");
			System.out.println("3. FirstPostIndex");
			System.out.println("4. LastPostIndex");
			System.out.println("5. 전체 글 조회");
			
			@SuppressWarnings("resource")
			int hiddenJob = new Scanner(System.in).nextInt();
			
			if(hiddenJob == 1) {
				System.out.println("한 페이지 당 몇개씩 나눌까요?");
				
				@SuppressWarnings("resource")
				String nn = new Scanner(System.in).next();
				
			} else if (hiddenJob == 2) {
				System.out.println();
			} else if (hiddenJob == 3) {
				System.out.println("1Page");
			} else if (hiddenJob == 4) {
				System.out.println(list.length + "Page");
			} else if (hiddenJob == 5) {
				for (int i = 0; i < list.length; i++) {
		            System.out.println("작성자 : "+ list[i][0]);
		    		System.out.println("글 제목 : "+ list[i][1]);
		    		System.out.println("글 내용 : "+ list[i][2]);
		    		System.out.println("이벤트 시작일 : "+ list[i][3]);
		    		System.out.println("이벤트 마감일 : "+ list[i][4]);
		            System.out.println();
		        }
			} else {
				System.out.println("잘못된 값을 입력하였습니다.");
			}
			
		} else{
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
