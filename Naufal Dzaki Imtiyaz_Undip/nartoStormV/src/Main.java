import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import character.*;
import jutsu.*;
import player.*;

public class Main {
    public static void main(String[] args) {
        // Creating Characters Sets
        Shinobi naruto = new Shinobi("Naruto", 10, 10);
        Shinobi sasuke = new Shinobi("Sasuke", 10, 10);
        Shinobi madara = new Shinobi("Madara", 10, 10);
        Shinobi obito = new Shinobi("Obito", 10, 10);

        // Creating Jutsu Sets
        Jutsu rasengan = new AttackJutsu("Rasengan", 20, 20);
        Jutsu shadowClone = new BuffJutsu("Shadow Clone", 25, 0, 5, 5);
        Jutsu sageMode = new BuffJutsu("Sage Mode", 50, 0, 20, 0);
        Jutsu chidori = new AttackJutsu("Chidori", 20, 20);
        Jutsu sharingan = new BuffJutsu("Sharingan", 25, 0, 10, 0);
        Jutsu susanoo = new BuffJutsu("Susanoo", 50, 0, 0, 20);
        Jutsu fireBall = new AttackJutsu("Fire Ball", 15, 15);
        Jutsu doubleMeteor = new AttackJutsu("Double Meteor", 50, 50);
        Jutsu kamui = new BuffJutsu("Kamui", 30, 0, 0, 15);

        // Learning Jutsu
        naruto.learnJutsu(rasengan);
        naruto.learnJutsu(shadowClone);
        naruto.learnJutsu(sageMode);
        sasuke.learnJutsu(chidori);
        sasuke.learnJutsu(sharingan);
        sasuke.learnJutsu(susanoo);
        madara.learnJutsu(doubleMeteor);
        madara.learnJutsu(sharingan);
        madara.learnJutsu(susanoo);
        obito.learnJutsu(fireBall);
        obito.learnJutsu(sharingan);
        obito.learnJutsu(kamui);

        // Load Characters
        List <Shinobi> charactersList = new ArrayList<Shinobi>();
        charactersList.add(naruto);
        charactersList.add(sasuke);
        charactersList.add(madara);
        charactersList.add(obito);

        // Creating Players
        Player player1 = new HumanPlayer("Alan Turing");
        Player player2 = new NonHumanPlayer();

        // Choose Character
        player1.chooseCharacter(charactersList.get(0));
        player2.chooseCharacter(charactersList.get(1));

        // Register Players
        GameManager.getInstance().registerPlayer(player1, player2);

        // Start Game
         GameManager.getInstance().startGame();
    }
}
