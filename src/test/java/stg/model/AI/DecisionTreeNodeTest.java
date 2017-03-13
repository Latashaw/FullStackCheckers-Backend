package stg.model.AI;

import org.junit.Before;
import org.junit.Test;
import stg.model.board.Board;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 3/13/17.
 */
public class DecisionTreeNodeTest {
    Board board;
    DecisionTreeNode testNode;

    @Before
    public void setUp() {
        board = new Board();
        testNode = new DecisionTreeNode(board);
    }


    @Test
    public void createTest() {
        testNode.create();
        for(DecisionTreeNode dtn : testNode.children) {
            System.out.println(dtn.board.toString());
//            assertEquals(7,testNode.children.size());
        }
    }

    @Test
    public void bestBoardPositionTest() {

    }

    @Test
    public void getBestMoveTest() {

    }

}