package stg.model;

import stg.model.piece.BlackMan;
import stg.model.piece.Empty;
import stg.model.piece.Piece;

import java.util.HashMap;

/**
 * Created by kevinmccann on 3/7/17.
 */
public class Game {

    Board gameState;

    public Game() {
        gameState = new Board();
    }

    public Board updateBoard(Board board, int positionFrom, int positionTo) {
        board.getGameState().replace(positionTo, board.getGameState().get(positionTo), gameState.getGameState().get(positionFrom));
        board.getGameState().replace(positionFrom, new Empty());
        return board;
        }

    public Board capturePiece(Board board, int position) {
        board.getGameState().replace(position, new Empty());
        return board;
        }

    public void findAllMoveablePieces(Board board) {
        for(int i = 1; i <= 32; i++) {
            if(board.checkPosition(i))
                continue;
            BlackMan blackMan;
            if(board.getGameState().get(i) instanceof BlackMan)
                blackMan = (BlackMan) board.getGameState().get(i);
        }
    }
}