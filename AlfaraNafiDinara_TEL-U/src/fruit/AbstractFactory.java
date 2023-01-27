package fruit;
import fruit.apple.Apple;
import fruit.watermelon.Watermelon;

public abstract class AbstractFactory {
    protected abstract Apple getApple(String type);
    protected abstract Watermelon getWatermelon(String type);
}