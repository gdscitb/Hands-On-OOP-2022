class Goblin extends Monster{
  public Goblin(String name,int hp,int mp,int atk,int def,int spd,int level){
    super(name,hp,mp,atk,def,spd,level);
  }
  public Goblin(String name){
    super(name);
  }
}
class Ogre extends Monster{
  public Ogre(String name,int hp,int mp,int atk,int def,int spd,int level){
    super(name,hp,mp,atk,def,spd,level);
  }
  public Ogre(String name){
    super(name);
  }
}
class Troll extends Monster{
  public Troll(String name,int hp,int mp,int atk,int def,int spd,int level){
    super(name,hp,mp,atk,def,spd,level);
  }
  public Troll(String name){
    super(name);
  }
}
class Dragon extends Monster{
  public Dragon(String name,int hp,int mp,int atk,int def,int spd,int level){
    super(name,hp,mp,atk,def,spd,level);
  }
  public Dragon(String name){
    super(name);
  }
}
class MonsterFactory{
  public MonsterFactory(){}
  public Monster build(String name){
    if(name.equals("Goblin")){
      return new Goblin("Goblin",100,100,10,10,10,1);
    }else if(name.equals("Ogre")){
      return new Ogre("Ogre",100,100,10,10,10,1);
    }else if(name.equals("Troll")){
      return new Troll("Troll",100,100,10,10,10,1);
    }else if(name.equals("Dragon")){
      return new Dragon("Dragon",100,100,10,10,10,1);
    }else{
      return null;
    }
  }
}