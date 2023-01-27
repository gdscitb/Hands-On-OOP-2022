#include "player.h"

Player::Player(std::string symbol) : symbol(symbol) {
}

std::string Player::getSymbol() {
    return symbol;
}
