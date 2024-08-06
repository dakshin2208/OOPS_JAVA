package OOPs;

public class humanclass {
    int age ;
    String name;
    int salary;
    boolean married;
    static long population;
//constructor
    //many instance can access constructor
    public humanclass(int age ,String name , int salary,boolean status){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = status;
        humanclass.population +=1;
    }
// class krishna:
   // def__init__(self):
    //self.name = name
}
