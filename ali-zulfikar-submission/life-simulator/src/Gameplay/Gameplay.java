package Gameplay;

import Menu.GameMenuOption;
import entity.Human;
import types.Utility.*;
import java.util.Scanner;
import static Menu.MenuValidator.getValidMenuOption;
import static Messages.Status.printStatus;
import static utils.Loading.loading;

public class Gameplay {
    public static void gameplay(Human human) {
        boolean exit = false;
        human.getStatus().getIdentity();
        loading(1500);

        System.out.println("You are now playing as " + human.getStatus().getName());
        System.out.println("Now, I'm going to do some things.");

        while (!exit) {
            printStatus(human);
            Scanner sc = new Scanner(System.in);

            GameMenuOption options = getValidMenuOption(sc, GameMenuOption.class);

            switch (options) {
                case GO_TO_SCHOOL -> {
                    System.out.print("What subject do you want to study? ");
                    Subject.printAll();

                    System.out.print("Enter your choice: ");
                    String subject = sc.nextLine();
                    Subject.valueOf(subject.toUpperCase());
                    human.study(3, Subject.valueOf(subject.toUpperCase()));
                    System.out.println("Studying " + subject + "...");
                    loading(1000);

                    System.out.println();
                }
                case GO_TO_WORK -> {
                    System.out.print("How many hours do you want to work? ");
                    int hours = sc.nextInt();
                    human.work(hours);
                }
                case GO_TO_TALK -> {
                    System.out.print("How many time do you want to talk?");
                    int time = sc.nextInt();
                    sc.nextLine();
                    System.out.print("What emotion do you want to show? ");
                    Emotion.printAll();

                    System.out.print("Enter your choice: ");
                    String emotion = sc.nextLine();
                    human.talk(time, Emotion.valueOf(emotion.toUpperCase()));
                }
                case GO_TO_EAT -> {
                    System.out.println("What food do you want to eat? ");
                    Food.printAll();

                    System.out.print("Enter your choice: ");
                    String food = sc.nextLine();
                    System.out.print("How many? ");
                    int amount = sc.nextInt();
                    sc.nextLine();
                    human.eat(Food.valueOf(food.toUpperCase()), amount);
                }
                case GO_TO_DRINK -> {
                    System.out.print("How many? ");
                    int amount = sc.nextInt();
                    sc.nextLine();
                    human.drink(amount);
                }
                case GO_TO_WALK -> {
                    System.out.print("How long do you want to walk? ");
                    int distance = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Speed of walking? ");
                    int speed = sc.nextInt();
                    sc.nextLine();
                    human.walk(distance, speed);
                }
                case GO_TO_SLEEP -> {
                    System.out.print("How long do you want to sleep? ");
                    int time = sc.nextInt();
                    sc.nextLine();
                    human.sleep(time);
                }
                case EXIT_GAMES -> {
                    exit = true;
                }
            }
        }
    }
}