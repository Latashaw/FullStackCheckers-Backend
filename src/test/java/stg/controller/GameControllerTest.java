package stg.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import stg.model.board.Board;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
/**
 * Created by ryan on 3/8/17.
 */
public class GameControllerTest {

    private MockMvc gameController;

    GameController controller;

    @Before
    public void setUp() {
        this.gameController = standaloneSetup(new GameController()).build();
    }


    @Test
    public void newBoardTestEndToEnd() throws Exception {
        MockHttpServletRequestBuilder newBoardQuery = get("/newGame").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        //  gameController.perform(newBoardQuery).andExpect(content().json("{ 'board': '{ '1': '{ 'name': 'BlackMan'}', '2': '{ 'name': 'BlackMan'}', '3': '{ 'name': 'BlackMan'}', '4': '{ 'name': 'BlackMan'}', '5': '{ 'name': 'BlackMan'}', '6': '{ 'name': 'BlackMan'}', '7': '{ 'name': 'BlackMan'}', '8': '{ 'name': 'BlackMan'}', '9': '{ 'name': 'BlackMan'}', '10': '{ 'name': 'BlackMan'}', '11': '{ 'name': 'BlackMan'}', '12': '{ 'name': 'BlackMan'}', '13': '{ 'name': 'Empty'}', '14': '{ 'name': 'Empty'}', '15': '{ 'name': 'Empty'}', '16': '{ 'name': 'Empty'}', '17': '{ 'name': 'Empty'}', '18': '{ 'name': 'Empty'}', '19': '{ 'name': 'Empty'}', '20': '{ 'name': 'Empty'}', '21': '{ 'name': 'WhiteMan'}', '22': '{ 'name': 'WhiteMan'}', '23': '{ 'name': 'WhiteMan'}', '24': '{ 'name': 'WhiteMan'}', '25': '{ 'name': 'WhiteMan'}', '26': '{ 'name': 'WhiteMan'}', '27': '{ 'name': 'WhiteMan'}', '28': '{ 'name': 'WhiteMan'}', '29': '{ 'name': 'WhiteMan'}', '30': '{ 'name': 'WhiteMan'}', '31': '{ 'name': 'WhiteMan'}', '32': '{ 'name': 'WhiteMan'}' }','positionTo': 10, 'positionFrom': 10, 'blackPieceCount': 12, 'whitePieceCount': 12, 'whiteWinner': false, 'blackWinner': false}"));
       // gameController.perform(newBoardQuery).andExpect(content().json("{'board': '{ '1':'{}', '2':'{}', '3':'{}', '4':'{}', '5':'{}', '6':'{'}', '7':'{}', '8':'{}', '9':'{}', '10':'{}', '11':'{}', '12':'{}', '13':'{}', '14':'{}', '15':'{}', '16':'{}', '17':'{}', '18':'{}', '19':'{}', '20':'{}', '21':'{}', '22':'{}', '23':'{}', '24':'{}', '25':'{}', '26':'{}', '27':'{}', '28':'{}', '29':'{}', '30':'{}', '31':'{}', '32':'{}' }', 'positionTo': 10, 'positionFrom':10, 'blackPieceCount':0, 'whitePieceCount':0 }' }"));
        gameController.perform(newBoardQuery).andExpect(content().json("{'board': { '1':'{}', '2':'{}', '3':'{}', '4':'{}', '5':'{}', '6':'{}', '7':'{}', '8':'{}', '9':'{}', '10':'{}', '11':'{}', '12':'{}', '13':'{}', '14':'{}', '15':'{}', '16':'{}', '17':'{}', '18':'{}', '19':'{}', '20':'{}', '21':'{}', '22':'{}', '23':'{}', '24':'{}', '25':'{}', '26':'{}', '27':'{}', '28':'{}', '29':'{}', '30':'{}', '31':'{}', '32':'{}' }, 'positionTo': 10, 'positionFrom':10, 'blackPieceCount':12, 'whitePieceCount':12 } }"));
    }


    @Test
    public void newBoardTestMethod() {
        Board board = controller.newGame();
        Assert.assertEquals(32, board.getBoard().size());
    }


}

