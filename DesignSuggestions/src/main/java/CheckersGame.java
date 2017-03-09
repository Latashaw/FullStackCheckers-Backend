/**
 * Created by latashawatson on 3/8/17.
 */
public class CheckersGame {
    private Board gameBoard;
    private Player player;
    private Computer computerPlayer;


    public CheckersGame(String guestName, Integer compNumber) {
        gameBoard = new Board();
        player = new Player(guestName);
        computerPlayer = new Computer(compNumber);
    }

    public void runCheckersGame() {
    }

    public void updateGameBoardState() {}

    public void divideGameBoardToEachPlayerPieces() {}

    public void countPiecesCatured() {}

    public void initiateKinging() {}

    public void checkForGameEnd() {}

    public void displayWinner() {}
}
