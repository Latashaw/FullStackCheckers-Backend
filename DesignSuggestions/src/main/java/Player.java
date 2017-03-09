import java.util.HashMap;

/**
 * Created by latashawatson on 3/8/17.
 */
public class Player {
    private Object name;
    private int numberOfCapturedPieces = 0;
    private Piece[] playersBoardPieces;
    private HashMap<Integer, Space> playersPossibleMoves;

    public Player(Object name) {
        this.name = name;
    }

    public void calculateOnePiecesPossibleMoves(Piece piece) {
        analyzePlayerBoardPieces();
        determinePossibleMove();
    }

    public void analyzePlayerBoardPieces() {
    }

    public void determinePossibleMove() {
    }

}
