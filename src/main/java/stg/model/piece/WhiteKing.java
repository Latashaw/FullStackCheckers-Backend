package stg.model.piece;

import stg.model.board.Board;
import stg.model.move.BlackMove;
import stg.model.move.WhiteMove;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 3/6/17.
 */
public class WhiteKing extends WhiteMan implements King, BlackMove {
public class WhiteKing implements King, WhiteMove, BlackMove {

    String name = "WhiteKing";
    private int position;
    private List<Integer> additionalMoves;

    public WhiteKing() {

    }

    WhiteKing() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhiteKing(int position) {
        this.position = position;
    }

    void setAdditionalMoves(Board b, int i) {
        int sw = southWestSimpleMove(i);
        int se = southEastSimpleMove(i);

        if (!isValidMove(b, sw)) {
            if (isValidMove(b, southWestJumpMove(i))) {
                sw = southWestJumpMove(i);
            } else {
                sw = -1;
            }
        }
        if (!isValidMove(b, se)) {
            if (isValidMove(b, southEastJumpMove(i))) {
                se = southEastJumpMove(i);
            } else {
                se = -1;
            }
        }

        if (sw == -1) {
            if (se == -1) {
                additionalMoves = new ArrayList<>(0);
            } else {
                additionalMoves = new ArrayList<>(1);
                additionalMoves.add(se);
            }
        } else {
            if (se == -1) {
                additionalMoves = new ArrayList<>(1);
                additionalMoves.add(sw);
            } else {
                additionalMoves = new ArrayList<>(2);
                additionalMoves.add(sw);
                additionalMoves.add(se);
            }
        }
    }

    @Override
    public List<Integer> getPossibleMoves(Board board, int position) {
        this.setPossibleMoves(board, position);
        this.setAdditionalMoves(board, position);
        this.addAdditionalMoves(additionalMoves);
        return this.possibleMoves;
    }
}
