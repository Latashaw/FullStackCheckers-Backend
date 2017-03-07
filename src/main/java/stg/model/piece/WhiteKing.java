package stg.model.piece;

import stg.model.Color;
import stg.model.move.BlackMove;
import stg.model.move.WhiteMove;

/**
 * Created by rickjackson on 3/6/17.
 */
public class WhiteKing implements King, WhiteMove, BlackMove {
    String name = "WhiteKing";

    WhiteKing() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
