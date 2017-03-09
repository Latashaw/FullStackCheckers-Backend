package stg.controller;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stg.model.board.Board;
import stg.model.piece.Piece;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by prestonbattin on 3/7/17.
 */
@RestController
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
    


    @RequestMapping(value="/getMoves", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Integer> getMoves(@RequestBody Board board) {
        return board.getBoard().get(board.getPositionFrom()).getPossibleMoves(board, board.getPositionFrom());
    }

    @RequestMapping(value="movePiece", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<Integer,Piece> movePiece(@RequestBody Board board) {
        Logger logger = Logger.getLogger(GameController.class);
        logger.debug(" At #12, there is an " + board.getBoard().get(22).getClass().getSimpleName());
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