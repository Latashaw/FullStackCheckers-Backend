package stg.model.AI;

import stg.model.board.Board;
import java.util.LinkedList;

/**
 * Created by kevinmccann on 3/8/17.
 */
public class DecisionTreeNode {
    public LinkedList<DecisionTreeNode> children;
    public Board board;

    public DecisionTreeNode(Board board) {
        children = new LinkedList<>();
        this.board = board;
    }

    public void create(){
        for(DecisionTreeNode node: children) {
            node.create();
        }

        if(children.isEmpty()) {
            LinkedList<Board> possibleBoardStates;
            board.getAllPossibleBlackMovers();
            for(Board board: possibleBoardStates) {
                children.add(new DecisionTreeNode(board));
            }
        }
    }
}
