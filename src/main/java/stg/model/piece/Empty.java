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
}
