package stg.model.board;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 3/10/17.
 */
public class BoardTest {
    Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void doMoveTest() throws Exception {

    }

    @Test
    public void updateBoardTest() throws Exception {
        Board expected = new Board();
        board.updateBoard(11, 15);

    }

    @Test
    public void getPossibleBoardStateTest() throws Exception {

    }

    @Test
    public void capturePieceTest() throws Exception {

    }

    @Test
    public void getAllPossibleBlackMoversTest() throws Exception {

    }

    @Test
    public void getAllPossibleWhiteMoversTest() throws Exception {

    }

}