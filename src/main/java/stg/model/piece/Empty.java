package stg.model.piece;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Empty implements Piece {
    String name = "Empty";

    Empty() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
