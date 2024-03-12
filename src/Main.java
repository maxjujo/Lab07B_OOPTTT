// Main.java
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        GameGUI gameGUI = new GameGUI();
        GameController controller = new GameController(game, gameGUI);
        // Set controller for buttons
        // Show GUI
    }
}
