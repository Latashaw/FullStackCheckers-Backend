package stg.Controller;

import org.springframework.web.bind.annotation.*;
import stg.model.board.Board;
import stg.model.piece.BlackKing;

import java.util.List;

/**
 * Created by prestonbattin on 3/7/17.
 */
@RestController
@CrossOrigin
public class GameController {


    @RequestMapping(value = "/newGame", method = RequestMethod.GET, produces = {"application/json"})
    public Board newGame() {

        return new Board();
    }


    @RequestMapping(value = "/movePiece", method = RequestMethod.POST, consumes =  {"application/json"}, produces = {"application/json"})
    public Board movePiece(@RequestBody Board board){

        board.getBoard().put(1, new BlackKing());
        return board;
    }

    @RequestMapping(value = "/checkMoves", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public List<Integer> test(@RequestBody Board board){


       return Board.getMoves(board, board.getPositionFrom());


        
    }



}
