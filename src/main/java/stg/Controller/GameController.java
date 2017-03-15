package stg.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import stg.model.board.Board;

/**
 * Created by prestonbattin on 3/7/17.
 */
@RestController
@CrossOrigin
public class GameController {


    @RequestMapping(value = "/clearMoves", method = RequestMethod.POST, produces = {"application/json"})
    public Board clearMoves(@RequestBody Board board){
        board.clearMoves();
        return board;
    }

    @RequestMapping(value = "/newGame", method = RequestMethod.GET, produces = {"application/json"})
    public Board newGame() {

        return new Board();
    }


    @RequestMapping(value = "/movePiece", method = RequestMethod.POST, consumes = {"application/json"}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Board movePiece(@RequestBody Board board){

        board.movePiece();

        return board;
    }

    @RequestMapping(value = "/checkMoves", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public Board checkPossibleMoves(@RequestBody Board board){
        board.clearMoves();
        board.checkPossibleMoves();

       return board;


        
    }



}
