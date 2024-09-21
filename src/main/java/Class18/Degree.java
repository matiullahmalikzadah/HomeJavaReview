package Class18;

public class Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
    class Bachelors extends Degree{

    }
    class masters extends Degree{
        @Override
        public void getPrerequisite() {
            System.out.println("you will get number if you have bachelor degree");
        }
    }
    class Tester{
        public  void main(String[] args) {
            Degree obj2=new Degree();
            obj2.getPrerequisite();



        }
    }
}
