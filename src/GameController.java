// GameController.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController implements ActionListener {
    private Game game;
    private GameGUI gameGUI;

    public GameController(Game game, GameGUI gameGUI) {
        this.game = game;
        this.gameGUI = gameGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
