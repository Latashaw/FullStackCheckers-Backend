package stg.model.piece;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import stg.model.board.Board;

import java.util.List;

/**
 * Created by rickjackson on 3/6/17.
 */
@JsonDeserialize(as=Empty.class)

public class Empty implements Piece {

    private String getSimpleName(){

        return "Empty";
    }

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
    public List<Integer> getPossibleMoves(Board board, int position) {
        return null;
    }
}
