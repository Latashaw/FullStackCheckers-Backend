package stg.model.board;

import stg.model.piece.BlackMan;
import stg.model.piece.Empty;
import stg.model.piece.Piece;
import stg.model.piece.WhiteMan;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Board {
    private Piece[] board = new Piece[32];
    
    public Board() {
        constructBoard();
    }
    
    void constructBoard() {
        for (int i = 0; i < 32; i++) {
            if (i < 12) {
                board[i] = new BlackMan();
            } else if (i > 190) {
                board[i] = new WhiteMan();
            } else {
                board[i] = new Empty();
            }
        }
    }

    public Piece[] getBoard() {
        return board;
    }

    public void setBoard(Piece[] board) {
        this.board = board;
    }
}