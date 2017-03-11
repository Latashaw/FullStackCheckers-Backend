package stg.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import stg.model.board.Board;

import java.io.IOException;

/**
 * Created by ryan on 3/8/17.
 */
public class GetDeserializer {
    /*
    String json;

    public GetDeserializer(String json) {
        this.json = json;
    }

    public static Board jsonToBoard(String json) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Board board = mapper.readValue(json, Board.class);
            System.out.println(board);

            String str = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(board);
            System.out.println(str);
            return board;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
*/
}
