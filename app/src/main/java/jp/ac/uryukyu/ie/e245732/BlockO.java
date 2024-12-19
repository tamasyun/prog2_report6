package jp.ac.uryukyu.ie.e245732;

/**
 * O字型ブロッククラス。
 * O字型のブロックを初期化する。
 */
public class BlockO extends Block {
    /**
     * コンストラクタ。O字型の形状でブロックを初期化する。
     */
    public BlockO() {
        super(new char[][]{
            {'■', '■'},
            {'■', '■'}
        });
    }
}