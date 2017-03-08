package stg.model.piece;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import stg.model.board.Board;

/**
 * Created by rickjackson on 3/7/17.
 */
public class BlackManTest {
    BlackMan black;
    WhiteMan white;
    Board board;
    BlackKing blackKing;
    WhiteKing whiteKing;
    
    @Before
    public void setup() {
        this.black = new BlackMan();
        this.white = new WhiteMan();
        this.board = new Board();
        this.blackKing = new BlackKing();
        this.whiteKing = new WhiteKing();
    }
    
    // Move Tests
    
    @Test
    public void testSouthWestSimpleMove() {
        assertEquals(5, black.southWestSimpleMove(1));
        assertEquals(8, black.southWestSimpleMove(4));
        assertEquals(-1, black.southWestSimpleMove(5));
        assertEquals(11, black.southWestSimpleMove(8));
        assertEquals(29, black.southWestSimpleMove(25));
        assertEquals(32, black.southWestSimpleMove(28));
        assertEquals(-1, black.southWestSimpleMove(29));
        assertEquals(-1, black.southWestSimpleMove(32));
    }
    
    @Test
    public void testSouthEastSimpleMove() {
        assertEquals(6, black.southEastSimpleMove(1));
        assertEquals(-1, black.southEastSimpleMove(4));
        assertEquals(9, black.southEastSimpleMove(5));
        assertEquals(12, black.southEastSimpleMove(8));
        assertEquals(30, black.southEastSimpleMove(25));
        assertEquals(-1, black.southEastSimpleMove(28));
        assertEquals(-1, black.southEastSimpleMove(29));
        assertEquals(-1, black.southEastSimpleMove(32));
    }
    
    @Test
    public void testSouthWestJumpMove() {
        assertEquals(-1, black.southWestJumpMove(1));
        assertEquals(9, black.southWestJumpMove(2));
        assertEquals(10, black.southWestJumpMove(3));
        assertEquals(11, black.southWestJumpMove(4));
        assertEquals(-1, black.southWestJumpMove(5));
        assertEquals(13, black.southWestJumpMove(6));
        assertEquals(14, black.southWestJumpMove(7));
        assertEquals(15, black.southWestJumpMove(8));
        assertEquals(31, black.southWestJumpMove(24));
        assertEquals(-1, black.southWestJumpMove(25));
        assertEquals(-1, black.southWestJumpMove(32));
    }
    
    @Test
    public void testSouthEastJumpMove() {
        assertEquals(10, black.southEastJumpMove(1));
        assertEquals(11, black.southEastJumpMove(2));
        assertEquals(12, black.southEastJumpMove(3));
        assertEquals(-1, black.southEastJumpMove(4));
        assertEquals(14, black.southEastJumpMove(5));
        assertEquals(15, black.southEastJumpMove(6));
        assertEquals(16, black.southEastJumpMove(7));
        assertEquals(-1, black.southEastJumpMove(8));
        assertEquals(30, black.southEastJumpMove(21));
        assertEquals(-1, black.southEastJumpMove(25));
        assertEquals(-1, black.southEastJumpMove(32));
    }
    
    @Test
    public void testGetPossibleMoves() {
        
        System.out.println(black.getPossibleMoves(board, 18));
        System.out.println(blackKing.getPossibleMoves(board, 18));
        System.out.println(white.getPossibleMoves(board, 18));
        System.out.println(whiteKing.getPossibleMoves(board, 18));
    }
}
