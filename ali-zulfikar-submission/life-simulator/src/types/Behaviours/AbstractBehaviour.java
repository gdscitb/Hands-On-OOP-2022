package types.Behaviours;

import types.Utility.Emotion;
import types.Utility.Food;
import types.Utility.Subject;

public abstract class AbstractBehaviour {
    /**
     * @param food   The food to eat.
     * @param amount The amount of food to eat.
     */
    protected abstract void eat(Food food, int amount);

    /**
     * @param amount  The amount of food to drink.
     */
    protected abstract void drink(int amount);

    /**
     * @param hours The amount of hours to sleep.
     */
    protected abstract void sleep(int hours);

    /**
     * @param distance The distance to walk.
     * @param speed    The speed to walk.
     */
    protected abstract void walk(int distance, int speed);

    /**
     * @param duration The duration of the talk.
     * @param emotion  The emotion of the talk.
     */
    protected abstract void talk(int duration, Emotion emotion);

    /**
     * @param hours The amount of hours to work.
     */
    protected abstract void work(int hours);

    /**
     * @param hours   The amount of hours to study.
     * @param subject The subject to study.
     */

    protected abstract void study(int hours, Subject subject);

    public abstract void setEnergy(int energy, String action);
}
