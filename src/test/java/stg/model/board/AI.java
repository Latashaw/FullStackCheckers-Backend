package stg.model.board;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prestonbattin on 3/13/17.
 */
//
public class AI {

    public MappedMoves getMoves() {
        return moves;
    }

    public void setMoves(MappedMoves moves) {
        this.moves = moves;
    }

    public Map<Integer, int[]> getMovesForward() {
        return movesForward;
    }

    public void setMovesForward(Map<Integer, int[]> movesForward) {
        this.movesForward = movesForward;
    }

    MappedMoves moves = new MappedMoves();
   public Map<Integer, int[]> movesForward = new HashMap<>();


    public AI(){

    mapMoves();

    }

    private void mapMoves(){
        movesForward.put(28, moves.twentyEight);
        movesForward.put(29, moves.twentyNine);
        movesForward.put(30, moves.thirty);
        movesForward.put(31, moves.thiertyOne);

        movesForward.put(24, moves.twentyFour);
        movesForward.put(25, moves.twentyFive);
        movesForward.put(26, moves.twentySix);
        movesForward.put(27, moves.twentySeven);

        movesForward.put(20, moves.twenty);
        movesForward.put(21, moves.twentyOne);
        movesForward.put(22, moves.twentyTwo);
        movesForward.put(23, moves.twentyThree);

        movesForward.put(16, moves.sixTeen);
        movesForward.put(17, moves.sevenTeen);
        movesForward.put(18, moves.eightTeen);
        movesForward.put(19, moves.nineTeen);

        movesForward.put(12, moves.twelve);
        movesForward.put(13, moves.thirTeen);
        movesForward.put(14, moves.fourTeen);
        movesForward.put(15, moves.fifTeen);

        movesForward.put(8, moves.eight);
        movesForward.put(9, moves.nine);
        movesForward.put(10, moves.ten);
        movesForward.put(11, moves.eleven);

        movesForward.put(4, moves.four);
        movesForward.put(5, moves.five);
        movesForward.put(6, moves.six);
        movesForward.put(7, moves.seven);
    }

   public int levelOneAIMove(Board board){
        return 0;
    }
}
