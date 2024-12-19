package jp.ac.uryukyu.ie.e245732;

/**
 * ゲームボードクラス。 ボードの初期化、ブロックの配置、描画、ユーザー入力の処理を行う。
 */
public class GameBoard {
    private int rows; // ボードの行数
    private int columns; // ボードの列数
    private char[][] board; // ボードの状態を保持する二次元配列
    private Block currentBlock; // 現在のブロック

    /**
     * コンストラクタ。指定された行数と列数でボードを初期化する。
     *
     * @param rows ボードの行数
     * @param columns ボードの列数
     */
    public GameBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new char[rows][columns];
    }

    /**
     * ボードを初期化するメソッド。 すべてのセルを空白に設定する。
     */
    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = ' ';
            }
        }
    }

    /**
     * ゲームを開始するメソッド。 ゲームオーバーでない限りループを実行する。
     */
    public void startGame() {
        currentBlock = new BlockT(); // 仮にT字型のブロックを生成
        while (!isGameOver()) {
            initializeBoard(); // ボードをクリア
            placeBlock(currentBlock); // 現在のブロックをボードに配置
            drawBoard(); // ボードを描画
            currentBlock.moveDown(); // ブロックを1マス下に移動
            try {
                Thread.sleep(500); // 0.5秒間一時停止
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ゲームオーバー!");
    }

    /**
     * ブロックをボードに配置するメソッド。
     *
     * @param block 配置するブロック
     */
    public void placeBlock(Block block) {
        char[][] shape = block.getShape();
        int x = block.getX();
        int y = block.getY();
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if (shape[i][j] != ' ') {
                    board[y + i][x + j] = shape[i][j];
                }
            }
        }
    }

    /**
     * ボードを描画するメソッド。 現在のボードの状態をコンソールに表示する。
     */
    private void drawBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        // 横線を描画
        for (int j = 0; j < columns; j++) {
            System.out.print('-');
        }
        System.out.println();
    }

    /**
     * ゲームオーバーかどうかをチェックするメソッド。
     *
     * @return ゲームオーバーの場合はtrue、そうでない場合はfalse
     */
    private boolean isGameOver() {
        // ゲームオーバーの判定
        return false;
    }

    /**
     * ボードを取得するメソッド。
     *
     * @return ボード
     */
    public char[][] getBoard() {
        return board;
    }
}
