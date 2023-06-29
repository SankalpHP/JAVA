package inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost = -1 ;
    }

    BoxPrice(BoxPrice old){
        super(old);
        this.cost = old.cost ;
    }

    public BoxPrice(BoxWeight old, double cost) {
        super(old);
        this.cost = cost;
    }

    public BoxPrice(int l, int h, int w, int weight, double cost) {// access the previous class constructor values i.e in BoxWeight which we extends here
        super(l, h, w, weight);
        this.cost = cost;
    }
}
