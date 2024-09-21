package Class21;

public class BankAccount {

    private String  name;
    final private long bankAccountNumber;
    private double balance;
    final private String UserName;
    private String password;
    final private String accountType;

    public BankAccount(String name, long bankAccountNumber, double balance,
                       String userName, String password, String accountType) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.UserName = userName;
        this.password = password;
        this.accountType = accountType;
    }
    public BankAccount( long bankAccountNumber,
                       String userName, String password,String accountType) {

        this.bankAccountNumber = bankAccountNumber;
        this.UserName = userName;
        this.password = password;
        this.accountType=accountType;

    }

    public BankAccount(
                       String userName,String accountType,long bankAccountNumber) {

        this.bankAccountNumber = bankAccountNumber;
        this.UserName = userName;
        this.accountType = accountType;
    }

    //Note: if we want to print the one of the above value we should write return type like:
    public String getName(){
        return name;
    }

    public long getAccountNumber(){
        return bankAccountNumber;
    }
    //Note: this is setter method  and getter method  used for change the value
    void setName(String name){
        this.name=name;
    }
}
