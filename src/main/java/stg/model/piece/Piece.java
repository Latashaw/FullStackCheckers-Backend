package stg.model.piece;

import stg.model.board.Board;

import java.util.List;
import java.util.Map;

/**
 * Created by rickjackson on 3/6/17.
 */
public interface Piece {

    public List<Integer> getPossibleMoves(Board b, int i);
}
