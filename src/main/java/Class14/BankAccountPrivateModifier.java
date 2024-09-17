package Class14;

public class BankAccountPrivateModifier {

   private String name="Fahim";
    private String userName="Fahim123";
    private String UserPassword="pass123";
    private double accountBalance=3000;
    private String  accountNumber="123455";

    public static void main(String[] args) {
        BankAccountPrivateModifier b=new BankAccountPrivateModifier();
        System.out.println(b.name);
    }
}
