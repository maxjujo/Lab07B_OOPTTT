// TTTBoard.java
public class TTTBoard {
    private char[][] board;
    private int size;

    public TTTBoard(int size) {
        this.size = size;
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
    }
}

