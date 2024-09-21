package Class21;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        setEmail(email);
        setUserName(userName);
        setPassword(password);
    }
    public void setEmail(String email){
        if (email.contains("yahoo")){
            this.email=email;
        }else{
            System.out.println("not allowed other type of email");
        }
    }

    private void setUserName(String userName){
        if (!userName.isEmpty()&& userName.length()>6){
            this.userName=userName;
        }else {
            System.out.println("userName does not complete ");
        }
    }
    private void setPassword(String password){
        if (!password.isEmpty()&& password.length()>6&& password!=userName){
            this.password=password;
        }else{
            System.out.println("password does not complete");
        }
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getUserName(){
        return userName;
    }
}

