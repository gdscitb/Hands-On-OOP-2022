package types.Status.interfaces;

public interface IStatus {
    /**
     * @return The energy of the human.
     */
    int getEnergy();

    /**
     * @param amount Set the energy of the human.
     * @param action The action that the human is doing.
     */
    void setEnergy(int amount, String action);

    /**
     * @return The hunger of the human.
     */
    int getHunger();

    /**
     * @param hunger Set the hunger of the human.
     */
    void setHunger(int hunger);

    /**
     * @return The thirst of the human.
     */
    int getThirst();

    /**
     * @param thirst Set the thirst of the human.
     */
    void setThirst(int thirst);

    /**
     * @return The health of the human.
     */
    int getHealth();

    /**
     * @param health Set the Human Health
     */
    void setHealth(int health);

    /**
     * @return The amount of money the human has.
     */
    double getMoney();

    /**
     * @param money Set the human money
     */
    void setMoney(double money);

    /**
     * @return The intelligence of the human.
     */
    int getIntelligence();

    /**
     * @param intelligence Set the human intelligence
     */
    void setIntelligence(int intelligence);

    /**
     * @return Social status of the human.
     */
    int getSocial();

    /**
     * @param social Set the human social status
     */
    void setSocial(int social);
}
