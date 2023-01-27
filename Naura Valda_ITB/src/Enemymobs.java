public class Enemymobs extends Spawnegg{
    public int damage;
    public Enemymobs(String name, int heart, int damage, Point sposition){
        super(name, heart, sposition);
        this.damage = damage;
    }
}
