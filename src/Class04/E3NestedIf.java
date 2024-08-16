package Class04;

public class E3NestedIf {
    public static void main(String[] args) {

        boolean winter = false;
        String jacketColor = "Blue";

        if (winter == true){
            System.out.println("it is very cold");

            if (jacketColor.equals("Red")){
                System.out.println("lets go out side");
            }else {
                System.out.println("lets go with blue jackets ");
            }
        }else {
            System.out.println("no need to war jackets");
        }
    }
}
