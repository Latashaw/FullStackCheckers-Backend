package stg.model.piece;

import org.junit.Before;
import org.junit.Test;
import stg.model.board.Board;

import static org.junit.Assert.assertEquals;

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
        assertEquals(1, wk.getPossibleMoves(board, 13).size());
        assertEquals(2, wk.getPossibleMoves(board, 18).size());
    }
}
