package stg.model.piece;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 3/8/17.
 */
public class BlackKingTest {
    private BlackKing bk;
    private Board board;
    
    @Before
    public void setup() {
        this.bk = new BlackKing();
        this.board = new Board();
    }
    
    @Test
    public void testGetPossibleMoves() {
        assertEquals(1, bk.getPossibleMoves(board, 13).size());
        assertEquals(2, bk.getPossibleMoves(board, 18).size());
    }
}
