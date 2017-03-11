package stg.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import stg.model.board.Board;
import stg.model.piece.Piece;

import java.io.IOException;
import java.util.Map;

/**
 * Created by ryan on 3/8/17.
 */
public class Deserialize extends JsonDeserializer<Board>  {

    @Override
    public Board deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        ObjectMapper mapper = (ObjectMapper) parser.getCodec();
        JsonNode node = mapper.readTree(parser);

        if (node.has("name") && (node.get("name").asText().equals("board"))) {
            return mapper.readValue(node.toString(), Board.class);
        } else {
            return null;
        }
    }

/*
    @Override
    public Board deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
        ObjectNode objectNode = parser.readValueAsTree();
        JsonNode wrappedNode = objectNode.get("board");
        JsonParser jsonParser = objectNode.traverse();
        jsonParser.setCodec(parser.getCodec());
        Board mappedBoard = parser.readValueAs(Board.class);
        return mappedBoard;
    }
    */
}
