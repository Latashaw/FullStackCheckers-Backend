package stg.model.piece;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

/**
 * Created by rickjackson on 3/8/17.
 */
public class PieceDeserializer extends JsonDeserializer<Piece> {
    
    @Override
    public Piece deserialize(JsonParser jp, DeserializationContext ctx)
            throws IOException {
        ObjectMapper om = (ObjectMapper) jp.getCodec();
        ObjectNode node = om.readTree(jp);
        
        if (node.has("name") && node.get("name")
                                    .asText()
                                    .equals("WhiteMan")) {
            return om.readValue(node.toString(), WhiteMan.class);
        } else if (node.has("name") && node.get("name")
                                           .asText().equals("WhiteKing")) {
            return om.readValue(node.toString(), WhiteKing.class);
        } else if (node.has("name") && node.get("name")
                                           .asText().equals("BlackMan")) {
            return om.readValue(node.toString(), BlackMan.class);
        } else if (node.has("name") && node.get("name")
                                           .asText().equals("BlackKing")) {
            return om.readValue(node.toString(), BlackKing.class);
        } else {
            return om.readValue(node.toString(), Empty.class);
        }
    }
}
