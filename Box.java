package OOPs.Properties.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double h , double w , double l ){
        this.h = h;
        this. w =w;
        this.l = l;

    }
    Box(double h , double w){
        this.h = h;
        this.w = w;
    }


}

