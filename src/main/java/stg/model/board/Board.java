package stg.model.board;

import stg.model.piece.BlackMan;
import stg.model.piece.Empty;
import stg.model.piece.Piece;
import stg.model.piece.WhiteMan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Board {
    Map<Integer, Piece> gameState = new HashMap<>();
    
    public void setGameState(HashMap<Integer, Piece> gameState) {
        this.gameState = gameState;
    }
    
    public Map<Integer, Piece> getGameState() {
        return gameState;
    }
    
    public Board() {
        for(int i = 1; i <= 32; i++) {
            if(i <= 12)
                gameState.put(i, new BlackMan());
            if(i >= 13 || i <= 21)
                gameState.put(i, new Empty());
            else
                gameState.put(i, new WhiteMan());
        }
    }
    
}