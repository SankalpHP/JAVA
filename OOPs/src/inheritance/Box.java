package inheritance;

public class Box  {

    private double l;
    int h;
    int w;

    public double getL() {
        return l;
    }

    Box(){
       this.l = -1;
       this.h = -1;
       this.w = -1;
    }

    Box(Box old){

        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public Box(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }


}
