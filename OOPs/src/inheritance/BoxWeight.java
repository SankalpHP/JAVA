package inheritance;

public class BoxWeight extends Box{

    int weight;

    BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(int weight) {
        this.weight = weight;
    }

    BoxWeight(BoxWeight old){
        this.weight = old.weight;
    }

    public BoxWeight(int l, int h, int w, int weight) {
        super(l, h, w);// access the previous class constructor values of Box constructor which we extends here -1 -1 -1 
        this.weight = weight;
    }
}
