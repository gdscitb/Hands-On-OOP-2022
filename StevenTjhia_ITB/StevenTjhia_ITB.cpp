#include <iostream>
#include <string>
using namespace std;

class player{
  private:
    string name;
  public:
    //Set nama player
    void setName(string name){
        player::name = name;
        }
    
    //Membaca nama player
    string getName(){
      return name;
    }

};

//class potion diturunkan dari class player
class potion:public player{
  protected:
    int bonusAtk; 
    int bonusHP;
  public:
    void setBuff(int buff){
        if(buff == 1){
            potion::bonusAtk = 1;
            potion::bonusHP = 0;
        } else {    //potion == 2
            potion::bonusAtk = 0;
            potion::bonusHP = 3;
        }
    }
};

//class hero diturunkan dari class potion yg diturunkan dari class player -> multilevel inheritance
class hero:public potion{
  public:
    string type;
    int basicAtk;
    int hp;
    int skillAtk;
    int cdSkillAtk;
    int skillHeal;
    int cdSkillHeal;

    void stats(){
      cout << "Player Name  : " << this->getName() << endl;
      cout << "Type         : " << this->type << endl;
      cout << "Atk          : " << this->basicAtk << endl;
      cout << "HP           : " << this->hp << endl;
      cout << "Skill Damage : " << this->skillAtk << "\t (cooldown : " << this->cdSkillAtk << " Round(s))" << endl;
      cout << "Skill Heal   : " << this->skillHeal << "\t (cooldown : " << this->cdSkillHeal << " Round(s))" << endl;  
    }

    virtual void desc() = 0;
};

class cavalry:public hero{
  public:
    cavalry(string name, int potion){ //Constructor
      setName(name);    //Design Pattern : Decorator
      setBuff(potion);  //Design Pattern : Decorator
      this->type = "Cavalry";
      this->basicAtk = 2 + 2*bonusAtk + 0*bonusHP;
      this->hp = 20 + bonusHP;
      this->skillAtk = 3 + 3*bonusAtk + 1*bonusHP;
      this->cdSkillAtk = 3;
      this->skillHeal = 4 + 2*bonusAtk + 2*bonusHP;
      this->cdSkillHeal = 3; 
    }

    void desc(){
      cout << "Description  : A warrior in a horse" << endl;
    }  
};

class infantry:public hero{
  public: 
    infantry(string name, int potion){  //Constructor
      setName(name);    //Design Pattern : Decorator
      setBuff(potion);  //Design Pattern : Decorator
      this->type = "Infantry";
      this->basicAtk = 2 + 2*bonusAtk + 0*bonusHP;
      this->hp = 20 + bonusHP;
      this->skillAtk = 1 + 5*bonusAtk + 2*bonusHP;
      this->cdSkillAtk = 2;
      this->skillHeal = 4 + 2*bonusAtk + 2*bonusHP;
      this->cdSkillHeal = 3;
    }

    void desc(){
      cout << "Description  : A walking warrior" << endl;
    }  
};

class archer:public hero{
  public:
    archer(string name, int potion){  //Constructor
      setName(name);    //Design Pattern : Decorator
      setBuff(potion);  //Design Pattern : Decorator
      this->type = "Archer";
      this->basicAtk = 4 + 3*bonusAtk + 1*bonusHP;
      this->hp = 10 + bonusHP;
      this->skillAtk = 5 + 5*bonusAtk + 1*bonusHP;
      this->cdSkillAtk = 4;
      this->skillHeal = 5 + 7*bonusAtk + 2*bonusHP;
      this->cdSkillHeal = 4;
    }

    void desc(){
      cout << "Description  : A warrior with a bow" << endl;
    }
}; 

//Design Patter: Factory Method
hero* createHero(string name, int potion, int type){
  if(type == 1){
    return new cavalry(name, potion);
  } else if (type == 2) {
    return new infantry(name, potion);
  } else {  //type == 3
    return new archer(name, potion);
  }
};

void showStats(
      int round, 
      string name1, string name2,
      string type1, string type2,
      int atk1, int atk2,
      int hp1, int hp2){
  cout << "=================================================" << endl;
  cout << "ROUND " << round << endl;
  cout << "=================================================" << endl;
  cout << "Player 1 - " << name1 << "\t"   << "Player 2 - " << name2 << endl;
  cout << "Type   : " << type1 << "\t\t"     << "Type   : " << type2 << endl;
  cout << "Attack : " << atk1 << "\t\t" << "Attack : " << atk2 << endl;
  cout << "HP     : " << hp1 << "\t\t"       << "HP     : " << hp2 << endl;
  cout << "=================================================" << endl;
};

int main() {
  cout << " ============================" << endl;
  cout << " =       THE DUELISM        =" << endl;
  cout << " ============================" << endl;

  //Inisialisasi object
  hero* hero1;
  hero* hero2;

  //Input nama player
  string name1, name2;
  cout << "Enter Player 1 name : "; 
  cin >> name1;
  cout << "Enter Player 2 name : "; 
  cin >> name2;

  //Input potion player 1
  int potion1, potion2;
  cout << "=============================" << endl;
  cout << name1 << " Choose Potion:" << endl;
  cout << "1. Attack Potion" << endl;
  cout << "2. Health Potion" << endl;
  bool valid1 = false;
  while (not valid1){
    cout << ">> ";
    cin >> potion1;
    if(potion1 != 1 and potion1 != 2){
      cout << "--Input tidak valid" << endl;
    } else {
      valid1 = true;
    }
  }
  //Input potion player 2
  cout << "=============================" << endl;
  cout << name2 << " Choose Potion:" << endl;
  cout << "1. Attack Potion" << endl;
  cout << "2. Health Potion" << endl;
  bool valid2 = false;
  while (not valid2){
    cout << ">> ";
    cin >> potion2;
    if(potion2 != 1 and potion2 != 2){
      cout << "--Input tidak valid" << endl;
    } else {
      valid2 = true;
    }
  }


  //Input type hero 1
  int type1, type2;
  cout << "=============================" << endl;
  cout << name1 << ", Choose Hero Type:" << endl;
  cout << "1. Cavalry" << endl;
  cout << "2. Infantry" << endl;
  cout << "3. Archer" << endl;
  bool valid1_type = false;
  while (not valid1_type){
    cout << ">> ";
    cin >> type1;
    if(type1 !=1 and type1 != 2 and type1 != 3){
      cout << "--Input tidak valid" << endl;
    } else {
      valid1_type = true;
    }
  }
  //Input type hero 2
  cout << "=============================" << endl;
  cout << name2 << ", Choose Hero Type:" << endl;
  cout << "1. Cavalry" << endl;
  cout << "2. Infantry" << endl;
  cout << "3. Archer" << endl;
  bool valid2_type = false;
  while (not valid2_type){
    cout << ">> ";
    cin >> type2;
    if(type2 !=1 and type2 != 2 and type2 != 3){
      cout << "--Input tidak valid" << endl;
    } else {
      valid2_type = true;
    }
  }

  //Membuat hero (Factory)
  hero1 = createHero(name1, potion1, type1);
  hero2 = createHero(name2, potion2, type2);

  //Menampilkan stat setiap type hero
  cout << "=================================================" << endl;
  cout << "=                    HERO STATS                 =" << endl;
  cout << "=================================================" << endl;
  // cout << hero1->sts() << endl;
  hero1->stats();
  hero1->desc();
  cout << "=================================================" << endl;
  // cout << hero2->hero() << endl;
  hero2->stats();
  hero2->desc();

  // Battle Begin
  int round = 1;  //Design Pattern : Iterator
  int action1, action2;

  int cdSkillAtt1 = 0;
  int cdSkillAtt2 = 0;

  int cdSkillHeal1 = 0;
  int cdSkillHeal2 = 0;

  cout << "=================================================" << endl;
  cout << "==============LET THE BATTLE BEGIN!==============" << endl;

  // LOOPING BATTLE sampai ada yang hp nya <=0
  while (hero1->hp >= 0 or hero2->hp >= 0){

    //Menunjukkan status masing-masing hero saat ini
    showStats(round, 
        hero1->getName(), hero2->getName(), 
        hero1->type, hero2-> type, 
        hero1->basicAtk, hero2->basicAtk, 
        hero1->hp, hero2->hp);
        
    if(hero1->hp <= 0){
        cout << "\t~~~~~ VICTORY FOR " << hero2->getName() << " ~~~~~" << endl;
        cout << "=================================================" << endl;

        break;
    }
    
    //ACTION PLAYER 1
    cout << "-- " << hero1->getName() << "'s Turn:" << endl;
    cout << "1. Basic Attack (damage : " << hero1->basicAtk << ")" << endl;
    if(cdSkillAtt1 == 0){
      cout << "2. Skill Attack (damage : " << hero1->skillAtk << ")" << endl;
    } else {
      cout << "2. Skill Attack sedang cooldown (" << cdSkillAtt1 << " Round)" << endl;
    }

    if(cdSkillHeal1 == 0){
      cout << "3. Skill Heal   (heal   : " << hero1->skillHeal << ")" << endl;
    } else {
      cout << "3. Skill Heal sedang cooldown (" << cdSkillHeal1 << " Round)" << endl;
    }

    bool turn1 = true;
    while (turn1) {
      cout << "-----------------------------------------" << endl;
      // cout << "=========================================" << endl;
      cout << hero1->getName() << "'s action = ";
      cin >> action1;
      cout << "=================================================" << endl;

      if (action1 == 1){
        hero2->hp -= hero1->basicAtk; // damage ke musuh
          cout << "\t\t" << hero2->getName() << " -" << hero1->basicAtk << " HP!" << endl;
      turn1 = false;
      } else if (action1 == 2 and cdSkillAtt1 == 0){
        hero2->hp -= hero1->skillAtk; //damage ke musuh
        cdSkillAtt1 += hero1->cdSkillAtk + 1;  //cooldown
        cout << "\t\t" << hero2->getName() << " -" << hero1->skillAtk << " HP!" << endl;
        turn1 = false;
      } else if (action1 == 3 and cdSkillHeal1 == 0){
        hero1->hp += hero1->skillHeal;  //heal
        cdSkillHeal1 += hero1->cdSkillHeal + 1;// cooldown
        cout << "\t\t" << hero1->getName() << " +" << hero1->skillHeal << " HP!" << endl;
        turn1 = false;
      } else if ((action1 == 2 or action1 == 3) and (cdSkillHeal1 != 0 or cdSkillAtt1 != 0)){
        cout << "Skill sedang cooldown!" << endl;
      } else {  //action1 != 1 and action1 != 2 and action1 != 3
        cout << "Input invalid" << endl;
      }
    }
    //END OF ACTION PLAYER 1

    showStats(round, 
        hero1->getName(), hero2->getName(), 
        hero1->type, hero2-> type, 
        hero1->basicAtk, hero2->basicAtk, 
        hero1->hp, hero2->hp);
        
    if(hero2->hp <= 0){
      cout << "\t~~~~~ VICTORY FOR " << hero1->getName() << " ~~~~~" << endl;
      cout << "=================================================" << endl;

      break;
    }

    //ACTION PLAYER 2
    cout << hero2->getName() << "'s Turn:" << endl;
    cout << "1. Basic Attack (damage : " << hero2->basicAtk << ")" << endl;
    if(cdSkillAtt2 == 0){
      cout << "2. Skill Attack (damage : " << hero2->skillAtk << ")" << endl;
    } else {
      cout << "2. Skill Attack sedang cooldown (" << cdSkillAtt2 << " Round)" << endl;
    }

    if(cdSkillHeal2 == 0){
      cout << "3. Skill Heal   (heal   : " << hero2->skillHeal << ")" << endl;
    } else {
      cout << "3. Skill Heal sedang cooldown (" << cdSkillHeal2 << " Round)" << endl;
    }


    bool turn2 = true;
    while (turn2) {
      cout << "-----------------------------------------" << endl;
      // cout << "=========================================" << endl;
      cout << hero2->getName() << "'s action = ";
      cin >> action2;
      cout << "=================================================" << endl;

      if (action2 == 1){
        hero1->hp -= hero2->basicAtk; // damage ke musuh
        cout << "\t\t" << hero1->getName() << " -" << hero2->basicAtk << " HP!" << endl;
        turn2 = false;
      } else if (action2 == 2 and cdSkillAtt2 == 0){
        hero1->hp -= hero2->skillAtk; //damage ke musuh
        cdSkillAtt2 += hero2->cdSkillAtk + 1;  //cooldown
        cout << "\t\t" << hero1->getName() << " -" << hero2->skillAtk << " HP!" << endl;
        turn2 = false;
      } else if (action2 == 3 and cdSkillHeal2 == 0){
        hero2->hp += hero2->skillHeal;  //heal
        cdSkillHeal2 += hero2->cdSkillHeal + 1;// cooldown
        cout << "\t\t" << hero2->getName() << " +" << hero2->skillHeal << " HP!" << endl;
        turn2 = false;
      } else if((action2 == 2 or action2 == 3) and (cdSkillHeal2 != 0 or cdSkillAtt2 != 0)){
        cout << "Skill sedang cooldown!" << endl;
      } else {  //action2 != 1 and action2 != 2 and action2 != 3
        cout << "Input invalid" << endl;
      }
    }
    //END OF ACTION PLAYER 2
    
    //Pengurangan cooldown skill
    if(cdSkillAtt1 != 0){
      cdSkillAtt1 -= 1; 
    }

    if(cdSkillAtt2 != 0){
      cdSkillAtt2 -= 1; 
    }

    if(cdSkillHeal1 != 0){
      cdSkillHeal1 -= 1; 
    }

    if(cdSkillHeal2 != 0){
      cdSkillHeal2 -= 1; 
    }

    round ++; //Design Pattern : Iterator
  };

  delete hero1;
  delete hero2;
  return 0;
};