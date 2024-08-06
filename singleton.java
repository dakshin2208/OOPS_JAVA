package OOPs;
class Demo{
    static Demo obj = null;

    public static Demo getInstance(){
        if(obj==null){
            obj = new Demo();
        }
        return obj;
    }
 public void display(){
        System.out.println("Hello");
 }
}

public class singleton {
    public static void main(String[] args){
        Demo o = Demo.getInstance();
        o.display();
    }
}
