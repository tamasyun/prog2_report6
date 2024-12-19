package jp.ac.uryukyu.ie.e245732;

/**
 * ブロッククラス。 ブロックの形状と位置を管理する。
 */
public class Block {
    private char[][] shape; // ブロックの形状
    private int x, y; // ブロックの位置

    /**
     * コンストラクタ。指定された形状でブロックを初期化する。
     * 
     * @param shape ブロックの形状
     */
    public Block(char[][] shape) {
        this.shape = shape;
        this.x = 0;
        this.y = 0;
    }

    /**
     * ブロックの形状を取得するメソッド。
     * 
     * @return ブロックの形状
     */
    public char[][] getShape() {
        return shape;
    }

    /**
     * ブロックのX座標を取得するメソッド。
     * 
     * @return ブロックのX座標
     */
    public int getX() {
        return x;
    }

    /**
     * ブロックのY座標を取得するメソッド。
     * 
     * @return ブロックのY座標
     */
    public int getY() {
        return y;
    }

    /**
     * ブロックを1マス下に移動するメソッド。
     */
    public void moveDown() {
        y++;
    }

    /**
     * ブロックを1マス左に移動するメソッド。
     */
    public void moveLeft() {
        x--;
    }

    /**
     * ブロックを1マス右に移動するメソッド。
     */
    public void moveRight() {
        x++;
    }

    /**
     * ブロックを回転させるメソッド。
     */
    public void rotate() {
        char[][] rotatedShape = new char[shape[0].length][shape.length];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                rotatedShape[j][shape.length - 1 - i] = shape[i][j];
            }
        }
        shape = rotatedShape;
    }
}
