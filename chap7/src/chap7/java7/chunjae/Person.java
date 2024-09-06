package chap7.java7.chunjae;
public class Person {
	int age;
	String name;
	
	Person(){}
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void eat() {
		System.out.println("먹기");
	}
	
	public void sleep() {
		System.out.println("잠자기");
	}
}

class Student extends Person{
	Student(){
		super();
	}
	Student(int age, String name){
		
	}
	public String schoolNo;
	
	public void goToSchool() {
		System.out.println("학교가기");
	}
}

class Job extends Person{
	Job(){
		super();
	}
	public String jobNo;
	
	public void goToCompany() {
		System.out.println("회사가기");
	}
}


/*

String 클래스
	- 문자열 저장 클래스 타입
	- 문자열 " " 안에 표기 ( '' -> 문자 하나)
String 객체 생성 방법
	- String a = new String("문자열"); _> stack영역
	- String a = "문자열";
	
객체 내의 값은 변경 불가능 -> 새로운 객체를 생성하여 작성
	 - String a = "ABCDEFG";
	 - a[1] = "X" --> 안됨

리터럴을 사용하여 바로 데이터를 입력한 경우 -> 문자열이 같은 경우 하나의 객체를 공유
	 - String a = "안녕하세요";
	 - String b = "안녕하세요";
	 --> 메모리 공유함
문자열 연산
	- 문자열 + 문자열 -> 문자열 연결
	- 문자열 + 기본자료형 -> 문자열로 연결
	
String 관련 주요 메서드
	- length() : 문자열 길이
	- char
	
*/



/*
상속
상속을 구현할 때는 extends 예약어를 사용함 
extends 뒤에는 단 하나의 class만 사용할 수 있음(반드시)
상위 클래스는 하위클래스보다 일반적인 의미를 가짐
하위 클래스는 상위클래스보다 구체적인 의미를 가짐
*/



/*
1. 클래스의 구성 요소
- 프로퍼티(필드)
기초자료형
참조자료형(array, 사용자 정의 객체(클래스))
메서드

2. 클래스가 나오게 된 배경
변수로 작업 ------------> 배열 ----------------------> 구조체(구조는 클래스 유사, 상속 불가)
int score1                         int[] scores = {10,20,30,,,}    stucture Score{int[] scores = {10,20,30,,,}  }
int score2 ,,,,,,                                                               stucture Score2{int[] scores  = {10,20,30,,,} }


----> 클래스
class Score(){}

2. 절차지향형 vs 객체지향형
- 절차 : 프로그래밍 순서에 따라 단계적으로 실행하도록 명령어 나열
- 객체 : 객체를 구성하고 객체 단위로 프로그래밍(필드/메서드)

절차#1 : 자동차를 묘사- 컬러, 엔진 종류 지정
절차#2 : 운전자 이름, 면허번호 등 지정
============================== 여기까지 프로퍼티
절차#3 : 운전자가 자동차를 운전을 한다. 
절차#4 : 사람 감지 
절차#5 : 운전자가 자동차를 중지한다(Y) or 운전자가 자동차를 운전을 한다. (N)
--> 절차지향형(기능 중심)


3. 자바의 객체 지향 요소
- 일반 클래스

- 추상 클래스
class 키워드로 정의
클래스가 abstract 키워드로 정의되거나
추상메서드(abstract로 정의된 메서드) 하나 이상 가지고 있는 클래스 
일반 메서드 작성 가능
메서드 바디가 없음({} 뻬야함) 생성자 없음
메서드에 abstract  있으면 클래스에 정의되지 않아도 abstract 임

- 인터페이스
interface 로 정의, 여러 개 상속받을 수 있음 생성자 없음
모든 필드는 public static final
모든 매서드는 public abstract

일반클래스
class A{
int m;
int n;

void abc(){}
String aa(){}
}

추상클래스
abstract class A{
 int m;
 int n;

 void abc();
 String aa();
}

class A{
 int m;
 int n;

 abstract void abc();
 String aa();
}


인터페이스 (public/static/final  : 전역상수)
interface class A{
 public static final int m; 
 public static final int n;

 public abstract void abc();
 public abstract String aa();
}

클래스는 클래스 키워드 정의 멤버 필드 메서드를 가짐
멤버 메서드 바디가 존재 
abstract 키워드가 존재하면 바디가 없음 이는 추상 클래스
인터페이스는 인터페이스로 정의 

1. 자바의 접근 제한자
<범위 큼>
public : 동일 패키지 모든 클래스 + 다른 패키지의 모든 클래스
protected : 동일 패키지 모든 클래스 + 다른 패키지의 자식 클래스 (상속 받은 클래스)
default (아무것도 없을 때) : 동일 패키지의 모든 클래스
private : 동일 클래스에서만 사용 가능
<범위 좁음>


2. 클래서의 외부 구성 요소
- package ->디렉토리 정보
- import -> 외부라이브러리, 클래스 파일 임포트

3. 클래스의 내부 구성 요소
- 프로퍼티
- 메서드
- 생성자 
- 내부 클래스


1. 상속
- 부모 클래스의 내용(프로퍼티, 메서드, 이너클래스)을 자식 클래스가 내려받아(상속) 클래스 내부에 포함
=============================
<사람>
이름
나이
====== 
먹기()
잠자기()

<대학생>  필드 : 3 | 메서드 :3  (상속 받았기 때문에) 
학번
======
학교가기()


<직장인> 필드 : 3 | 메서드 : 3   (상속 받았기 때문에) 
사번
======
출근하기()











*/