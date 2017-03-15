package stg.model.AI;

import stg.model.board.Board;

/**
 * Created by kevinmccann on 3/15/17.
 */
public class SimpleAI {

    static public Board getNewBoardIntermediate(Board board) {
        int blackMover = board.getAllPossibleBlackMovers().get(0);
        int positionTo = board.getBoard().get(blackMover).getPossibleMoves(board, blackMover).get(0);
        return board.getPossibleBoardState(blackMover, positionTo);
    }

    static public Board getNewBoardSimple(Board board) {
        int numberOfPossibleMovers = board.getAllPossibleBlackMovers().size();
        int blackMover = board.getAllPossibleBlackMovers().get((int)Math.floor(Math.random() * numberOfPossibleMovers));
        int numberOfPossibleMoves = board.getBoard().get(blackMover).getPossibleMoves(board, blackMover).size();
        int positionTo = board.getBoard().get(blackMover).getPossibleMoves(board, blackMover).get((int)Math.floor(Math.random() * numberOfPossibleMoves));
        return board.getPossibleBoardState(blackMover, positionTo);
    }
}
