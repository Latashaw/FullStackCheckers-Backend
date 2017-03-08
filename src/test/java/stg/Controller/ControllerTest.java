package stg.Controller;

import org.junit.Assert;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import stg.model.piece.Piece;

import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by ryan on 3/8/17.
 */
public class ControllerTest {
    private MockMvc gameController; 


    GameController controller;  



    public void setUp() { 
        this.gameController = standaloneSetup(new GameController()).build(); 
        controller = new GameController(); 
    }   

    public void newBoardTest() throws Exception { 
        // Logger logger = Logger.getLogger(ControllerTest.class) 
        MockHttpServletRequestBuilder newBoardQuery = get("/newGame").contentType(MediaType.APPLICATION_JSON);
             gameController.perform(newBoardQuery).andExpect(content().json("");
    }


    public void newBoardTestMethod() { 
//        Map map = controller.newGame();
//        Assert.assertEquals(32, map.size());
//         Piece piece = (Piece) map.get(1); 1
    }
}
