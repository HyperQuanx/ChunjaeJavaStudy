package chap8;
class Job extends Human {
    public String jobNo;
    Job() {
        super();
    }
    Job(int age, String name, String jobNo) {
        super(age, name);  // 부모 클래스의 매개변수가 있는 생성자 호출
        this.jobNo = jobNo;
    }
    public void goToCompany() {
        System.out.println("회사가기");
    }
    
    @Override
	public void sleep() {
    	super.sleep();
		//System.out.println("직장인의 잠자기"); //부모 매서드 재정의
	}
}