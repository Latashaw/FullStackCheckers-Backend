package stg.model.AI;

import stg.model.board.Board;

/**
 * Created by kevinmccann on 3/15/17.
 */
public class SimpleAI {

    static public Board getNewBoard(Board board) {
        int blackMover = board.getAllPossibleBlackMovers().get(0);
        int positionTo = board.getBoard().get(blackMover).getPossibleMoves(board, blackMover).get(0);
        return board.getPossibleBoardState(blackMover, positionTo);
    }
}
