/**
 * Created by latashawatson on 3/8/17.
 */
public class Board {

    //This board object will be passed so that front end can get clicked & possibleMoves easily; and so that front end gets board layout
    private Space possibleMoves;
    private Space clicked;
    private Space[] gameBoardState = new Space[32];

    public Board() {
        for (int i = 0; i < 11; i++) {
            gameBoardState[i] = new Space(new Piece("BLACK"));
        }
        for (int i = 12; i < 19; i++) {
            gameBoardState[i] = new Space("EMPTY");
        }

        for (int i = 20; i < 31; i++) {
            gameBoardState[i] = new Space(new Piece("RED"));
        }
    }
    //Used to get possibleMoves from backend to front end
    public Space getPossibleMoves() {
        return possibleMoves;
    }

    public void setPossibleMoves(Space possibleMoves) {
        this.possibleMoves = possibleMoves;
    }

    public Space getClicked() {
        return clicked;
    }
    //For front end to use in order to set the Guest player clicked piece for back end
    public void setClicked(Space clicked) {
        this.clicked = clicked;
    }
    //Used to retrieve gameBoardState from backend to front end
    public Space[] getGameBoardState() {
        return gameBoardState;
    }
    //This method could set the gameBoardState to the "updated" version that reflects front end changes
    public void setGameBoardState(Space[] gameBoardState) {
        this.gameBoardState = gameBoardState;
    }
}
