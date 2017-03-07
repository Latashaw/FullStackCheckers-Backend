package stg.model.piece;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import stg.model.move.WhiteMove;

/**
 * Created by rickjackson on 3/7/17.
 */
public class WhiteManTest {
    private WhiteMove white;
    
    @Before
    public void setup() {
        this.white = new WhiteMan();
    }
    
    @Test
    public void testNorthWestSimpleMove() {
        assertEquals(-1, white.northWestSimpleMove(0));
        assertEquals(-1, white.northWestSimpleMove(4));
        assertEquals(0, white.northWestSimpleMove(5));
        assertEquals(15, white.northWestSimpleMove(19));
        assertEquals(26, white.northWestSimpleMove(31));
        assertEquals(22, white.northWestSimpleMove(26));
        
    }
    
    @Test
    public void testNorthEastSimpleMove() {
        assertEquals(-1, white.northEastSimpleMove(0));
        assertEquals(0, white.northEastSimpleMove(4));
        assertEquals(1, white.northEastSimpleMove(5));
        assertEquals(7, white.northEastSimpleMove(10));
        assertEquals(26, white.northEastSimpleMove(30));
    }
    
    @Test
    public void testNorthWestJumpMove() {
        assertEquals(-1, white.northWestJumpMove(0));
        assertEquals(-1, white.northWestJumpMove(3));
        assertEquals(-1, white.northWestJumpMove(4));
        assertEquals(-1, white.northWestJumpMove(8));
        assertEquals(2, white.northWestJumpMove(11));
        assertEquals(18, white.northWestJumpMove(27));
    }
    
    @Test
    public void testNorthEastJumpMove() {
        assertEquals(-1, white.northEastJumpMove(0));
        assertEquals(-1, white.northEastJumpMove(3));
        assertEquals(-1, white.northEastJumpMove(4));
        assertEquals(-1, white.northEastJumpMove(7));
        assertEquals(1, white.northEastJumpMove(8));
        assertEquals(14, white.northEastJumpMove(21));
        assertEquals(23, white.northEastJumpMove(30));
        assertEquals(-1, white.northEastJumpMove(31));
    }
}
