package week4.composition.ex25;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "John Doe", 'M');
        Account account1 = new Account(1001, customer1, 500.0);

        System.out.println("Initial Account Information:");
        System.out.println(account1);

        System.out.println("\nDepositing $200 to Account:");
        account1.deposit(200);
        System.out.println(account1);

        System.out.println("\nWithdrawing $100 from Account:");
        account1.withdraw(100);
        System.out.println(account1);

        System.out.println("\nWithdrawing $800 from Account (exceeding balance):");
        account1.withdraw(800);
        System.out.println(account1);
    }
}
