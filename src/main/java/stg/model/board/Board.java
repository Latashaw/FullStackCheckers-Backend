package stg.model.board;

import stg.model.piece.BlackMan;
import stg.model.piece.Empty;
import stg.model.piece.Piece;
import stg.model.piece.WhiteMan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Board {
    Map<Integer, Piece> board = new HashMap<>(32);
    
    public Board() {
        for (int i = 1; i <= 32; i++) {
            if (i <= 12) {
                board.put(i, new BlackMan(i));
            } else if (i >= 21) {
                board.put(i, new WhiteMan(i));
            } else {
                board.put(i, new Empty(i));
            }
        }
    }

    public void setBoard(Map<Integer, Piece> board) {
        this.board = board;
    }

    public Map<Integer, Piece> getBoard() {
        return board;
    }
}