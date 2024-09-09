package chap14;

import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	
//		error 01
//		public static void main(String[] args) throws ClassNotFoundException {
//			Class cls = Class.forName("java.lang.Object");
//		}
		
//		error 02
//		public static void main(String[] args) throws IOException  {
//			InputStreamReader isr = new InputStreamReader(System.in);
//			isr.read();
//		}

// 		error 03
//		public static void main(String[] args) throws FileNotFoundException {
//			FileInputStream fis = new FileInputStream("text.txt");
//		}
		
//		error 04
//		public static void main(String[] args) {
//			int a = 3;
//			int b = 0;
//			int c = 0;
//			c = a/b;
//			System.out.println(3/0);
//		}
	
// 		error 05
//		public static void main(String[] args) {
//			int num = Integer.parseInt("10!");
//			System.out.println(num);
//		}
	
//		public static void main(String[] args) {
//			int n = null;
//			System.out.println(n);
//		}

//		try catch 구문 예제
	
		
//		public static void main(String[] args) {
//			InputStreamReader isr = null;
//			try {
//				isr = new InputStreamReader(System.in);
//				System.out.println(isr.read());
//			} catch(IOException e) {
//				// 예외처리
//			} finally {
//				if (isr != null) {
//					try {
//						isr.close();
//					} catch (IOException e) {
//						// 예외처리
//					}
//				}
//			}
//			
//			// OR
//			
//			try(InputStreamReader isr2 = new InputStreamReader(System.in)) {
//				System.out.println(isr2.read());
//			} catch(IOException e) {
//				// 예외처리
//			} catch(Exception e) {
//				// 예외처리
//			}
//			
//		}
	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
//			AClose aa = null;
//			try {
//				aa = new AClose("파일1");
//				aa.abc();
//			} catch(Exception e) {
//				System.out.println("예외처리");
//			} finally {
//				if(aa.rsc != null) {
//					try {
//						aa.close();
//					} catch(Exception e) {
//						//
//					}
//				}
//			}
//			
//			// or
//			
//			try (AClose aa2 = new AClose("파일2")) {
//				aa2.abc();
//			} catch(Exception e) {
//				System.out.println("예외처리2");
//			} 
			
			
//			MyClass my1 = new MyClass();
//			MyClass my2 = new MyClass("예외메시지1");
			
			//throw my1;
			//throw my2;
			
//			throw new MyClass();
//			throw new MyClass("예외메시지 1-1");
			
			
//			// 함수 내에서 예외처리
//			EClass my1 = new EClass();
//			my1.bcd_1();
//			
//			// 전가
//			RClass my2 = new RClass();
//			my2.bcd_2();
			
			ExceptionNumber my3 = new ExceptionNumber();
			my3.exNum(-123);
		}
		
		
}

