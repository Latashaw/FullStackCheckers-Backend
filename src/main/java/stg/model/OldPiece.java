package stg.model;

/**
 * Created by rickjackson on 3/6/17.
 */
public class OldPiece {
    public final Color color;
    private int x;
    private int y;
    private boolean captured = false;
    private boolean king = false;
    
    public OldPiece(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public Color getColor() {
        return color;
    }
    
    public int[] getPosition() {
        int[] p = {x, y};
        return p;
    }
    
    public void setPosition(int[] position) {
        x = position[0];
        y = position[1];
    }
    
    public boolean isCaptured() {
        return captured;
    }
    
    public void capturePiece() {
        captured = true;
    }
    
    public boolean isKing() {
        return king;
    }
    
    public void king() {
        king = true;
    }
}
