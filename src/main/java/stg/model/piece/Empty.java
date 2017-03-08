package stg.model.piece;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import stg.model.board.Board;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 3/6/17.
 */
@JsonDeserialize(as = Empty.class)
public class Empty implements Piece {
    private int position;
    
    public Empty() {
        
    }
    
    public Empty(int position) {
        this.position = position;
    }
    
    public List<Integer> getPossibleMoves(Board board, int position) {
        return new ArrayList<>(0);
    }
}
