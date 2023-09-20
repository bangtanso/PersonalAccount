public class Main {
    public static void main(String[] args) {
        PersonalAccount pa = new PersonalAccount(250000, "Aiperi");
        pa.deposit(5000);
        pa.deposit(10000);
        pa.withdraw(3000);
        pa.withdraw(14000);
        System.out.println(pa.getBalance());
        pa.printTransactionHistory();

    }
}