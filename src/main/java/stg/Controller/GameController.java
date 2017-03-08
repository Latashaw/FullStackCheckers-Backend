package stg.Controller;

import org.springframework.web.bind.annotation.*;
import stg.model.Board;
import stg.model.piece.WhiteMan;

import java.util.Map;

/**
 * Created by prestonbattin on 3/7/17.
 */
@RestController
public class GameController {

    Board gameBoard = new Board();


    @RequestMapping(value = "/newGame", method = RequestMethod.GET, produces = {"application/json"})
    public Map newGame() {
        // Can we have it to set the game state for the new Board, and return that?
        return new Board().getGameState();
    }

    // Grabs current board state. May/may not be necessary.
    @RequestMapping(value="getMap", method = RequestMethod.POST, produces = "application/json")
    public Map getBoard(@RequestBody Map board) {

        for(int i = 0; i < board.size(); i++) {
            if (board.get(i+1).equals(gameBoard.getGameState().get(i+1))) {
            } else {
                board.put(i+1, gameBoard.getGameState().get(i+1));
            }
        }
        return board;
    }

    @RequestMapping(value = "/movePiece", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public Map movePiece(@RequestBody Map board){

        board.put(1, new WhiteMan());
        return board;
    }

//    @RequestMapping(value = "/checkMoves", method = RequestMethod.GET, consumes = {"application/json"})
//    public int[] checkMoves(@RequestBody int piece){
//
//    }
}
