package Class15;

public class Student {
    private String name;
    private double Marks1;
    private double Marks2;
    private double Marks3;
    public Student(String sname,double sMarks1, double sMarks2,double sMarks3){
        name=sname;
        Marks1=sMarks1;
        Marks2=sMarks2;
        Marks3=sMarks3;
    }
    public void printAvg(){
        double avg=0;
        avg=(Marks1+Marks2+Marks3)/3;
        System.out.println(name+ " Got "+avg);
    }
}
