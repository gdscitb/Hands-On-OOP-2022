#ifndef PLAYER_H
#define PLAYER_H

#include <string>

class Player {
private:
    std::string symbol;

public:
    Player(std::string symbol);
    std::string getSymbol();
};

#endif
