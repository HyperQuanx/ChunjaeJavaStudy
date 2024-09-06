package test2;

public class BankAccount {
    // 클래스 변수 (static 변수)
    private static int totalAccounts = 0;

    // 인스턴스 변수
    private String accountHolder;
    private double balance;

    // 생성자
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        totalAccounts++; // 계좌가 생성될 때마다 클래스 변수 증가
    }

    // 인스턴스 메서드
    public void deposit(double amount) {
        // 지역 변수
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println(amount + " deposited. New balance is " + balance);
    }

    // 인스턴스 메서드
    public void withdraw(double amount) {
        if (amount <= balance) {
            // 지역 변수
            double newBalance = balance - amount;
            balance = newBalance;
            System.out.println(amount + " withdrawn. New balance is " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // 클래스 메서드
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1000.0);
        BankAccount account2 = new BankAccount("Bob", 500.0);

        account1.deposit(200);
        account2.withdraw(100);

        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}
