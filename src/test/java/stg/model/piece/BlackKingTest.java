package stg.model.piece;

import org.junit.Before;
import org.junit.Test;
import stg.model.board.Board;

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
        System.out.println(bk.getPossibleMoves(board, 18));
    }
}
