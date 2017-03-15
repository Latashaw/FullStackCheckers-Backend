package stg.model.board;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import stg.controller.Deserialize;
import stg.model.piece.*;
import stg.model.piece.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.List;

/**
 * Created by rickjackson on 3/6/17.
 */
@JsonDeserialize(using = Deserialize.class)
public class Board {
    Map<Integer, Piece> board = new HashMap<>(32);
    int positionTo;
    int positionFrom;
    int blackPieceCount;
    int whitePieceCount;
    boolean playerTurn;

    public Board(Map<Integer, Piece> board) {
        this.board = board;
    }

    public Board() {
        newBoardInit();
    }

    public void newBoardInit() {
        for (int i = 1; i <= 32; i++) {
            if (i <= 12) {
                board.put(i, new BlackMan());
            } else if (i >= 21) {
                board.put(i, new WhiteMan());
            } else {
                board.put(i, new Empty());
            }
        }
    }

    public void setBoard(Map<Integer, Piece> board) {
        this.board = board;
    }

    public Map<Integer, Piece> getBoard() {
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

    public boolean checkPositionEmpty(int position) {
        return board.get(position) instanceof Empty;
    }

    public Map<Integer, Piece> updateBoard(int positionFrom,
                                               int positionTo) {
        movePiece(positionFrom, positionTo);
        boardSpotToEmpty(positionFrom);
        playerTurn = !playerTurn;
        return board;
    }

    public Map<Integer, Piece> movePiece(int positionFrom, int positionTo) {
        board.replace(positionTo, board.get(positionTo), board.get(positionFrom));
        return board;
    }

    public Map<Integer, Piece> boardSpotToEmpty(int positionFrom) {
        board.replace(positionFrom, new Empty());
        return board;
    }

    public Piece getPieceAtSpot(int position) {
        return board.get(position);
    }

    public Board getPossibleBoardState(int possiblePositionFrom, int possiblePositionTo) {
        Board boardCopy = this.copy();
        boardCopy.updateBoard(possiblePositionFrom, possiblePositionTo);
        return boardCopy;
    }

    public Map<Integer, Piece> capturePiece(int position) {
        if (board.get(position) instanceof WhiteMan
            || board.get(position) instanceof WhiteKing)
            whitePieceCount--;
        if (board.get(position) instanceof BlackMan
            || board.get(position) instanceof BlackKing)
            blackPieceCount--;
        boardSpotToEmpty(position);
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
        boardCopy.setBoard(this.board);
        boardCopy.setBlackPieceCount(getBlackPieceCount());
        boardCopy.setWhitePieceCount(getWhitePieceCount());
        return boardCopy;
    }

    public static List<Integer> getPossibleMoves(Board board, int i) {
        Piece p = board.getBoard().get(i);
        return p.getPossibleMoves(board, i);
    }

    @Override
    public int hashCode() {
        return board.hashCode();
    }

    public boolean equals(Board obj) {
        return board.equals(obj.board);
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

    @Override
    public String toString() {
        return board.toString();
    }
}