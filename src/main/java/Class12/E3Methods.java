package Class12;

public class E3Methods {

    /*
    create a method that will talke two int number as input and
    return the larger number call the method in the different class
    and print the result.
     */

    int numbers(int num1, int num2){
        int res;
        if (num1>num2){
            res=num1;
        }else {
            res=num2;
        }
      return res;
    }
}
