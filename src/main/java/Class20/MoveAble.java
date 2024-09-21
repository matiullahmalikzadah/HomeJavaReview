package Class20;

public interface MoveAble {
    public abstract void move();
}

interface WashAbale{
    void wash();
}

class Dog implements MoveAble,WashAbale{
    public void move(){
        System.out.println("dog can jum run and can move");
    }

    @Override
    public void wash() {
        System.out.println("you can wash softly");
    }
}

class Car implements MoveAble{

    @Override
    public void move() {
        System.out.println("Car can move forward backwards and can go in circles ");
    }
}
