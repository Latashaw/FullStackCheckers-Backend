package stg.model.AI;

import org.junit.Before;
import org.junit.Test;
import stg.model.board.Board;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 3/15/17.
 */
public class AITest {
    Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void evaluateBoardBlackTest() throws Exception {

    }

    @Test
    public void evaluateBoardPieceAmountsBlackNewBoardTest() {
        int expected = 0;
        int actual = AI.evaluateBoardPieceAmountsBlack(board);
        assertEquals(expected, actual);
    }

    @Test
    public void evaluateBoardPieceAmountsBlackOneCaptureTest() {
        int expected = 30;
        board.updateBoard(22,17);
        board.updateBoard(9,13);
        board.updateBoard(13, 22);
        board.capturePiece(17);
        int actual = AI.evaluateBoardPieceAmountsBlack(board);
        assertEquals(expected, actual);
    }


    @Test
    public void evaluateBoardPiecePositionsBlackTest() throws Exception {
        int expected = 16;
        int actual = AI.evaluateBoardPiecePositionsBlack(board);
        assertEquals(expected, actual);
    }

}