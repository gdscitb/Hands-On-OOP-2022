#include <iostream>
#include <string>
#include "player.cpp"
#include "board.cpp"

using namespace std;

int main() {
    Board gameBoard;
    char name1[100];
    char name2[100];
    printf("---WELCOME TO TIC TAC TOE GAME---\n");
    printf("------------------------------------------\n");
    cout << " _   _      _             _             " << endl;
    cout << "| | (_)    | |           | |            " << endl;
    cout << "| |_ _  ___| |_ __ _  ___| |_ ___   ___ " << endl;
    cout << "| __| |/ __| __/ _` |/ __| __/ _ | / _ | " << endl;
    cout << "| |_| | (__| || (_| | (__| || (_) |  __/" << endl;
    cout << "|__|_||___||__|__,_||___||__|___/ |___|" << endl;
    printf("------------------------------------------\n");
    printf("Please enter Player 1 name : ");
    scanf("%s", name1);
    printf("Hello, %s. Hope you are ready! Beware of your opponent!\n", name1);
    printf("\nPlease enter Player 2 name : ");
    scanf("%s", name2);
    printf("Hello, %s. Hope you are ready! Beware of your opponent!\n", name2);
    printf("\n---Let's get readyyyyyy to rumbleeeee!---");
    string X, O;
    X = name1;
    O = name2;

    Player playerX(X);
    Player playerO(O);
    Player* currentPlayer = &playerX;

    while (!gameBoard.isFull() && !gameBoard.checkWin()) {
        gameBoard.printBoard();
        int row, col;
        std::cout << "Player " << currentPlayer->getSymbol() << ", enter row and col (1-3): ";
        std::cin >> row >> col;

        while (!gameBoard.placeMark(row, col, currentPlayer->getSymbol())) {
            std::cout << "Invalid move. Please try again." << std::endl;
            std::cout << "Player " << currentPlayer->getSymbol() << ", enter row and col (1-3): ";
            std::cin >> row >> col;
        }

        if (currentPlayer == &playerX) {
            currentPlayer = &playerO;
        } else {
            currentPlayer = &playerX;
        }
    }

    gameBoard.printBoard();
    if (gameBoard.checkWin()) {
        std::cout << "Player " << currentPlayer->getSymbol() << " wins!" << std::endl;

    } else {
        std::cout << "It's a tie!" << std::endl;
    }

    return 0;
}
