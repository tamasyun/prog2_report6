package jp.ac.uryukyu.ie.e245732;

/**
 * L字型ブロッククラス。
 * L字型のブロックを初期化する。
 */
public class BlockL extends Block {
    /**
     * コンストラクタ。L字型の形状でブロックを初期化する。
     */
    public BlockL() {
        super(new char[][]{
            {'■', ' '},
            {'■', ' '},
            {'■', '■'}
        });
    }
}
