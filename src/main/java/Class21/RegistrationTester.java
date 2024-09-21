package Class21;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration r=new Registration("ahmad@yahoo.com","User123",
                "12656666");

        System.out.println("Email: "+ r.getEmail());
        System.out.println("UserName: " + r.getUserName());
        System.out.println("password: " + r.getPassword());

    }
}
