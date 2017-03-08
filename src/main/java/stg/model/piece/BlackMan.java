package stg.model.piece;

import stg.model.Color;
import stg.model.move.BlackMove;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rickjackson on 3/6/17.
 */
public class BlackMan implements Man, BlackMove {
   public final String type = this.getSimpleName();

    public String getType() {
        return type;
    }

    private String getSimpleName(){

        return "BlackMan";
    }

    String name = "BlackMan";
    private List<Integer> possibleMoves;

    public BlackMan() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BlackMan(int position) {
        this.possibleMoves = new ArrayList<>();
    }

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
