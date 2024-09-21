package Class21;

public class BankAccounttester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Jan",12245345,34535,"matiM",
                "ahmad1432","checking");

       // BankAccount c=new BankAccount("Jan","saving",
            //    233);
        System.out.println(b.getName());
        System.out.println(b.getAccountNumber());
        b.setName("Shwan");
        System.out.println(b.getName());;


    }
}
