package stg.model;

import stg.model.board.Board;

/**
 * Created by kevinmccann on 3/7/17.
 */
public class Game {

    Board gameState;


    public Game() {
        gameState = new Board();
    }

//  public int evaluateMove(Board board, int positionFrom, int positionTo) {
//        int moveScore = 0;
//        int difference = Math.abs(positionFrom - positionTo);
//        if(difference > 6)
//            moveScore += 3;
//
//    }

    public Board getPossibleBoardState(Board board, int possiblePositionFrom, int possiblePositionTo) {
        Board boardCopy = new Board();
        boardCopy.setBoard(board.getBoard());
        boardCopy.updateBoard(possiblePositionFrom, possiblePositionTo);
        return boardCopy;
    }

}