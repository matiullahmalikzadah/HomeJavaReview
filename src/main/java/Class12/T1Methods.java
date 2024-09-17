package Class12;
/*
create a method that will take 2 parameters as a number and
print which number is larger.
*/

//note it wii execute the T1Tester class

public class T1Methods {

    void printLargerNumber(int number1,int number2){
        if (number1>number2){
            System.out.println("Larger number is " + number1);
        }else {
            System.out.println("larger number is "+ number2);
        }
    }
    /*
    Create a method that will take a number and prints whether the
    number is even or odd.
     */
    void checkEvenOdd(int num){
        if (num%2==0) {
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num+" is an odd number");
        }
    }
}
