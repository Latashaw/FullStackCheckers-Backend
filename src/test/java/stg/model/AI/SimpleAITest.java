package stg.model.AI;

import org.junit.Before;
import org.junit.Test;
import stg.model.board.Board;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 3/15/17.
 */
public class SimpleAITest {
    Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void getNewBoard() throws Exception {
        Board expected = board.copy().getPossibleBoardState(9, 13);
        Board actual = SimpleAI.getNewBoard(board);
        assertEquals(expected, actual);
    }

}