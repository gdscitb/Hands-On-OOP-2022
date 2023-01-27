#ifndef BOARD_H
#define BOARD_H

#include <string>

class Board {
private:
    std::string board[3][3];

public:
    Board();
    void printBoard();
    bool placeMark(int row, int col, std::string symbol);
    bool checkWin();
    bool isFull();
};

#endif
