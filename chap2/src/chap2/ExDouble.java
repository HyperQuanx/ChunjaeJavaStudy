package chap2;

public class ExDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 1D;
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println("Double Num : " + dnum);
		// 오류가 발생함
	}

}
