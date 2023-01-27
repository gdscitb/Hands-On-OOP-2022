#include <bits/stdc++.h>
using namespace std;

class Player{
	private:
		string color = "white"; //warna skin player
	
	public: 
		void getColor(){ //1. prinsip SOLID. S: Single Responsibility
			cout<<"The player's color is "<<color<<"\n"; //outputkan warna skin player saat ini
		}
	
		void changeColor(string col){ //ganti warna player
			color = col;
		}
};

class Item{ //2. abstract class: item akan menjadi superclass/cetak biru dari ThrowableItem dan NonThrowableItem
	public:
		int weight; //berat benda
		string itemName; //nama benda
};
//3. Polymorphism: Item dapat berupa ThrowableItem dan NonThrowableItem
class ThrowableItem:public Item{ //4. Inheritance: class ThrowableItem adalah turunan dari Item;
	//ThrowableItem: bisa dilempar
	public:
		void throwItem(){ //lempar benda
			cout<<itemName<<" thrown! You dealt "<<weight<<" damage!\n";
		}
};

class NonThrowableItem:public Item{ //4. Inheritance: class NonThrowableItem adalah turunan dari Item;
//NonThrowableItem: bisa dilempar
	public:
		void saveItem(){
			cout<<itemName<<" saved!\n";
		}
};

//5. Design patterns: Classification:Creational patterns. Class player, ThrowableItem,dan NonThrowableItem
//dapat digunakan berulang-ulang
int main() {
	//akses class player
	Player player;
	player.getColor();
	player.changeColor("blue");
	player.getColor();
	
	//tes ThrowableItem
	ThrowableItem shuriken,kunai;
	shuriken.weight = 9;
	shuriken.itemName = "shuriken";
	kunai.weight = 12;
	kunai.itemName = "kunai";
	
	shuriken.throwItem(); // bisa dilempar karena objeknya adalah ThrowableItem
	kunai.throwItem(); // bisa dilempar karena objeknya adalah ThrowableItem
	
	//tes NonThrowableItem
	NonThrowableItem paper,book;
	paper.weight = 1;
	paper.itemName = "paper";
	book.weight = 15;
	book.itemName = "book";
	
	//paper.throwItem(); tidak bisa dilempar karena objeknya adalah NonThrowableItem
	//book.throwItem(); tidak bisa dilempar karena objeknya adalah NonThrowableItem
	paper.saveItem();
	book.saveItem();
	return 0;
}