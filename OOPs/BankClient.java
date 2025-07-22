package OOPs;

public class BankClient {
    public static void main(String[] args) {
        BankDetails user = new BankDetails(500);

        user.name = "Shyam";

        System.out.println(user.checkBalance());
        user.deposit(1000);
        System.out.println(user.checkBalance());
    }
}
