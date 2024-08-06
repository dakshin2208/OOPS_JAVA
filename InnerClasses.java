package OOPs;

public class InnerClasses {

    static class test{
        String name ;
        public test (String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test a = new test("dakshin");
        test b = new test("kumar");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
