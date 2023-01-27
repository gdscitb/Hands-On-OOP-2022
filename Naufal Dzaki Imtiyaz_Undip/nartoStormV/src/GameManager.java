import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import jutsu.*;
import player.HumanPlayer;
import player.Player;

public class GameManager {
    private static GameManager instance;
    private List <Player> players;
    private boolean isEndGame = false;

    private GameManager() {
        this.players = new ArrayList<>();
        this.players.add(null);
        this.players.add(null);
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void registerPlayer(Player player1, Player player2) {
        this.players.set(0, player1);
        this.players.set(1, player2);
    }

    // Start battle game
    public void startGame() {
        int match = 1;
        Player player1 = this.players.get(0);
        Player player2 = this.players.get(1);
        System.out.println("Game Start!");
        System.out.println(player1.getName() + " character : " + player1.getSelectedCharacter().getName());
        System.out.println("VS");
        System.out.println(player2.getName() + " character : " + player2.getSelectedCharacter().getName());

        while (!isEndGame) {
            delay(1500);
            System.out.println("=====================================");
            System.out.println();
            System.out.println("Match " + match);
            System.out.println();

            delay(1500);

            System.out.println("-------------------------------------");
            System.out.println();
            System.out.println(player1.getName() + " character status : ");
            player1.getSelectedCharacter().status();
            delay(1500);
            System.out.println(player2.getName() + " character status : ");
            player2.getSelectedCharacter().status();
            System.out.println("-------------------------------------");

            delay(1500);

            System.out.println();
            System.out.println(player1.getName() + " turn");

            if (player1 instanceof HumanPlayer) {
                chooseMoveHuman(player1, player2);
            }
            else {
                delay(2500);
                chooseMoveComputer(player1, player2);
            }

            if (player2.getSelectedCharacter().getHp() <= 0) {
                System.out.println(player2.getName() + " loses");
                System.out.println(player1.getName() + " wins");
                endGame();
                break;
            }
            if (player1.getSelectedCharacter().getHp() <= 0) {
                System.out.println(player1.getName() + " loses");
                System.out.println(player2.getName() + " wins");
                endGame();
                break;
            }

            System.out.println();
            delay(1500);
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.println(player1.getName() + " character status : ");
            player1.getSelectedCharacter().status();
            delay(1500);
            System.out.println(player2.getName() + " character status : ");
            player2.getSelectedCharacter().status();
            System.out.println("-------------------------------------");

            delay(1500);

            System.out.println();
            System.out.println(player2.getName() + " turn");

            if (player2 instanceof HumanPlayer) {
                chooseMoveHuman(player2, player1);
            }
            else {
                delay(2500);
                chooseMoveComputer(player2, player1);
            }

            if (player1.getSelectedCharacter().getHp() <= 0) {
                System.out.println(player1.getName() + " loses");
                System.out.println(player2.getName() + " wins");
                endGame();
                break;
            }
            if (player2.getSelectedCharacter().getHp() <= 0) {
                System.out.println(player2.getName() + " loses");
                System.out.println(player1.getName() + " wins");
                endGame();
                break;
            }

            match++;

            System.out.println();
        }

    }

    // State game over
    private void endGame(){
        this.isEndGame = true;
        System.out.println("Game Over");
    }

    // Move list player human
    private void chooseMoveHuman(Player human, Player opponent) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Move list : ");
        System.out.println("1. Basic Attack");
        System.out.println("2. Jutsu");
        System.out.println("3. Chakra Recovery");
        System.out.println("4. Surrender");
        System.out.println("Choose your move: ");
        int move = input1.nextInt();
        switch (move) {
            case 1:
                System.out.println(human.getSelectedCharacter().getName() + " uses basic attack");
                human.getSelectedCharacter().basicAttack(opponent.getSelectedCharacter());
                break;

            case 2:
                chooseJutsuHuman(human, opponent);
                break;

            case 3:
                System.out.println(human.getSelectedCharacter().getName() + " healing chakra");
                human.getSelectedCharacter().healChakra();
                break;

            case 4:
                System.out.println(human.getName() + " surrenders");
                System.out.println(opponent.getName() + " wins");
                endGame();
                break;

            default:
                break;
        }
    }

    // Pick jutsu player human
    private void chooseJutsuHuman(Player human, Player opponent) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Jutsu list : ");
        System.out.println("0. Back");
        human.getSelectedCharacter().showMasteredJutsu();
        Jutsu jutsu;
        System.out.println("Choose your jutsu : ");
        int choice = input2.nextInt();
        switch (choice) {
            case 0:
                chooseMoveHuman(human, opponent);
                break;

            case 1:
                jutsu = human.getSelectedCharacter().pickMasteredJutsu(choice-1);
                System.out.println(human.getSelectedCharacter().getName() + " casts " + jutsu.getName());
                human.getSelectedCharacter().castJutsu(jutsu, opponent.getSelectedCharacter());
                break;

            case 2:
                jutsu = human.getSelectedCharacter().pickMasteredJutsu(choice-1);
                System.out.println(human.getSelectedCharacter().getName() + " casts " + jutsu.getName());
                human.getSelectedCharacter().castJutsu(jutsu, opponent.getSelectedCharacter());
                break;

            case 3:
                jutsu = human.getSelectedCharacter().pickMasteredJutsu(choice-1);
                System.out.println(human.getSelectedCharacter().getName() + " casts " + jutsu.getName());
                human.getSelectedCharacter().castJutsu(jutsu, opponent.getSelectedCharacter());
                break;

            default:
                break;
        }
    }

    // Move list player computer
    private void chooseMoveComputer(Player computer, Player opponent) {
        Random rand = new Random();
        int move = rand.nextInt(3) + 1;
        switch (move) {
            case 1:
                System.out.println(computer.getSelectedCharacter().getName() + " uses basic attack");
                computer.getSelectedCharacter().basicAttack(opponent.getSelectedCharacter());
                break;

            case 2:
                chooseJutsuComputer(computer, opponent);
                break;

            case 3:
                System.out.println(computer.getSelectedCharacter().getName() + " healing chakra");
                computer.getSelectedCharacter().healChakra();
                break;

            case 4:
                System.out.println(computer.getName() + " surrenders");
                System.out.println(opponent.getName() + " wins");
                endGame();
                break;

            default:
                break;
        }
    }

    // Pick jutsu untuk player computer
    private void chooseJutsuComputer(Player computer, Player opponent) {
        Random rand = new Random();
        Jutsu jutsu;
        int choice = rand.nextInt(4);
        switch (choice) {
            case 0:
                chooseMoveComputer(computer, opponent);
                break;

            case 1:
                jutsu = computer.getSelectedCharacter().pickMasteredJutsu(choice-1);
                System.out.println(computer.getSelectedCharacter().getName() + " casts " + jutsu.getName());
                computer.getSelectedCharacter().castJutsu(jutsu, opponent.getSelectedCharacter());
                break;

            case 2:
                jutsu = computer.getSelectedCharacter().pickMasteredJutsu(choice-1);
                System.out.println(computer.getSelectedCharacter().getName() + " casts " + jutsu.getName());
                computer.getSelectedCharacter().castJutsu(jutsu, opponent.getSelectedCharacter());
                break;

            case 3:
                jutsu = computer.getSelectedCharacter().pickMasteredJutsu(choice-1);
                System.out.println(computer.getSelectedCharacter().getName() + " casts " + jutsu.getName());
                computer.getSelectedCharacter().castJutsu(jutsu, opponent.getSelectedCharacter());
                break;

            default:
                break;
        }
    }

    // Delay untuk animasi interaktif pada CLI
    private void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
