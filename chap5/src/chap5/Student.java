package chap5;
// co.kr.chunjae.www
// co.kr.chunjae.api
// co.kr.chunjae.member
// 쌤이 쓰시는 클래스명


public class Student {
	// 기본 생성자는 사용자가 정의하지 않았을 경우 시스템이 객체 생성시에 자동 생성
	// 기본 생성자 : 클래스명() {}
	//		1. 리턴타입이 없다.
	//		2. 사용자가 정의하지 않아도 시스템 자동으로 생성해 줌.
	//		3. 사용자가 정의한 생성자가 존재할 경우 반드시 기본 생성자를 앞에 선언해 줘야 한다.
	// 생성자는 객체를 메모리에 할당하는 역할
	// 객체명 변수명 = new 객체명();
	
	// 함수 정의
	//	(접근제어자)   void/리턴할 자료의 형태   함수명() { return 자료형의 값 }
	//	 ↑ 생략 가능    ↑그냥 선언
	
	// 함수 사용법
	//		리턴타입이 없을 때 : 함수명();
	//		리턴타입이 있을 때 : 자료형 변수명 = 함수명();
	
	// 생성자가 메서드와 다른 점
	// 리턴 타입이 없다
	// 상속되지 않음
	// 클래스명과 같아야 함
	
	// 기본 생성자와 사용자 생성자의 차이
	// 자동 제공 여부: 기본 생성자는 클래스에 다른 생성자가 없을 경우 자동으로 제공되지만, 사용자 생성자는 직접 작성해야 한다.
	// 매개변수: 기본 생성자는 매개변수가 없고, 필드들을 기본값으로 초기화   사용자 생성자는 필요에 따라 매개변수를 통해 필드 값을 설정
	// 초기화의 유연성: 기본 생성자는 객체를 기본 상태로 초기화하는 반면, 사용자 생성자는 초기화 과정에서 다양한 값을 사용할 수 있어 더 유연하다.
	
	// 인스턴스화 : 메모리에 올리다.
	static int serailNo;
	int studentNo;
	String studentName;
	int grade;
	// char gender;
	private char gender; // private 면 이 클래스 내부에서만 조회 가능
	String rider;
	
	
	// 값을 초기화 하는 용도로 쓰임
//	Student() {
//		this.grade = 1;
//		this.gender = 'M';
//	}
	
	// 기본 생성자
	Student() {}
	
	
	
	// 사용자 정의 생성자
	// 사용자 정의 생성자를 사용하려면 무조건 위에 빈 껍데기를 만들어야 함.
	// 입력받은 값으로 초기화
	Student(int g, char gn) {
		this.grade = g;
		this.gender = gn;
	}
	
	// super : 부모 클래스의 생성자 사용하기
	
	
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		// char gender; 그러므로 이걸 가져오지 못함
		return this.gender; // this 를 사용하게 되면 클래스인 Student 에서 gender 를 찾게 된다.
	}
	
	public String getStudentInfo() {
		return this.studentName + ":" + this.gender + ":" + this.grade;
	}
	
	public String[] getStudentInfo2() {
		return null;
	}
	public String getRider() {
		return this.rider;
	}
	public void setRider(String rider) {
		this.rider = rider;
	}
	static public int getSerailNo() {
		return serailNo;
	}

	
	
// 맴버 변수나 매서드들의 Default : Public
}
