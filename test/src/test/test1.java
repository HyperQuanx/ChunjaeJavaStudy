package test;

public class test1 {

	public static void main(String[] args) {
		int num1 = 1;
        int num2 = 2;
        
        int sum = add(num1, num2);
        System.out.println(num1 + "+" + num2 + " = " + sum);
	}
	
    public static int add(int n1, int n2) {
    	return n1 + n2;
    }
}