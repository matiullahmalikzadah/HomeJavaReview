package Class07;

public class E6NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
