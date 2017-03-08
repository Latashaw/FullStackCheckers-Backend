/**
 * Created by latashawatson on 3/8/17.
 */
public class CheckersGame {
    private Guest guestPlayer;
    private Computer computerPlayer;
    private Space[] theGameBoard = new Space[32];

    public CheckersGame() {
        guestPlayer = new Guest();
        computerPlayer = new Computer();
    }

    public void runCheckerGame() {
    }

    public void newGameBoard() {
        for (int i = 0; i < 11; i++) {
            theGameBoard[i] = new Space(new Piece("BLACK"));
        }
        for (int i = 12; i < 19; i++) {
            theGameBoard[i] = new Space("VACANT");
        }

        for (int i = 20; i < 31; i++) {
            theGameBoard[i] = new Space(new Piece("RED"));
        }
    }

    public void updateGameBoardState() {}

    public void divideGameBoardToEachPlayerPieces() {}

    public void countPiecesOffGameBoard() {}

    public void initiateKinging() {}

    public void checkForGameEnd() {}

    public void displayWinner() {}
}
