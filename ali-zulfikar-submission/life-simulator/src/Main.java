import Menu.MenuOption;
import data.seeder.HumanSeeder;
import entity.Human;

import java.io.IOException;
import java.util.*;

import static Gameplay.Gameplay.gameplay;
import static Menu.MenuValidator.getValidMenuOption;
import static Messages.Welcome.*;
import static Validator.Validator.*;
import static utils.Loading.loading;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HumanSeeder humans = new HumanSeeder(10);
        boolean running = true;

        welcome();
        loading(1000);
        System.out.println();

        while (running) {
            MenuOption option = getValidMenuOption(sc, MenuOption.class);

            switch (option) {
                case PLAY -> {
                    String name = getHumanName(sc, humans);
                    Human human = getHumanByName(humans.getHumans(), name);
                    if (human != null) {
                        welcomeToTheGame();
                        gameplay(human);
                    } else {
                        System.out.println("Human not found, please try again.");
                    }
                }
                case CREATE -> System.out.println("Coming Soon!");
                case EXIT -> {
                    System.out.println("Thank you for playing!");
                    running = false;
                }
            }
        }
    }
}
