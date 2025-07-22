package OOPs;

public class BankDetails {
    String name;
    private int amt;

    public BankDetails(int initial){
        amt = initial;
    }

    public void deposit(int amount){
        amt = amt + amount;
    }

    public int checkBalance(){
        return amt;
    }
}
