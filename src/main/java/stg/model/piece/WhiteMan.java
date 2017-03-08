package stg.model.piece;

import stg.model.move.WhiteMove;

/**
 * Created by rickjackson on 3/6/17.
 */
public class WhiteMan implements Man, WhiteMove {

    public final String type = this.getSimpleName();

    public String getType() {
        return type;
    }

    private String getSimpleName(){

        return "WhiteMan";
    }
}
