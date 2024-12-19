package jp.ac.uryukyu.ie.e245732;

/**
 * I字型ブロッククラス。
 * I字型のブロックを初期化する。
 */
public class BlockI extends Block {
    /**
     * コンストラクタ。I字型の形状でブロックを初期化する。
     */
    public BlockI() {
        super(new char[][]{
            {'■'},
            {'■'},
            {'■'},
            {'■'}
        });
    }
}
