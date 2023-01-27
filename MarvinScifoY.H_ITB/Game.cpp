#include <iostream>
#include <string>
#include <ctime>
using namespace std;
class MainGame {
  public:
    string welcome = "Welcome to OneTwoThreeFour";
    void mesi() {
        cout << welcome;
        cout << "\n";
    }     
};

class Interface : public MainGame {
  protected:
    int limite;
};

// Limit is 25
class Limit : public MainGame {
    public:
      int limite = 25;
      void limet() {
        cout << "---------------------------------------------\n";
        cout << "The limit for the number that you can add is ";
        cout << limite;
        cout << " \n";
        cout << "Opponents will have more number choices";
        cout << " \n";
    }
};

// Choices
class Numbers: public MainGame {
    public:
      string addition1 = "Add by One";
      string addition2 = "Add by Two";
      string addition3 = "Add by Three";
      int choice() {
        int number = 0;
        int i = 0;
        srand(time(NULL));
        int randome = 0;
        bool Fail = false;
        while(i <= 25) {
          cout << "Choose between: ";
          cout << addition1;
          cout << "(1)/";
          cout << addition2;
          cout << "(2)/";
          cout << addition3;
          cout << "(3)";
          cout << " \n";
          cout << "---------------------------------------------";
          cout << " \n";
          cout << " \n";
          cin >> number;
          if(number >= 1 && number <= 3) {
            i = i+number;
            cout << " \n";
            cout << "---------------------------------------------";
            cout << " \n";
            cout << "You choose number: ";
            cout << number;
            cout << " \n";
            cout << "The current number is: ";
            cout << i;
            cout << " \n";
            cout << "---------------------------------------------";
            if(i > 25) {
              string a = "";
              cout << " \n";
              cout << "You lose! You make the number more than 25";
              cout << " \n";
              cout << "Press any button to exit!";
              cout << " \n";
              cout << "> ";
              cin >> a;
              break;
            }
            randome = (rand() % 5)+1;
            i = i+randome;
            cout << " \n";
            cout << "The opponent chooses number: ";
            cout << randome;
            cout << " \n";
            cout << "The current number is: ";
            cout << i;
            cout << " \n";
            cout << " \n";
            if(i > 25) {
              string a = "";
              cout << " \n";
              cout << "You win! Opponent makes the number more than 25";
              cout << " \n";
              cout << "Press any button to exit!";
              cout << " \n";
              cout << "> ";
              cin >> a;
              break;
            }
          }
          else {
            cout << "Invalid number!";
            cout << " \n";
            cout << " \n";
          }
        }
      }
};

int main() {
    MainGame meswelcome;
    Limit meslimite;
    Numbers mesnumber;
    meswelcome.mesi();
    meslimite.limet();
    mesnumber.choice();
    cout << " ";
    return 0;
}