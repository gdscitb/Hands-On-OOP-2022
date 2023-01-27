package player;
import character.Shinobi;

// Player manusia
public class HumanPlayer implements Player {
    private Shinobi selectedCharacter;
    private String name;

    public HumanPlayer(String name) {
        this.selectedCharacter = null;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Shinobi getSelectedCharacter() {
        return this.selectedCharacter;
    }

    @Override
    public void chooseCharacter(Shinobi selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }
}
