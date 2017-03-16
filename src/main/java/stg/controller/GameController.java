package stg.controller;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import stg.model.board.Board;
import stg.model.piece.Piece;

import java.util.List;
import java.util.Map;

/**
 * Created by prestonbattin on 3/7/17.
 */
@RestController
@RequestMapping(value="/")
public class GameController {
    
    @RequestMapping(value = "/newGame",
                    method = RequestMethod.GET,
                    produces = {"application/json"})
    public Board newGame() {
        // Board x = new Board();
        //  Logger logger = Logger.getLogger(GameController.class);
        //  logger.debug(x);
        return new Board();
    }
/*
    @CrossOrigin
    @RequestMapping(value = "/get", method = RequestMethod.POST,
    consumes = "application/json")
    public String getBoard(@RequestBody Board board) {

        Logger logger = Logger.getLogger(GameController.class);
            logger.debug(GetDeserializer.jsonToBoard(board));
            return "success";

    }

    */
/*
@CrossOrigin
@RequestMapping(value="/get", method = RequestMethod.POST, consumes = "application/json")
public void getBoard(@RequestBody Board board) {
    Logger logger = Logger.getLogger(GameController.class);
    logger.debug("Success. Board is:" + board);

}
*/

@CrossOrigin
@RequestMapping(value="/get", method = RequestMethod.POST, consumes="application/json", produces ="application/json")
public @ResponseBody List<Integer> getBoard(Board board) {
    Board copy = board;
    board.setPositionFrom(10);
    Logger logger = Logger.getLogger(GameController.class);
    logger.debug(copy.getAllMovesForPiece(copy.getPositionFrom()));
    return copy.getAllMovesForPiece(copy.getPositionFrom());
}
    


    @RequestMapping(value="/getMoves", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Integer> getMoves(@RequestBody Board board) {
        return board.getBoard().get(board.getPositionFrom()).getPossibleMoves(board, board.getPositionFrom());
    }

    @RequestMapping(value="movePiece", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<Integer,Piece> movePiece(@RequestBody Board board) {
       // Logger logger = Logger.getLogger(GameController.class);
        //logger.debug(" At #12, there is an " + board.getBoard().get(22).getClass().getSimpleName());
        return board.getBoard();
    }


    @RequestMapping(value = "/checkMoves",
                    method = RequestMethod.POST,
                    consumes = {"application/json"},
                    produces = {"application/json"})
    public String test(@RequestBody Board board) {
        
        //        Board tempbpard = board;
        //       int temp = board.getPositionFrom();
        //      return  board.getBoard().get(temp).getPossibleMoves(tempbpard,temp);
        
        return board.getBoard().get(1).getClass().getSimpleName();
    }
}