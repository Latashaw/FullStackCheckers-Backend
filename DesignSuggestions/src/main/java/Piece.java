/**
 * Created by latashawatson on 3/7/17.
 */
public class Piece {
    private String state;
    private String direction;

    //should consider using ENUMS for these parameters, for King Class as well
    public Piece(String state, String direction) {
        this.state = state;
        this.direction = state;
    }
    //example "BLACK PIECE"
    public String getState() {
        return state;
    }
    //direction is the direction the pieces will be moving on the board, North/South
    public String getDirection() {
        return direction;
    }

    public void moveOneLeft(){}

    public void moveOneRight(){}

    public void moveTwoLeft(){}

    public void moveTwoRight(){}


}
