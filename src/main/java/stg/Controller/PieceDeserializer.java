package stg.Controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.ir.ObjectNode;
import stg.model.piece.*;

import java.io.IOException;

/**
 * Created by prestonbattin on 3/8/17.
 */
public class PieceDeserializer extends JsonDeserializer<Piece> {

    @Override
    public Piece deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {

        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        ObjectNode root = mapper.readTree(p);
        if(root.equals(BlackMan.class))
        return mapper.readValue(root.toString(), BlackMan.class);
        else if (root.equals(BlackKing.class))
            return mapper.readValue(root.toString(), BlackKing.class);
        else if (root.equals(WhiteMan.class))
            return mapper.readValue(root.toString(), WhiteMan.class);
        else if (root.equals(WhiteKing.class))
            return mapper.readValue(root.toString(), WhiteKing.class);
        else return mapper.readValue(root.toString(), Piece.class);
    }



}

