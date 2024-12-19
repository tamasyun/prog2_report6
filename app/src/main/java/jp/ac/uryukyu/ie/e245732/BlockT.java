package jp.ac.uryukyu.ie.e245732;

/**
 * T字型ブロッククラス。
 * T字型のブロックを初期化する。
 */
public class BlockT extends Block {
    /**
     * コンストラクタ。T字型の形状でブロックを初期化する。
     */
    public BlockT() {
        super(new char[][]{
            {' ', '■', ' '},
            {'■', '■', '■'}
        });
    }
}
