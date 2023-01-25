# 🪨 📃 ✂️ Description
- This program runs a rock paper scissors game against your computer. Simply enter your username, then just choose between 1 for rock, 2 for paper, and 3 for scissors. The winner is one who gets 3 wins first.
- This program is coded in java version 11.0.15.


# 📝 Design Pattern
- The design pattern I used for the program is Template Method Design Pattern. Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
- In this program, the "Game" class is a superclass that acts as the skeleton of an algorithm and the "RPSGame" class is a subclasse that overrides the play method in the "Game" class.
- I chose this design patern because it allows me to define a common algorithm for the game logic in a base class, and allow subclasses to provide their own implementation for some of the steps. It also allows me to encapsulate some properties.

# ▶️ Run Program
To run this program, clone this repository and run

```javac Main.java && java Main```



