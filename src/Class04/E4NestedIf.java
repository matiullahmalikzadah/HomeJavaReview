package Class04;

public class E4NestedIf {
    public static void main(String[] args) {

        boolean diploma=false;
        float gpa=3.6f;

        if (diploma == true){
            System.out.println("Congratulations");
        }else {
            if (gpa>=3.5){
                System.out.println("you are eligible");
            }else {
                System.out.println("you should study hard ");
            }
            System.out.println("to get degree");
        }

    }
}
