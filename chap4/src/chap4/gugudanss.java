package chap4;

public class gugudanss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 0; j <= 9; j++) {
			for(int i = 2; i <= 9; i++) {
				if (j == 0) {
					System.out.print(String.format("%9s",i + "단"));
					if (i == 9) {
						System.out.println();
					}
				} else {
					System.out.print(String.format("%10s", i + "X" + j + "= " + i * j));
					if (i == 9) {
						System.out.println();
					}
				}
			}
		}

	}
}
// 9일때 내려쓰기