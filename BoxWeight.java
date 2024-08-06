package OOPs.Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight =-1;
    }
    public BoxWeight(double l ,double h,double w , double weight ){
        super(l,w,h);// call the parent call constructor
        //used to initialise the value present in parent class

        this.weight = weight;
    }
}
