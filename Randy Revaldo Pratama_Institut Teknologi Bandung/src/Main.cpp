#include <iostream>
#include <string>
#include <memory>
#include <cmath>

//Character Factory untuk membuat hero yang kita pakai dan monster
class Character
{
	private:
		int Health = 100;
		int Mana = 100;
		int BaseDef;
		int BasePhyAtt;
		int BaseMagAtt;
	public:
		virtual ~Character() {}
		int getHealth()
		{
			return Health;
		}
		int getMana()
		{
			return Mana;
		}
		void setBaseDef(int aBaseDef)
		{
			BaseDef = aBaseDef;
		}
		int getBaseDef()
		{
			return BaseDef;
		}
		void setBasePhyAtt(int aBasePhyAtt)
		{
			BasePhyAtt = aBasePhyAtt;
		}
		int getBasePhyAtt()
		{
			return BasePhyAtt;
		}
		void setBaseMagAtt(int aBaseMagAtt)
		{
			BaseMagAtt = aBaseMagAtt;
		}
		int getBaseMagAtt()
		{
			return BaseMagAtt;
		}

		int DefSystem()
		{
			return round(BaseDef*0.02);
		}

		void showStat()
		{
			std::cout << "HP		= " << getHealth() << std::endl;
			std::cout << "Mana		= " << getMana() << std::endl;
			std::cout << "Defense		= " << getBaseDef() << std::endl;
			std::cout << "Physical Attack	= " << getBasePhyAtt() << std::endl;
			std::cout << "Magical Attack	= " << getBaseMagAtt() << std::endl;
		}
		virtual int BasicAtt()
		{
			return 0;
		}
		virtual int Skill()
		{
			return 0;
		}
		virtual int Ult()
		{
			return 0;
		}
		int afterHP(int damage)
		{
			Health -= damage;
			if (Health < 0 )
			{
				Health = 0;
			}
			return Health;
		}
		int afterMana(int usage)
		{
			if (Mana-usage >= 0)
			{
				Mana -= usage;
			}
			return Mana;
		}
};

//Derived class Mage dari character
class Mage : public Character
{
	public:
		Mage(){
			setBasePhyAtt(50);
			setBaseMagAtt(100);
			setBaseDef(70);
		}
		int BasicAtt() override
		{
			return getBaseMagAtt()*0.03;
		}

		int Skill() override
		{
			if(getMana() > 0 )
			{
				afterMana(10);
				return getBaseMagAtt()*0.07;
			}else
			{
				
				std::cout << "\nYour Mana is insufficient\n" << std::endl;
				return 0;
			}
		}
		int Ult() override
		{
			if(getMana() > 0 )
			{
				afterMana(20);
				return getBaseMagAtt()*0.10;
			}else
			{
				std::cout << "\nYour Mana is insufficient\n" << std::endl;
				return 0;
			}
		}

};

//Derived class Swordsman dari character
class Swordsman : public Character
{
	public:
		Swordsman(){
			setBasePhyAtt(100);
			setBaseMagAtt(50);
			setBaseDef(90);
		}

		int BasicAtt() override
		{ 
			return getBasePhyAtt()*0.05;
		}
		int Skill() override
		{
			return getBasePhyAtt()*0.06;
		}
		int Ult() override
		{
			if(getMana() >0)
			{
				afterMana(20);
				return getBasePhyAtt()*0.10;
			}else
			{
				return 0;
			}
			
		}
};

//Derived class Monster dari character
class Monster : public Character
{
	public:
		Monster()
		{
			setBasePhyAtt(50);
			setBaseMagAtt(50);
			setBaseDef(100);
		}
		int BasicAtt() override
		{
			return getBasePhyAtt()*0.08;
		}
		int Skill() override
		{
			if(getMana() >0)
			{
				afterMana(5);
				return getBaseMagAtt()*0.1;
			}else
			{
				return 0;
			}
			
		}
		int Ult() override
		{
			if(getMana() >0)
			{
				afterMana(15);
				return getBasePhyAtt()*0.07 + getBaseMagAtt()*0.07;
			}else
			{
				return 0;
			}
			
		}
};

//enumerator untuk charactertype untuk con
enum class CharaType
{
	MAGE,
	SWORDSMAN,
	MONSTER
};

//Menggunakan shared pointer agar mengurangi resiko memory leak
std::shared_ptr<Character> CreateCharacterFactory(CharaType type)
{
	if (CharaType::MAGE == type)
	{
		return std::make_shared<Mage>();
	}
	else if (CharaType::SWORDSMAN == type)
	{
		return std::make_shared<Swordsman>();
	}
	else if(CharaType::MONSTER == type)
	{
		return std::make_shared<Monster>();
	}
	return nullptr;
}

int main()
{
	std::shared_ptr<Character> myChara;
	int choice;
	int charaHP, charaMana;
	int monsterHP, monsterMana;
	int attackType;
	int charaCounter = 1;
	int monsterCounter = 1;
	std::string anything;
	
	//if you are using mac, comment the cls, and uncomment system("clear");
	system("cls");
	//system("clear");

	std::cout << "WELCOME TO SIMPLE RPG" << std::endl;
	std::cout << "=====================" << std::endl;
	std::cout << "\n\n";

	std::cout << "Choose Your Character" << std::endl;
	std::cout << "1. Mage" << std::endl;
	std::cout << "2. Swordsman" << std::endl;
	std::cout << "Input a number = ";
	std::cin >> choice;

	if (choice == 1)
	{
		myChara = CreateCharacterFactory(CharaType::MAGE);
		charaHP = myChara->getHealth();
		charaMana = myChara->getMana();
		std::cout << "Your Character is Mage" << std::endl;
		myChara->showStat();
	}
	else if(choice == 2)
	{
		myChara = CreateCharacterFactory(CharaType::SWORDSMAN);
		charaHP = myChara->getHealth();
		charaMana = myChara->getMana();
		std::cout << "Your Character is Swordsman" << std::endl;
		myChara->showStat();
	}
	std::cout << std::endl;
	std::cout << std::endl;

	std::cout << "This is your opponent stat" << std::endl;
	std::shared_ptr<Character> monster = CreateCharacterFactory(CharaType::MONSTER);
	monsterHP = monster->getHealth();
	monsterMana = monster->getMana();
	monster->showStat();

	std::cout << std::endl;
	std::cout << "BATTLE START" << std::endl;
	std::cout << "\nPress anything in your keyboard ";
	std::cin >> anything;

	while(charaHP > 0 && monsterHP > 0)
	{	
		system("cls");
		//system("clear");
		srand(time(NULL));
		int randNum;

		std::cout << std::endl;
		if (charaCounter < 3)
		{		
			std::cout << "Your Turn" << std::endl;
			std::cout << "Choose your attack type" << std::endl;
			std::cout << "1. Basic Attack\n2. Skill" << std::endl;
			std::cout << "Input a number = ";
			std::cin >> attackType;
			if(attackType == 1)
			{
				std::cout << std::endl;
				std::cout << "Monster got damaged" << std::endl;
				monsterHP = monster->afterHP(myChara->BasicAtt());
				std::cout << "Monster Stat" << std::endl;
				monster->showStat();
			}
			else if(attackType == 2)
			{
				std::cout << std::endl;
				std::cout << "You used your skill" << std::endl;
				std::cout << "Monster got damaged" << std::endl;
				monsterHP = monster->afterHP(myChara->Skill());
				std::cout << "Monster Stat" << std::endl;
				monster->showStat();
			}
			charaCounter += 1;
		}else if (charaCounter == 3 )
		{
			charaCounter = 1;
			std::cout << "Your Turn" << std::endl;
			std::cout << "Choose your attack type" << std::endl;
			std::cout << "1. Basic Attack\n2. Skill\n3. Ult" << std::endl;
			std::cout << "Input a number = ";
			std::cin >> attackType;
			if(attackType == 1)
			{
				std::cout << std::endl;
				std::cout << "Monster got damaged" << std::endl;
				monsterHP = monster->afterHP(myChara->BasicAtt());
				std::cout << "Monster Stat" << std::endl;
				monster->showStat();
			}
			else if(attackType == 2)
			{
				std::cout << std::endl;
				std::cout << "You used your skill" << std::endl;
				std::cout << "Monster got damaged" << std::endl;
				monsterHP = monster->afterHP(myChara->Skill());
				std::cout << "Monster Stat" << std::endl;
				monster->showStat();
			}
			else if(attackType == 3)
			{
				std::cout << std::endl;
				std::cout << "You used your Ult" << std::endl;
				std::cout << "Monster got damaged" << std::endl;
				monsterHP = monster->afterHP(myChara->Ult());
				std::cout << "Monster Stat" << std::endl;
				monster->showStat();
			}
		}
		std::cout << "\nMonster Turn" << std::endl;
		if (monsterCounter < 4)
		{
			randNum =  (rand() % 2) + 1;
			if (randNum == 1)
			{
				std::cout << std::endl;
				std::cout << "You got damaged" << std::endl;
				charaHP = myChara->afterHP(monster->BasicAtt());
				std::cout << "Your Stat" << std::endl;
				myChara->showStat();

			}else if(randNum == 2)
			{
				std::cout << std::endl;
				std::cout << "Monster used its skill" << std::endl;
				std::cout << "You got damaged" << std::endl;
				charaHP = myChara->afterHP(monster->Skill());
				std::cout << "Your Stat" << std::endl;
				myChara->showStat();
			}
			monsterCounter += 1;	
		}else if (monsterCounter == 4)
		{
			randNum = (rand() % 3) + 1;
			if (randNum == 1)
			{
				std::cout << std::endl;
				std::cout << "You got damaged" << std::endl;
				charaHP = myChara->afterHP(monster->BasicAtt());
				std::cout << "Your Stat" << std::endl;
				myChara->showStat();

			}else if(randNum == 2)
			{
				std::cout << std::endl;
				std::cout << "Monster used its skill" << std::endl;
				std::cout << "You got damaged" << std::endl;
				charaHP = myChara->afterHP(monster->Skill());
				std::cout << "Your Stat" << std::endl;
				myChara->showStat();
			}else if(randNum == 3)
			{
				std::cout << std::endl;
				std::cout << "Monster used its Ult" << std::endl;
				std::cout << "You got damaged" << std::endl;
				charaHP = myChara->afterHP(monster->Ult());
				std::cout << "Your Stat" << std::endl;
				myChara->showStat();
			}
			monsterCounter = 1;
		}
		std::cout << "\nPress anything in your keyboard ";
		std::cin >> anything;
	}
	std::cout << std::endl;

	if(monsterHP == 0 && charaHP == 0)
	{
		std::cout << "DRAW" << std::endl;
	}else if(monsterHP == 0)
	{
		std::cout << "YOU WIN" << std::endl;
	}else if(charaHP == 0)
	{
		std::cout << "YOU LOSE" << std::endl;
	}
	std::cin.get();
	return 0;
}