public class Tool extends Item{
    public int durability;
    public int damage;
    public String desc;
    public Tool(String name, String description, int durability, int damage){
        super(name);
        this.durability = durability;
        this.damage = damage;
        this.desc = description;
    }
}
