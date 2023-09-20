import java.sql.SQLOutput;
import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList<Amount>();


    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void deposit (double amount){
        this.balance = this.balance + amount;
        Amount a1 = new Amount(amount, "deposit");
        this.transactions.add(a1);

    }

    public void withdraw(double amount){
        if(balance >= amount) {
            this.balance = this.balance - amount;
            Amount a1 = new Amount(amount, "withdraw");
            this.transactions.add(a1);
        } else System.out.println("not enough");
    }

    public void printTransactionHistory(){
        for (Amount a1: transactions){
            System.out.println(a1);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
