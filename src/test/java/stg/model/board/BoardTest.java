package stg.model.board;

import org.junit.Before;
import org.junit.Test;
import stg.model.piece.Piece;

/**
 * Created by rickjackson on 3/8/17.
 */
public class BoardTest {
    private Board board;
    
    @Before
    public void setup() {
        this.board = new Board();
    }
    
    @Test
    public void test() {
        System.out.println(board.getPositionFrom());
        board.setPositionFrom(10);
        
        System.out.println(
                board.getBoard().get(10).getPossibleMoves(board, 10)
                          );
        System.out.println(
                board.getBoard().get(board.getPositionFrom())
                     .getPossibleMoves(board, board.getPositionFrom())
                          );
        System.out.println(
                board.getMoves(board, 10)
                          );
        System.out.println(
                board.getBoard().get(10) instanceof Piece
                          );
    }
}
