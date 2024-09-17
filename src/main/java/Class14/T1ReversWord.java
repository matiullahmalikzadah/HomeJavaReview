package Class14;
/*
how would you reverse a String word by word? for example
    input=> this is sentence i want to reverse
    output=> siht si ecnetnes i tnaw ot esrever
 */
public class T1ReversWord {
    public static void main(String[] args) {

        String st="this is sentence i want to reverse";
        String [] arr=st.split(" ");

       for (int i = 0; i < arr.length; i++) {
            String word=arr[i];
            String d=reverseStr(word);
           System.out.print(d+" ");
        }




    }
    static String reverseStr(String dd){
        String reversed="";
        for (int i = dd.length()-1;i>=0; i--) {
            reversed=reversed+dd.charAt(i);
        }
        return  reversed;
    }
}
