package stg.model.AI;

import stg.model.board.Board;
import java.util.LinkedList;
import java.util.List;

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

    public void create() {
        for(DecisionTreeNode node: children) {
            node.create();
        }

        if(children.isEmpty() && !board.isPlayerTurn()) {
            LinkedList<Board> possibleBoardStates;
            for(Integer i: board.getAllPossibleBlackMovers()) {
                List<Integer> positionTo = board.getBoard().get(i).getPossibleMoves(board, i);
                for(Integer j: positionTo) {
                    children.add(new DecisionTreeNode(board.getPossibleBoardState(i, j));
                }
            }
        }

        if(children.isEmpty() && board.isPlayerTurn()) {
            LinkedList<Board> possibleBoardStates;
            for(Integer i: board.getAllPossibleWhiteMovers()) {
                List<Integer> positionTo = board.getBoard().get(i).getPossibleMoves(board, i);
                for(Integer j: positionTo) {
                    children.add(new DecisionTreeNode(board.getPossibleBoardState(i, j));
                }
            }
        }
    }

    public int minimax() {
        if(children.isEmpty()) {
            return board.
        }
    }
}
