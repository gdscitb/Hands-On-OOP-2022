public class Player{
    public String name;
    public Point position;
    public int lives;
    public Player(String playername){
        this.name = playername;
        this.position = new Point(0,0);
        this.lives = 20;
    }

}