package stg.model.piece;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 3/7/17.
 */
public class BlackManTest {
    BlackMan black;
    
    @Before
    public void setup() {
        this.black = new BlackMan();
    }
    
    // Move Tests
    
    @Test
    public void testSouthWestSimpleMove() {
        assertEquals(4, black.southWestSimpleMove(0));
        assertEquals(18, black.southWestSimpleMove(15));
        assertEquals(25, black.southWestSimpleMove(22));
        assertEquals(-1, black.southWestSimpleMove(31));
    }
    
    @Test
    public void testSouthEastSimpleMove() {
        assertEquals(5, black.southEastSimpleMove(0));
        assertEquals(-1, black.southEastSimpleMove(3));
        assertEquals(13, black.southEastSimpleMove(8));
        assertEquals(9, black.southEastSimpleMove(5));
    }
    
    @Test
    public void testSouthWestJumpMove() {
        assertEquals(-1, black.southWestJumpMove(0));
        assertEquals(8, black.southWestJumpMove(1));
        assertEquals(17, black.southWestJumpMove(10));
        assertEquals(-1, black.southWestJumpMove(31));
    }
    
    @Test
    public void testSouthEastJumpMove() {
        assertEquals(9, black.southEastJumpMove(0));
        assertEquals(-1, black.southEastJumpMove(3));
        assertEquals(-1, black.southEastJumpMove(19));
        assertEquals(-1, black.southEastJumpMove(15));
        assertEquals(22, black.southEastJumpMove(13));
    }
}
