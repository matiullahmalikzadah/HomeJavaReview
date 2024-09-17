package Class12;
/*
Create a method create Email(). Based on values of users
firstName, LastName, and email type, your method should return
complete email address. Example: createEmail(hojn,Snow, gmail) -> johnsnow@gmail.com
*/



public class T4Methods {

    String createEmail(String fName, String lName, String emailType){

        return fName+lName+"@"+emailType+".com";
    }

}
