package chap8;

public class Student extends Human {
	Student() {
		super();
	}
	Student(int age, String name, int grade) {
		super(age, name);
		// super 는 부모 클래스의 프로퍼티나 메서드를 직접 호출할 때 사용함
		this.grade = grade;
	}
	
	int studentNo;
	int grade;
	
	public int getStudentNo() {
		return this.studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void goToSchool () {
		System.out.println(super.getName());
		System.out.println("Go To School");
	}
	
}
