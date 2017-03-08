package stg.model;

import stg.model.piece.*;

import java.util.HashMap;

/**
 * Created by kevinmccann on 3/7/17.
 */
public class Game {

    Board gameState;
    int blackPieceCount; int whitePieceCount;

    public Game() {
        gameState = new Board();
        blackPieceCount = 12;
        whitePieceCount = 12;
    }

    public Board updateBoard(Board board, int positionFrom, int positionTo) {
        board.getGameState().replace(positionTo, board.getGameState().get(positionTo), gameState.getGameState().get(positionFrom));
        board.getGameState().replace(positionFrom, new Empty());
        return board;
        }

    public Board capturePiece(Board board, int position) {
        if(board.getGameState().get(position) instanceof WhiteMan || board.getGameState().get(position) instanceof WhiteKing)
            whitePieceCount--;
        if(board.getGameState().get(position) instanceof BlackMan || board.getGameState().get(position) instanceof BlackKing)
            blackPieceCount--;
        board.getGameState().replace(position, new Empty());
        return board;
        }

    public int evaluateMove(Board board, int positionFrom, int positionTo) {
        int moveScore = 0;
        int difference = Math.abs(positionFrom - positionTo);
        if(difference > 6)
            moveScore += 3;

    }
//
//    public int[] findAllMoveableBlackMen(Board board) {
//        int[] moveable = new int[];
//        int counter = 0;
//        for(int i = 1; i <= 32; i++) {
//            if (board.checkPosition(i))
//                continue;
//            BlackMan blackMan;
//            if (board.getGameState().get(i) instanceof BlackMan) {
//                blackMan = (BlackMan) board.getGameState().get(i);
//                if (blackMan.southEastJumpMove(i) != -1 || blackMan.southEastSimpleMove(i) != -1 || blackMan.southWestJumpMove(i) != -1 || blackMan.southWestSimpleMove(i) != -1) {
//                    moveable[counter] = i;
//                    counter++;
//                }
//            }
//        }
//        return moveable;
//    }
//
//    public int[] findAllMoveableWhiteMen(Board board) {
//        int[] moveable = new int[];
//        int counter = 0;
//        for(int i = 1; i <= 32; i++) {
//            if (board.checkPosition(i))
//                continue;
//            WhiteMan whiteMan;
//            if (board.getGameState().get(i) instanceof WhiteMan) {
//                whiteMan = (WhiteMan) board.getGameState().get(i);
//                if (board.checkPosition(whiteMan.northEastJumpMove(i)) || board.checkPosition(whiteMan.northEastSimpleMove(i))||
//                        board.checkPosition(whiteMan.northWestJumpMove(i))|| board.checkPosition(whiteMan.northWestSimpleMove(i))) {
//                    moveable[counter] = i;
//                    counter++;
//                }
//            }
//        }
//        return moveable;
//    }
}