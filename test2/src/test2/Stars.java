package test2;

import java.util.Scanner;

public class Stars {
	
	Scanner a = new Scanner(System.in);
	
	int b = a.nextInt();
	
	String s = "*";
	
	// 증가 후 감소
	public void star() {
		for(int i = 1; i <= b; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
		for(int k = b - 1; k > 0; k--) {
			for(int u = 0; u < k; u++) {
				System.out.print(s);
			}
		}
	}
	
	// 우측정렬
	public void starRightAlignment() {
		for(int k = 1; k <= b; k++) {
			for(int i = b - k; i > 0; i--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= k; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
	// 마름모
	public void starRhombus() {
		for(int i = 1; i <= b; i += 2) {
			for(int j = b - i; j > 0; j -= 2) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(s);
			}
			System.out.println();
		}
		
//		System.out.println(b);
		
		for(int i = 1; i <= b; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = b - i; k > 0; k -= 2) {
				System.out.print(b);
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		Stars st = new Stars();
		
//		st.star();
//		st.starRightAlignment();
		st.starRhombus();
		
	}
}
