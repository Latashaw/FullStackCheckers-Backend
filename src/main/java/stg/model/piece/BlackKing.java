package stg.model.piece;

import stg.model.Color;
import stg.model.move.BlackMove;
import stg.model.move.WhiteMove;

/**
 * Created by rickjackson on 3/6/17.
 */
public class BlackKing implements King, BlackMove, WhiteMove {

    String name = "BlackKing";
    private int position;
    private int[] possibleMoves = new int[4];

    BlackKing() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BlackKing(int position) {
        this.position = position;
    }
}
