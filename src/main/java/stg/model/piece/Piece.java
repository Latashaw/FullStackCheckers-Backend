package stg.model.piece;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import stg.model.board.Board;

import java.util.List;
import java.util.Map;

/**
 * Created by rickjackson on 3/6/17.
 */
@JsonDeserialize(using = PieceDeserializer.class)
public interface Piece {
    
    List<Integer> getPossibleMoves(Board board, int position);
}
