//package stg.model.piece;
//
//import static org.junit.Assert.assertEquals;
//import org.junit.Before;
//import org.junit.Test;
//import stg.model.board.Board;
//import stg.model.move.WhiteMove;
//
//import java.util.ArrayList;
//
///**
// * Created by rickjackson on 3/7/17.
// */
//public class WhiteManTest {
//    private WhiteMan white;
//    private Board board;
//
//    @Before
//    public void setup() {
//        this.white = new WhiteMan(17);
//        this.board = new Board();
//    }
//
//    @Test
//    public void testNorthWestSimpleMove() {
//        assertEquals(-1, white.northWestSimpleMove(1));
//        assertEquals(-1, white.northWestSimpleMove(4));
//        assertEquals(-1, white.northWestSimpleMove(5));
//        assertEquals(3, white.northWestSimpleMove(8));
//        assertEquals(21, white.northWestSimpleMove(25));
//        assertEquals(24, white.northWestSimpleMove(28));
//        assertEquals(-1, white.northWestSimpleMove(29));
//        assertEquals(27, white.northWestSimpleMove(32));
//    }
//
//    @Test
//    public void testNorthEastSimpleMove() {
//        assertEquals(-1, white.northEastSimpleMove(1));
//        assertEquals(-1, white.northEastSimpleMove(4));
//        assertEquals(1, white.northEastSimpleMove(5));
//        assertEquals(4, white.northEastSimpleMove(8));
//        assertEquals(22, white.northEastSimpleMove(25));
//        assertEquals(-1, white.northEastSimpleMove(28));
//        assertEquals(25, white.northEastSimpleMove(29));
//        assertEquals(28, white.northEastSimpleMove(32));
//    }
//
//    @Test
//    public void testNorthWestJumpMove() {
//        assertEquals(-1, white.northWestJumpMove(1));
//        assertEquals(-1, white.northWestJumpMove(4));
//        assertEquals(-1, white.northWestJumpMove(5));
//        assertEquals(-1, white.northWestJumpMove(8));
//        assertEquals(3, white.northWestJumpMove(12));
//        assertEquals(13, white.northWestJumpMove(22));
//        assertEquals(-1, white.northWestJumpMove(25));
//        assertEquals(19, white.northWestJumpMove(28));
//        assertEquals(21, white.northWestJumpMove(30));
//        assertEquals(23, white.northWestJumpMove(32));
//    }
//
//    @Test
//    public void testNorthEastJumpMove() {
//        assertEquals(-1, white.northEastJumpMove(1));
//        assertEquals(-1, white.northEastJumpMove(8));
//        assertEquals(2, white.northEastJumpMove(9));
//        assertEquals(-1, white.northEastJumpMove(12));
//        assertEquals(18, white.northEastJumpMove(25));
//        assertEquals(20, white.northEastJumpMove(27));
//        assertEquals(22, white.northEastJumpMove(29));
//        assertEquals(-1, white.northEastJumpMove(32));
//    }
//
//    @Test
//    public void testGetPossibleMoves() {
//        System.out.println(white.getPossibleMoves(board, 18));
//    }
//}
