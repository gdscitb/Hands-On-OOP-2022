#include <cstdio>
#include <string>

using namespace std;

class Player {
    private:
        string name;
        int money;
        bool inJail;
        int countJail;
        // Array Properti

    public:
    Player(string inputName) {
        Player::name = inputName;
        Player::money = 100;
        Player::inJail = false;
        Player::countJail = 0;
    }

    string getName() {
        return Player::name;
    }

    int getMoney() {
        return Player::money;
    }

    void addMoney(int plusMoney) {
        Player::money += plusMoney;
    }

    void subMoney(int lessMoney) {
        Player::money -= lessMoney;
    }

    int getJail() {
        return Player::inJail;
    }

    void setJail() {
        if (Player::inJail) {
            Player::countJail = 3;
        }
        Player::inJail = true;
    }

    int getCountJail() {
        return Player::countJail;
    }

    void decrementJail() {
        Player::countJail--;
        printf("Di penjara  %d turm lagi yaa\n", countJail);
    }


};