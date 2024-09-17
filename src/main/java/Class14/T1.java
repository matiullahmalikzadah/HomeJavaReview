package Class14;
/*
create a method that will take a string as a parameter and returns reversed string. method
should be available to all classes within your project and accessible by class name.
 */
public class T1 {

    public static String reverseStr(String inputStr){
        String reversed="";
        for (int i=inputStr.length()-1;i>=0;i--){
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;
    }
}
