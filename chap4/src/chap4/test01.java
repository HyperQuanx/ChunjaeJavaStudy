package chap4;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1~100 사이의 3의 배수의 합
		// 2. 1~100 사이의 4의 배수의 합
		
		// int num1 = 1;
		
		int sum1 = 0;
		
		// int num2 = 1;
		int sum2 = 0;
		
		/*
		while(num1 <= 100) {
			if (num1 % 3 == 0) {
				sum1 += num1;
			}
			num1++;
		}
		
		while(num2 <= 100) {
			if (num2 % 4 == 0) {
				sum2 += num2;
			}
			num2++;
		}
		*/
		
		for (int num1 = 1; num1 <= 100; num1++) {
			if (num1 % 3 == 0) {
				sum1 += num1;
			}
		}
		
		for (int num2 = 1; num2 <= 100; num2++) {
			if (num2 % 4 == 0) {
				sum2 += num2;
			}
		}
		
		System.out.println("3의 배수의 합 : " + sum1);
		System.out.println("4의 배수의 합 : " + sum2);
	}

}
