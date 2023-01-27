package player;
import character.Shinobi;

public interface Player{
    String getName();
    Shinobi getSelectedCharacter();
    void chooseCharacter(Shinobi selectedCharacter);
}
