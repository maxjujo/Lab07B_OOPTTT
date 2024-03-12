// Game.java
public class Game {
    private TTTBoard board;
    private char currentPlayer;

    public Game() {
        board = new TTTBoard(3); // Assuming 3x3 board
        currentPlayer = 'X'; // X starts the game
    }


}
