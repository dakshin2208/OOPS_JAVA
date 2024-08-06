package OOPs;
public class Introduction {
    public static void main(String[] args) {
        name obj = new name("dakshin");
        System.out.println(obj.naam);

    }


}

 class name{
    String naam ;

     name(String name){
        this.naam = name;
    }
}
