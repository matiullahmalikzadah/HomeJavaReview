package Class20;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble[] arr={new Car(),new Dog()};
        for (MoveAble a:arr){
            a.move();
        }
    }
}
