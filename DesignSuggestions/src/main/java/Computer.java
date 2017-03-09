import java.util.HashMap;

/**
 * Created by latashawatson on 3/8/17.
 */
public class Computer extends Player {
    private Integer gameNumber;
    private int numberOfCapturedPieces = 0;
    private Piece[] playersBoardPieces;
    private HashMap<Integer, Space> playersPossibleMoves;

    public Computer(Integer gameNumber){
        super(gameNumber);
    }

    public void calculateAllPiecesPossibleMoves() {
        for (int i = 0; i < playersBoardPieces.length; i++) {
            //playerPossibleMoves = calculateOnePiecesPossibleMoves(playersBoardPieces[i]);
        }
        //More logic to fine tune all possible moves
    }

    //This will be the AI functionality
    public void chooseNextMove() {
    }
}
