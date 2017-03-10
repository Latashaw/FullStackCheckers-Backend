package stg.model.board;

import stg.model.piece.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Board {
    HashMap<Integer, Piece> board = new HashMap<Integer, Piece>(32);
    int positionFrom, positionTo;
    int blackPieceCount; int whitePieceCount;
    boolean playerTurn;

    public Board() {
        for(int i = 1; i<=32; i++) {
            if(i<=12)
                board.put(i, new BlackMan());
            if(i>=13 && i<=21)
                board.put(i, new Empty());
            else
                board.put(i, new WhiteMan());
        }
        blackPieceCount = 12;
        whitePieceCount = 12;
        playerTurn = true;
    }

    public void setBoard(HashMap<Integer, Piece> board) {
        this.board = board;
    }

    public HashMap<Integer, Piece> getBoard() {
        return board;
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

    public int getBlackPieceCount() {
        return blackPieceCount;
    }

    public void setBlackPieceCount(int blackPieceCount) {
        this.blackPieceCount = blackPieceCount;
    }

    public int getWhitePieceCount() {
        return whitePieceCount;
    }

    public void setWhitePieceCount(int whitePieceCount) {
        this.whitePieceCount = whitePieceCount;
    }

    public boolean isPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }

    public Board doMove(Board board) {
        board.updateBoard(positionFrom, positionTo);
        return this;
    }

    public boolean checkPositionEmpty (int position) {
        return board.get(position) instanceof Empty;
    }

    public HashMap<Integer, Piece> updateBoard(int positionFrom, int positionTo) {
        board.replace(positionTo, board.get(positionTo), board.get(positionFrom));
        board.replace(positionFrom, new Empty());
        playerTurn = !playerTurn;
        return board;
    }

    public Board getPossibleBoardState(int possiblePositionFrom, int possiblePositionTo) {
        Board boardCopy = this.copy();
        boardCopy.updateBoard(possiblePositionFrom, possiblePositionTo);
        return boardCopy;
    }

    public HashMap<Integer, Piece> capturePiece(int position) {
        if(board.get(position) instanceof WhiteMan || board.get(position) instanceof WhiteKing)
            whitePieceCount--;
        if(board.get(position) instanceof BlackMan || board.get(position) instanceof BlackKing)
            blackPieceCount--;
        board.replace(position, new Empty());
        return board;
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

    public Board copy() {
        Board boardCopy = new Board();
        boardCopy.setBoard(getBoard());
        boardCopy.setBlackPieceCount(getBlackPieceCount());
        boardCopy.setWhitePieceCount(getWhitePieceCount());
        return boardCopy;
    }

    public List<Integer> getAllPossibleBlackMovers() {
        List<Integer> possibleMovers = new ArrayList<>();
        for (int i = 1; i<getBoard().size(); i++) {
            if (getBoard().get(i) instanceof BlackMan || getBoard().get(i) instanceof BlackKing) {
                if (!getBoard().get(i).getPossibleMoves(this, i).isEmpty())
                    possibleMovers.add(i);
            }
        }
        return possibleMovers;
    }

    public List<Integer> getAllPossibleWhiteMovers() {
        List<Integer> possibleMovers = new ArrayList<>();
        for (int i = 1; i<getBoard().size(); i++) {
            if (getBoard().get(i) instanceof WhiteMan || getBoard().get(i) instanceof WhiteKing) {
                if (!getBoard().get(i).getPossibleMoves(this, i).isEmpty())
                    possibleMovers.add(i);
            }
        }
        return possibleMovers;
    }
}
