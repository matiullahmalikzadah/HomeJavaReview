package Class10;

public class E12StringDemo {
    public static void main(String[] args) {

        String name="Ahmad";
        String pass="jon123";
        String confirmpass="jon345";
        if (name.isEmpty()||pass.isEmpty()){
            System.out.println("the name and password can not be empty");
        } else if (pass.length()<10) {
            System.out.println("Password is too short");
        } else if (pass.contains(name)) {
            System.out.println("password can not be contain with the name");
        }else if (!pass.equals(confirmpass)){
            System.out.println("the password sis not match");
        }else {
            System.out.println("your username and password has been created");
        }


    }
}
