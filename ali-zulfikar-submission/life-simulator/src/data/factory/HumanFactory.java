package data.factory;

import entity.Human;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import types.Status.models.Status;

public class HumanFactory {
    private static final String[] NAMES = {"John", "Jane", "Emily", "Jacob", "Emma", "Michael", "Madison", "Matthew", "Olivia", "Nicholas"};
    private static final String[] SURNAMES = {"Doe", "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore"};
    private static final String[] EDUCATIONS = {"High School", "Undergraduate", "Graduate", "PhD"};
    private static final Random RAND = new Random();
    private static final Set<String> NAME = new HashSet<>();
    private static final Set<String> SURNAME = new HashSet<>();

    public Human createRandomHuman() {
        int energy = RAND.nextInt(100);
        int hunger = RAND.nextInt(100);
        int thirst = RAND.nextInt(100);
        int tiredness = RAND.nextInt(100);
        int health = RAND.nextInt(100);
        double money = RAND.nextInt(100);
        int intelligence = RAND.nextInt(100);
        int social = RAND.nextInt(100);
        int emotion = RAND.nextInt(100);
        String name = NAMES[RAND.nextInt(NAMES.length)];
        if (NAME.contains(name)) {
            while (NAME.contains(name)) {
                name = NAMES[RAND.nextInt(NAMES.length)];
            }
        }
        String surname = SURNAMES[RAND.nextInt(SURNAMES.length)];
        if (SURNAME.contains(surname)) {
            while (SURNAME.contains(surname)) {
                surname = SURNAMES[RAND.nextInt(SURNAMES.length)];
            }
        }
        NAME.add(name);
        SURNAME.add(surname);
        int age = RAND.nextInt(50) + 20;
        boolean isMarried = RAND.nextBoolean();
        String education = EDUCATIONS[RAND.nextInt(EDUCATIONS.length)];

        Status status = new Status(emotion, energy, hunger, thirst, tiredness, health, money, intelligence, social, name, surname, age, isMarried, education);

        return new Human(status);
    }
}
