package stg.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stg.model.Board;

import java.util.Map;

/**
 * Created by prestonbattin on 3/7/17.
 */
@RestController
public class GameController {


    @RequestMapping(value = "/newGame", method = RequestMethod.GET, produces = {"application/json"})
    public Board newGame() {

        return new Board();
    }

    @RequestMapping(value = "/movePiece", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public Board movePiece(@RequestBody Board board){


        Map temp = board.getGameState();

        return board;
    }

//    @RequestMapping(value = "/checkMoves", method = RequestMethod.GET, consumes = {"application/json"})
//    public int[] checkMoves(@RequestBody int piece){
//
//    }
}
