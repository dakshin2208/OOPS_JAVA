package OOPs;

public class main {
    public static void main(String[] args) {
        //constructor overloading many object is using same constructor   very important stuff`
        humanclass kumar = new humanclass(22,"ram",100000,true);
        humanclass ash = new humanclass(23 , "ash" ,200000,false);
        humanclass krishna = new humanclass(17,"krishnna",100000,true);

        System.out.println(kumar.married);
        System.out.println(ash.salary);
        System.out.println(krishna.age);

    }
}
