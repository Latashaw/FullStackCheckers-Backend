package stg.model;

import stg.model.piece.*;

import java.util.HashMap;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Board {
    HashMap<Integer, Piece> gameState = new HashMap<Integer, Piece>(32);
    int positionFrom, positionTo;
    int blackPieceCount; int whitePieceCount;

    public Board() {
        for(int i = 1; i<=32; i++) {
            if(i<=12)
                gameState.put(i, new BlackMan());
            if(i>=13 && i<=21)
                gameState.put(i, new Empty());
            else
                gameState.put(i, new WhiteMan());
        }
        blackPieceCount = 12;
        whitePieceCount = 12;
    }

    public void setGameState(HashMap<Integer, Piece> gameState) {
        this.gameState = gameState;
    }

    public HashMap<Integer, Piece> getGameState() {
        return gameState;
    }

    public int getPositionFrom() {
        return positionFrom;
    }

    public void setPositionFrom(int positionFrom) {
        this.positionFrom = positionFrom;
    }

    public int getPositionTo() {
        return positionTo;
    }

    public void setPositionTo(int positionTo) {
        this.positionTo = positionTo;
    }


    public boolean checkPosition (int position) {
        return gameState.get(position) instanceof Empty;
    }

    public HashMap<Integer, Piece> updateBoard(int positionFrom, int positionTo) {
        gameState.replace(positionTo, gameState.get(positionTo), gameState.get(positionFrom));
        gameState.replace(positionFrom, new Empty());
        return gameState;
    }

    public HashMap<Integer, Piece> capturePiece(int position) {
        if(gameState.get(position) instanceof WhiteMan || gameState.get(position) instanceof WhiteKing)
            whitePieceCount--;
        if(gameState.get(position) instanceof BlackMan || gameState.get(position) instanceof BlackKing)
            blackPieceCount--;
        gameState.replace(position, new Empty());
        return gameState;
    }

    public boolean checkGameFinished() {
        return (blackPieceCount == 0 || whitePieceCount == 0);
    }

    public boolean isWhiteWinner() {
        return blackPieceCount == 0;
    }

    public boolean isBlackWinner() {
        return whitePieceCount == 0;
    }
}
