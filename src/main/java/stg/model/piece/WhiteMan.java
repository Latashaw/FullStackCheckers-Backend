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

    String name = "WhiteMan";
    private int position;

    public WhiteMan() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhiteMan(int position) {
        this.position = position;
    }
}
