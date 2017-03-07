package stg.model;

import stg.model.piece.Empty;
import stg.model.piece.Piece;

import java.util.HashMap;

/**
 * Created by kevinmccann on 3/7/17.
 */
public class Game {

    public Game() {
        Board gameState = new Board();
    }

    public HashMap<Integer, Piece> updateBoard(HashMap<Integer, Piece> gameState, int positionFrom, int positionTo) {
        gameState.replace(positionTo, gameState.get(positionTo), gameState.get(positionFrom));
        gameState.replace(positionFrom, new Empty());
        return gameState;
        }

    public HashMap<Integer, Piece> capturePiece(HashMap<Integer, Piece> gameState, int position) {
        gameState.replace(position, new Empty());
        return gameState;
        }


}