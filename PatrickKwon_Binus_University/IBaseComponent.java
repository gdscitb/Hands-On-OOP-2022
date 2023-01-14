public interface IBaseComponent{
  int getDef();
  int getHp();
  int getLevel();
  int getMp();
  String getName();
  int getSpd();
  void setDef(int def);
  void setHp(int hp);
  void setMp(int mp);
  void setName(String name);
  void setSpd(int spd);
  void printDetails();
}