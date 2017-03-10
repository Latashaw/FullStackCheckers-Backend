package stg.model.board;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import stg.controller.Deserialize;
import stg.model.piece.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Board(Map<Integer, Piece> board) {
        this.board = board;
    }

    public Board() {
        for (int i = 1; i <= 32; i++) {
            if (i <= 12) {
                board.put(i, new BlackMan());
            } else if (i >= 21) {
                board.put(i, new WhiteMan());
            } else {
                board.put(i, new Empty());
            }
        }
        blackPieceCount = 12;
        whitePieceCount = 12;
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
    
    public boolean checkPositionEmpty(int position) {
        return board.get(position) instanceof Empty;
    }
    
    public Map<Integer, Piece> updateBoard(int positionFrom,
                                               int positionTo) {
        movePiece(positionFrom, positionTo);
        boardSpotToEmpty(positionFrom);
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
    
    public Board getPossibleBoardState(int possiblePositionFrom,
                                       int possiblePositionTo) {
        Board boardCopy = this.copy();
        boardCopy.updateBoard(possiblePositionFrom, possiblePositionTo);
        return boardCopy;
    }
    
    public Board getPossibleBoardState(Board board,
                                       int possiblePositionFrom,
                                       int possiblePositionTo) {
        Board boardCopy = new Board();
        boardCopy.setBoard(this.board);
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
        boardCopy.setBoard(this.board);
        boardCopy.setBlackPieceCount(getBlackPieceCount());
        boardCopy.setWhitePieceCount(getWhitePieceCount());
        return boardCopy;
    }
    
    public static List<Integer> getMoves(Board board, int i) {
        Piece p = board.getBoard().get(i);
        return p.getPossibleMoves(board, i);
    }
    
    
}