package stg.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stg.model.board.Board;

/**
 * Created by prestonbattin on 3/7/17.
 */
@RestController
public class GameController {

    @RequestMapping(value = "/newgame", method = RequestMethod.GET)
    public Board newGame(){
        return new Board();
    }


}
