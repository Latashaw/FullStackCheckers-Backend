package stg.model.piece;

import stg.model.move.BlackMove;

/**
 * Created by rickjackson on 3/6/17.
 */
public class BlackMan implements Man, BlackMove {
   public final String type = this.getSimpleName();

    public String getType() {
        return type;
    }

    private String getSimpleName(){

        return "BlackMan";
    }
}
