package Class16;

public class Person {

    private String name;
    private int age;
    private double weight;
    private char gender;

    private String haircolor;
    private int salary;

    public Person(String name,int age,double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public Person(String name,int age,double weight,char gender){
        //Note/: if instance variable and value will be the same name on that time we have to use this.  .
        // like: this.name=name;
        /*this.name=name;
        this.age=age;
        this.weight=weight;*/
        this(name,age,weight);
        this.gender=gender;
    }

    public Person(String name,int age,double weight,char gender,String haircolor,int salary){

        /*this.name=name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;*/
        this(name,age,weight,gender);
        this.haircolor=haircolor;
        this.salary=salary;
    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+weight+" "+gender+" "+haircolor
                +" "+salary);

    }


}
