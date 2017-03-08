package stg.model.piece;

import stg.model.board.Board;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Empty implements Piece {

    String name = "Empty";
    private int position;

    public Empty() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Empty(int position) {
        this.position = position;
    }

    @Override
    public List<Integer> getPossibleMoves(Board b, int i) {
        return new ArrayList<>(0);
    }
}
