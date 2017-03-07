package stg.model.piece;

import stg.model.Color;
import stg.model.move.BlackMove;

/**
 * Created by rickjackson on 3/6/17.
 */
public class BlackMan implements Man, BlackMove {
    String name = "BlackMan";

    BlackMan() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
