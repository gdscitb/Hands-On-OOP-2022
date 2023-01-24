/*
Deskripsi Program
Program ini merupakan program simulator lotere. Pemain akan menebak 2 angka yang terdiri dari 1-9 dan jika benar akan mendapatkan hadiah. 

Penjelasan Design Pattern yang dipilih
Design pattern yang dipilih adalah Strategy Pattern. Dengan menggunakan Strategy Pattern, kita dapat membuat beberapa strategi untuk menyelesaikan masalah yang berbeda dengan cara yang fleksibel dan modifikasi yang mudah.

Letak Implementasi Design Pattern Tersebut
Design pattern Strategy terdapat pada method generate_numbers() dan guess_numbers().

Alasan Pemilihan Design Pattern Tersebut
Strategy Pattern dipilih karena dapat membuat beberapa strategi untuk menyelesaikan masalah yang berbeda dengan cara yang fleksibel dan modifikasi yang mudah.
*/
#include <iostream>
#include <string>
#include <ctime> //used for generating time
#include <cstdlib> // library for randomizer
#include <conio.h>

using namespace std;

class lottery {
	public:
		void generate_numbers();
		void guess_numbers();
		int num1, num2;
};

void lottery::generate_numbers() {
	srand (time (0));
	num1 = rand()%10;
	num2 = rand()%10;
}

void lottery::guess_numbers() {
	int guess1, guess2;
	cout << "Guess number: " << endl;
	cin >> guess1 >> guess2;
	
	if (guess1 == num1 && guess2 == num2)
		cout << "Congrats, you match both number in exact order, the award is $10,000." << endl;
	else if (guess1 == num2 && guess2 == num1)
		cout << "You match the lottery but wrong order, the award is $3,000." << endl;
 	else if(guess1 == num1 || guess2 == num2)
 		cout << "You only matches 1 digit, the award is $1,000." << endl;
	else if (guess1 == num2 || guess2 == num1)
 		cout << "You only matches 1 digit, the award is $1,000." << endl;
 	else
		cout << "Unfortunately, You lose, nice try" << endl;
}

void drawLine(int n, char symbol);
void rules ();

//Class for SOLID Design Pattern
class SolidLottery
{
	public:
		void setGenerateNumber();
		void setGuessNumber();
		int getGenerateNumber();
		int getGuessNumber();
		int num1, num2;
};

void SolidLottery::setGenerateNumber()
{
	srand (time (0));
	num1 = rand()%10;
	num2 = rand()%10;
}

void SolidLottery::setGuessNumber() 
{
	int guess1, guess2;
	cout << "Guess number: " << endl;
	cin >> guess1 >> guess2;
	
	if (guess1 == num1 && guess2 == num2)
		cout << "Congrats, you match both number in exact order, the award is $10,000." << endl;
	else if (guess1 == num2 && guess2 == num1)
		cout << "You match the lottery but wrong order, the award is $3,000." << endl;
 	else if(guess1 == num1 || guess2 == num2)
 		cout << "You only matches 1 digit, the award is $1,000." << endl;
	else if (guess1 == num2 || guess2 == num1)
 		cout << "You only matches 1 digit, the award is $1,000." << endl;
 	else
		cout << "Unfortunately, You lose, nice try" << endl;
}

int SolidLottery::getGenerateNumber()
{
	return num1;
}

int SolidLottery::getGuessNumber()
{
	return num2;
}

class InheritLottery : public SolidLottery 
{
	public:
		void setAdditionNumber();
		int getAdditonNumber();
		int num3;
};

void InheritLottery::setAdditionNumber()
{
	srand (time (0));
	num3 = rand()%10;
}

int InheritLottery::getAdditonNumber()
{
	return num3;
}

int main ()
{	
    cout << "\t\tWELCOME TO LOTTERY!\n\n"<< endl;
    system("cls");
	rules();
	
	InheritLottery toto;
	toto.setGenerateNumber();
	toto.setGuessNumber();
	toto.setAdditionNumber();
    
    cout << "Today's winning number is: " << toto.getGenerateNumber() << " " << toto.getGuessNumber() << " " << toto.getAdditonNumber() << endl;
 	getch();
	return 0;
}

void drawLine(int n, char symbol)
{
    for(int i=0; i<n; i++)
        cout << symbol;
    cout << "\n" ;
}
   void rules()
{
    system("cls");
    cout << "\n\n";
    drawLine(55,'-');
    cout << "\t\tRULES OF THE GAME\n";
    drawLine(55,'-');
    cout << "Pemain akan  menebak 2 angka yang terdiri dari 1-9\n";
    cout << "Format input diberi spasi antara angka pertama dan kedua\n";
    cout << "Contoh: 8 _spasi _ 2\nContoh: 8  2\n";
    cout << "Ada 3 kategori pemenang\n";
    cout << "1. Ketiga angka dan urutan tepat\n";
    cout << "2. Ketiga angka tepat tetapi urutan salah\n";
    cout << "3. Hanya salah satu angka yang tepat\n";
    drawLine(55,'-');
}

/*
prinsip SOLID yang digunakan pada kode diatas adalah Single Responsibility Principle (SRP). Single Responsibility Principle (SRP) menyatakan bahwa setiap class hanya boleh memiliki satu tanggung jawab saja. Pada kode diatas, class lottery hanya memiliki 2 fungsi yaitu generate_numbers() dan guess_numbers(). Hal ini sesuai dengan konsep SRP karena class tersebut hanya memiliki 1 tanggung jawab yaitu membuat dan menebak angka.

Konsep polimorfisme dapat dilihat di dalam fungsi main(), di mana class InheritLottery diwariskan dari class SolidLottery. Fungsi ini menggunakan polimorfisme untuk mengakses kedua fungsi set dan get dari class SolidLottery dan InheritLottery.

Konsep inheritance pada kode diatas terjadi ketika Class InheritLottery meng-inheritance dari Class SolidLottery. Class InheritLottery mewarisi semua metode dan atribut dari Class SolidLottery. Metode dan atribut yang diwariskan antara lain setGenerateNumber(), setGuessNumber(), getGenerateNumber(), getGuessNumber(), dan num1, num2. Selain itu, Class InheritLottery juga memiliki metode dan atribut sendiri, yang terdiri dari setAdditionNumber(), getAdditionNumber(), dan num3.
*/