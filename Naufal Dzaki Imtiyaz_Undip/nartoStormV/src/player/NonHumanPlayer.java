package player;
import character.Shinobi;

// Player bukan manusia / computer
public class NonHumanPlayer implements Player {
    private Shinobi selectedCharacter;
    private String name;

    public NonHumanPlayer() {
        this.selectedCharacter = null;
        this.name = "Computer";
    }

    public NonHumanPlayer(String name) {
        this();
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
