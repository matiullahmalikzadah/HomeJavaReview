package Class07;

public class E10Array {
    public static void main(String[] args) {
        String[] fruit={"apple","bana","oringe","Strabarray"};
        System.out.println(fruit.length);
        fruit[3]="Papay";
        for (int i = 0; i<fruit.length; i++) {
            System.out.println(fruit[i]);
        }
    }
}
