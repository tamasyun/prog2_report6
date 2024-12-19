
package jp.ac.uryukyu.ie.e245732;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlockTest {

    @Test
    public void testMoveDown() {
        Block block = new BlockT();
        int initialY = block.getY();
        block.moveDown();
        assertEquals(initialY + 1, block.getY());
    }

    @Test
    public void testMoveLeft() {
        Block block = new BlockT();
        int initialX = block.getX();
        block.moveLeft();
        assertEquals(initialX - 1, block.getX());
    }

    @Test
    public void testMoveRight() {
        Block block = new BlockT();
        int initialX = block.getX();
        block.moveRight();
        assertEquals(initialX + 1, block.getX());
    }

    @Test
    public void testRotate() {
        Block block = new BlockT();
        char[][] initialShape = block.getShape();
        for(int i=0; i<4; i++){
            block.rotate();
        }
        char[][] rotatedShape = block.getShape();
        assertNotEquals(initialShape, rotatedShape);
    }
}