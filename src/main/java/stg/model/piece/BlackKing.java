package stg.model.piece;

import stg.model.move.BlackMove;
import stg.model.move.WhiteMove;

/**
 * Created by rickjackson on 3/6/17.
 */
public class BlackKing implements King, BlackMove, WhiteMove {
    private int position;
    private int[] possibleMoves = new int[4];
    
    public BlackKing(int position) {
        this.position = position;
    }
}
