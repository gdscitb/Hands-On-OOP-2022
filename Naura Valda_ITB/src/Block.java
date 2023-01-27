public class Block extends Item{
    public int hardness;
    public String color;
    public Block(String name, int hardness, String color){
        super(name);
        this.hardness = hardness;
        this.color = color;
    }
}
