package OOPs.Properties.Inheritance;

public class Main {
    public static void main(String[] args){
//        Box box1 = new Box(4 );
//        Box box2 = new Box(5,6,7);
//        Box box3 = new Box(33,1);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
//        System.out.println(box3.l+ " " + box3.w);

        BoxWeight box4 = new BoxWeight();
        BoxWeight box5 = new BoxWeight(4,5,7,8);
        System.out.println(box4.h + " " + box4.weight);
    }
}
