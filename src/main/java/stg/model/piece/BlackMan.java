package stg.model.piece;

import stg.model.move.BlackMove;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rickjackson on 3/6/17.
 */
public class BlackMan implements Man, BlackMove {
    private List<Integer> possibleMoves;
    
    public BlackMan(int position) {
        this.possibleMoves = new ArrayList<>();
    }
    
    @Override
    public List<String> getPossibleMoves(Map board,
                                         int position) {
        StringBuilder sb = new StringBuilder();
        
        
    }
    
    public StringBuilder nextMove(Map board, int start,
                                  int move) {
        StringBuilder sb = new StringBuilder();
        
        if (move == -1) {
            return sb.append("");
        }
        return null;
    }
    
    
}
