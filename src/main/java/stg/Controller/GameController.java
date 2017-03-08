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


    @RequestMapping(value = "/newGame", method = RequestMethod.GET, produces = {"application/json"})
    public Map newGame() {

        return new Board().getGameState();
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
