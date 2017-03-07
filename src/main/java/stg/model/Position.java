package stg.model;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Position {
    public final int x;
    public final int y;
    public int index;
    
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        setIndex();
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int[] getCoordinates() {
        int[] c = {x, y};
        return c;
    }
    
    public int getIndex() {
        return index;
    }
    
    public void setIndex() {
        index = (x + 1) * (y + 1);
    }
}
