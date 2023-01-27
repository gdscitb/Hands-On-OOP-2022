#include "board.h"

Board::Board() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = " ";
        }
    }
}

void Board::printBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            std::cout << board[i][j] << " ";
        }
        std::cout << std::endl;
    }
}

bool Board::placeMark(int row, int col, std::string symbol) {
    if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == " ") {
        board[row][col] = symbol;
        return true;
    }
    return false;
}

bool Board::checkWin() {
    // check rows
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != " ") {
            return true;
        }
    }

    // check cols
    for (int i = 0; i < 3; i++) {
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != " ") {
            return true;
        }
    }

    // check diagonals
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != " ") {
        return true;
    }
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != " ") {
        return true;
    }

    return false;
}

bool Board::isFull() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == " ") {
                return false;
            }
        }
    }
    return true;
}
