
package jp.ac.uryukyu.ie.e245732;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameBoardTest {

    @Test
    public void testInitializeBoard() {
        int rows = 15;
        int columns = 20;
        GameBoard gameBoard = new GameBoard(rows, columns);
        gameBoard.startGame();
        char[][] board = gameBoard.getBoard();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                assertEquals(' ', board[i][j]);
            }
        }
    }

    @Test
    public void testPlaceBlock() {
        int rows = 15;
        int columns = 20;
        GameBoard gameBoard = new GameBoard(rows, columns);
        Block block = new BlockT();
        gameBoard.placeBlock(block);
        char[][] board = gameBoard.getBoard();
        char[][] shape = block.getShape();
        int x = block.getX();
        int y = block.getY();
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if (shape[i][j] != ' ') {
                    assertEquals(shape[i][j], board[y + i][x + j]);
                }
            }
        }
    }
}