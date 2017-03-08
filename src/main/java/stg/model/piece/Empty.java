package stg.model.piece;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Empty implements Piece {

    public final String type = this.getSimpleName();

    public String getType() {
        return type;
    }

    private String getSimpleName(){

        return "Empty";
    }
}
