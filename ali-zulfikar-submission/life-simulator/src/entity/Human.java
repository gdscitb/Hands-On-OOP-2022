package entity;

import types.Behaviours.AbstractBehaviour;
import types.Utility.Emotion;
import types.Status.models.Status;
import types.Utility.Food;
import types.Utility.Subject;

public class Human extends AbstractBehaviour {
    private final Status status;
    public Human (Status status) {
        this.status = status;
    }

    @Override
    public void eat(Food food, int amount) {
        int val = food.getValue() * amount;
        status.setHunger(status.getHunger() - val);
        status.setEnergy(val, "EAT");
    }

    @Override
    public void drink(int amount) {
        status.setThirst(status.getThirst() - amount);
        status.setEnergy(5, "DRINK");
    }

    @Override
    public void sleep(int hours) {
        int energyGain = Math.min(((hours * 10) + 10), 100);
        status.setEnergy(energyGain, "SLEEP");
    }

    @Override
    public void walk(int distance, int speed) {
        int energyConsumed = ((distance * speed) + 10) / 3;
        status.setEnergy(energyConsumed, "WALK");
    }

    @Override
    public void talk(int duration, Emotion emotion) {
        status.setEnergy(emotion.getEnergy(), "TALK");
    }

    @Override
    public void work(int hours) {
        int energyConsumed = (hours * 2);
        status.setEnergy(energyConsumed, "WORK");
    }

    @Override
    public void study(int hours, Subject subject) {
        int energyConsumed = (subject.getHours() * hours);
        System.out.println("Energy consumed: " + energyConsumed);
        status.setEnergy(energyConsumed, "STUDY");
    }

    @Override
    public void setEnergy(int energy, String action) {
        status.setEnergy(energy, action);
    }

    public Status getStatus() {
        return status;
    }
}