public class Livestock extends Spawnegg {
    public String product;
    public Livestock(String name,int heart, String productname, Point sposition){
        super(name, heart, sposition);
        this.product = productname;
    }
}
