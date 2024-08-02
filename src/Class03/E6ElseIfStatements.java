package Class03;

public class E6ElseIfStatements {
    public static void main(String[] args) {

        String fruit= "apple";
        if (fruit.equals("orange")){
            System.out.println("price is 5$");
        } else if (fruit.equals("banana")) {
            System.out.println("price is 6");
        } else if (fruit.equals("apple")) {
            System.out.println("price is 10");
        }else {
            System.out.println("it is out side of store");
        }
    }
}
