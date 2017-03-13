package stg.model.board;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

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
    public void checkPositionEmptyTest() throws Exception {
        boolean expected = true;
        boolean actual = board.checkPositionEmpty(13);
        assertEquals(expected, actual);
    }

    @Test
    public void checkPositionEmptyFalseTest() throws Exception {
        boolean expected = false;
        boolean actual = board.checkPositionEmpty(12);
        assertEquals(expected, actual);
    }


    @Test
    public void updateBoardTest() throws Exception {
        board.updateBoard(12,15);
        assertTrue(board.checkPositionEmpty(12));
        assertFalse(board.checkPositionEmpty(15));
    }

    @Test
    public void movePieceTest() throws Exception {
        board.movePiece(21,16);
        assertFalse(board.checkPositionEmpty(16));
    }

    @Test
    public void boardSpotToEmptyTest() throws Exception {
        board.boardSpotToEmpty(1);
        assertTrue(board.checkPositionEmpty(1));
    }

    @Test
    public void capturePieceTest() throws Exception {
        board.capturePiece(12);
        assertTrue(board.checkPositionEmpty(12));
        assertEquals(11, board.getBlackPieceCount());
    }

    @Test
    public void checkGameFinishedTest() throws Exception {
        for(int i = 1; i<=12; i++) {
            board.capturePiece(i);
        }
        assertTrue(board.checkGameFinished());
    }

    @Test
    public void isWhiteWinnerTest() throws Exception {
        for(int i = 1; i<=12; i++) {
            board.capturePiece(i);
        }
        assertTrue(board.isWhiteWinner());
    }

    @Test
    public void isBlackWinnerTest() throws Exception {
        for(int i = 20; i<=32; i++) {
            board.capturePiece(i);
        }
        assertTrue(board.isBlackWinner());
    }

    @Test
    public void getPossibleMovesTest() throws Exception {
        List<Integer> expected = new ArrayList<>(1);
        expected.add(16);
        List<Integer> actual = Board.getPossibleMoves(board, 12);
        assertEquals(expected, actual);
    }

    @Test
    public void getPossibleMovesEmptyTest() throws Exception {
        List<Integer> expected = new ArrayList<>(0);
        List<Integer> actual = Board.getPossibleMoves(board, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void copyTest() {
        Board boardTest = board.copy();
        assertEquals(board.getBoard(), boardTest.getBoard());
    }

    @Test
    public void getAllPossibleBlackMovers() throws Exception {
        List actual = board.getAllPossibleBlackMovers();
        int expected = 7;
        System.out.println(actual);
//        assertEquals(expected,actual.size());
    }

    @Test
    public void getAllPossibleWhiteMovers() throws Exception {

    }

}
