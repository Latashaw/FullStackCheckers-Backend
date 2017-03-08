package stg.model.piece;

import org.junit.Before;
import org.junit.Test;
import stg.model.board.Board;

/**
 * Created by rickjackson on 3/8/17.
 */
public class WhiteKingTest {
    private WhiteKing wk;
    private Board board;
    
    @Before
    public void setup() {
        this.wk = new WhiteKing();
        this.board = new Board();
    }
    
    @Test
    public void testGetPossibleMoves() {
        System.out.println(wk.getPossibleMoves(board, 13));
    }
}
