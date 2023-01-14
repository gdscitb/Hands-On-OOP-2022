public abstract class Monster implements IBaseComponent{
  private String name;
  private int hp;
  private int mp;
  private int atk;
  private int def;
  private int spd;
  private int level;
  public Monster(String name,int hp,int mp,int atk,int def,int spd,int level){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
    this.atk = atk;
    this.def = def;
    this.spd = spd;
    this.level = level;
  }
  public Monster(String name){
    this.name = name;
    this.hp = 100;
    this.mp = 100;
    this.atk = 10;
    this.def = 10;
    this.spd = 10;
    this.level = 1;
  }
  public String getName(){
    return this.name;
  }
  public int getHp(){
    return this.hp;
  }
  public int getMp(){
    return this.mp;
  }
  public int getAtk(){
    return this.atk;
  }
  public int getDef(){
    return this.def;
  }
  public int getSpd(){
    return this.spd;
  }
  public int getLevel(){
    return this.level;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setHp(int hp){
    this.hp = hp;
  }
  public void setMp(int mp){
    this.mp = mp;
  }
  public void setAtk(int atk){
    this.atk = atk;
  }
  public void setDef(int def){
    this.def = def;
  }
  public void setSpd(int spd){
    this.spd = spd;
  }
  public void setLevel(int level){
    this.level = level;
  }
  public void attack(IBaseComponent other){
    int damage = this.atk - other.getDef();
    if(damage < 0){
      damage = 0;
    }
    other.setHp(other.getHp() - damage);
    System.out.println(this.name + " attacked " + other.getName() + " for " + damage + " damage!");
  }
  public void printDetails(){
    System.out.println("Name: " + this.name);
    System.out.println("HP: " + this.hp);
    System.out.println("MP: " + this.mp);
    System.out.println("ATK: " + this.atk);
    System.out.println("DEF: " + this.def);
    System.out.println("SPD: " + this.spd);
    System.out.println("Level: " + this.level);
  }
}