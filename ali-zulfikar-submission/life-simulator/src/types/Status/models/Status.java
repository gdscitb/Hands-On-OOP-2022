package types.Status.models;

import types.Status.interfaces.IPersonal;
import types.Status.interfaces.IStatus;

public class Status implements IStatus, IPersonal {
    private int energy;
    private int hunger;
    private int thirst;
    private int health;
    private double money;
    private int intelligence;
    private int social;
    private String name;
    private String surname;
    private int age;
    private boolean isMarried;
    private String education;

    public Status(int emotion, int energy, int hunger, int thirst, int tiredness, int health, double money, int intelligence, int social, String name, String surname, int age, boolean isMarried, String education) {
        this.energy = energy;
        this.hunger = hunger;
        this.thirst = thirst;
        this.health = health;
        this.money = money;
        this.intelligence = intelligence;
        this.social = social;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMarried = isMarried;
        this.education = education;
    }
    /**
     *
     * @return The energy of the human.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     *
     * @param amount The energy of the human.
     * @param action The action that the human is doing.
     */
    public void setEnergy(int amount, String action) {
        switch (action) {
            case "EAT" -> this.energy += amount;
            case "SLEEP" -> this.energy = amount;
            case "WORK", "WALK" -> this.energy -= amount;
            case "PLAY", "STUDY", "RELAX" -> this.energy -= 5;
            case "TALK" -> this.energy -= (amount / 5);
            case "DRINK" -> this.energy += 5;
        }
    }

    /**
     *
     * @return The hunger of the human.
     */
    public int getHunger() {
        return hunger;
    }

    /**
     *
     * @param hunger The hunger of the human.
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     *
     * @return The thirst of the human.
     */
    public int getThirst() {
        return thirst;
    }

    /**
     *
     * @param thirst The thirst of the human.
     */

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    /**
     *
     * @return The health of the human.
     */
    public int getHealth() {
        return health;
    }

    /**
     *
     * @param health The health of the human.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     *
     * @return The money of the human.
     */
    public double getMoney() {
        return money;
    }

    /**
     *
     * @param money The money of the human.
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     *
     * @return The intelligence of the human.
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     *
     * @param intelligence The intelligence of the human.
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     *
     * @return The social of the human.
     */
    public int getSocial() {
        return social;
    }

    /**
     *
     * @param social The social of the human.
     */
    public void setSocial(int social) {
        this.social = social;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isMarried() {
        return this.isMarried;
    }

    @Override
    public void setMarried(boolean married) {
        this.isMarried = married;
    }

    @Override
    public String getEducation() {
        return this.education;
    }

    @Override
    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void getIdentity() {
        System.out.println("I'm " + this.name + " and I'm " + this.age + " years old! Now my education is " + this.education);
    }
}
