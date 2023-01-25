package Messages;

import entity.Human;

public class Status {
    public static void printStatus(Human human) {
        System.out.printf("Energy: %d Hunger: %d Thirst: %d Social: %d Money: %.2f",
                human.getStatus().getEnergy(),
                human.getStatus().getHunger(),
                human.getStatus().getThirst(),
                human.getStatus().getSocial(),
                human.getStatus().getMoney());
    }
}
