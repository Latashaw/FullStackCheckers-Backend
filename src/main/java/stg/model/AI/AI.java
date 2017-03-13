package stg.model.AI;

import stg.model.board.Board;
import stg.model.piece.*;

/**
 * Created by kevinmccann on 3/8/17.
 */
public class AI {
    static final int WIN = 500;
    static final int KING = 80;
    static final int PIECE = 30;
    static final int EDGE = 4;
    static final int BACK = 1;

    static public int evaluateBoardBlack(Board board) {
        return evaluateBoardPieceAmountsBlack(board) + evaluateBoardPiecePositionsBlack(board);
    }

    static public int evaluateBoardPieceAmountsWhite(Board board) {
        int positionScore = 0;
        for (Piece p : board.getBoard().values()) {
            if(p instanceof WhiteMan)
                positionScore += PIECE;
            if(p instanceof WhiteKing)
                positionScore += KING;
            if(board.checkGameFinished() && board.isWhiteWinner())
                positionScore += WIN;
            if(p instanceof BlackMan)
                positionScore -= PIECE;
            if(p instanceof BlackKing)
                positionScore -= KING;
            if(board.checkGameFinished() && board.isBlackWinner())
                positionScore -= WIN;
        }
        return positionScore;
    }

    static public int evaluateBoardPieceAmountsBlack(Board board) {
        int positionScore = 0;
        for (Piece p : board.getBoard().values()) {
            if(p instanceof WhiteMan)
                positionScore -= PIECE;
            if(p instanceof WhiteKing)
                positionScore -= KING;
            if(board.checkGameFinished() && board.isWhiteWinner())
                positionScore -= WIN;
            if(p instanceof BlackMan)
                positionScore += PIECE;
            if(p instanceof BlackKing)
                positionScore += KING;
            if(board.checkGameFinished() && board.isBlackWinner())
                positionScore += WIN;
        }
        return positionScore;
    }

    static public int evaluateBoardPiecePositionsBlack(Board board) {
        int positionScore = 0;
        for (int i = 1; i <= 32; i++) {
            if(board.getBoard().get(i) instanceof BlackMan || board.getBoard().get(i) instanceof BlackKing) {
                if (i % 8 - 4 == 0 || i % 8 - 5 == 0)
                    positionScore += EDGE;
                if (i <= 4)
                    positionScore += BACK;
            }
        }
        return positionScore;
    }

}
