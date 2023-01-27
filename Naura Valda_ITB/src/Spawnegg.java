public class Spawnegg extends Item{
    public int lives;
    public Point position;
    public Spawnegg(String name, int heart, Point sposition){
        super(name);
        this.lives = heart;
        this.position = sposition;
    }
}
