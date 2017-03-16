package stg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import stg.model.board.Board;



/**
 * Created by prestonbattin on 3/12/17.
 */

@Controller
@CrossOrigin
public class CheckersGameController {

    @RequestMapping(value = "/save", method = RequestMethod.PUT, consumes = {"application/json"})
    @ResponseBody public String create(@RequestBody Board board){

            try{

                CheckersEntity updateSave = checkersDOA.findByid(1);
                updateSave.setBoard(board.getBoard());
                updateSave.setBlackPieceCount(board.getBlackPieceCount());
                updateSave.setWhitePieceCount(board.getWhitePieceCount());
                checkersDOA.save(updateSave);

            }
            catch (Exception e){
                 CheckersEntity c = new CheckersEntity(board.getBoard(), board.getPositionTo(), board.getPositionFrom(), board.getBlackPieceCount(), board.getWhitePieceCount());
                 checkersDOA.save(c);
                 return "New Game Saved.";
            }
            return "Game saved!";
        }

        @RequestMapping(value =  "/load", method = RequestMethod.GET)
        @ResponseBody public CheckersEntity load(){

        try{
            CheckersEntity checkersEntity = checkersDOA.findByid(1);
            return checkersEntity;
        }
        catch(Exception e){
            System.out.println("No game found");
            return null;
        }
        }
        @Autowired
        private CheckersDOA checkersDOA;
    }



