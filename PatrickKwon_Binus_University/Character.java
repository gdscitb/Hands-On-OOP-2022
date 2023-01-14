
abstract class Character implements IBaseComponent{
  private String name;
  private int hp;
  private int mp;
  private int atk;
  private int def;
  private int spd;
  private int level;
  private int exp;
  private int max_exp;
  public Character(String name,int hp,int mp,int atk,int def,int spd,int level){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
    this.atk = atk;
    this.def = def;
    this.spd = spd;
    this.level = level;
    this.exp = 0;
    this.max_exp = 2;
  }
  public Character(String name){
    this.name = name;
    this.hp = 100;
    this.mp = 100;
    this.atk = 10;
    this.def = 10;
    this.spd = 10;
    this.level = 1;
    this.exp = 0;
    this.max_exp = 2;
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
  public void setExp(int exp){
    this.exp = exp;
    CheckLevelUp();
  }
  void levelUp(){
    this.level +=1;
    this.hp = this.hp * 2;
    this.mp = this.mp * 2;
    this.atk = this.atk * 2;
    this.def = this.def * 2;
    this.spd = this.spd * 2;
    this.exp = 0;
    this.max_exp = this.max_exp * 2;
  }
  void CheckLevelUp(){
    if(this.exp >= this.max_exp){
      this.levelUp();
    }
  }
  public void printDetails(){
    System.out.println("Name: " + this.name);
    System.out.println("HP: " + this.hp);
    System.out.println("MP: " + this.mp);
    System.out.println("ATK: " + this.atk);
    System.out.println("DEF: " + this.def);
    System.out.println("SPD: " + this.spd);
    System.out.println("Level: " + this.level);
    System.out.println("EXP: " + this.exp);
    System.out.println("Max EXP: " + this.max_exp);
  }
  public void attack(IBaseComponent other){
    int damage = this.atk - other.getDef();
    if(damage < 0){
      damage = 0;
    }
    other.setHp(other.getHp() - damage);
    System.out.println(this.name + " attacked " + other.getName() + " for " + damage + " damage!");
  }
}