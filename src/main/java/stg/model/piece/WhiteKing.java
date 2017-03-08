package stg.model.piece;


import stg.model.move.BlackMove;
import stg.model.move.WhiteMove;

/**
 * Created by rickjackson on 3/6/17.
 */
public class WhiteKing implements King, WhiteMove, BlackMove {

    public final String type = this.getSimpleName();

    public String getType() {
        return type;
    }

    private String getSimpleName(){

        return "WhiteKing";
    }

    String name = "WhiteKing";
    private int position;

    WhiteKing() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhiteKing(int position) {
        this.position = position;
    }
}
