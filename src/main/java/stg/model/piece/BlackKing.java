//package stg.model.piece;
//
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import stg.model.board.Board;
//import stg.model.move.WhiteMove;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by rickjackson on 3/6/17.
// */
//@JsonDeserialize(as = BlackKing.class)
//public class BlackKing extends BlackMan implements King, WhiteMove {
//    private int position;
//    private List<Integer> additionalMoves;
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    final private String name = "BLACK_KING";
//
//    public BlackKing() {
//
//    }
//
//    public BlackKing(int position) {
//        this.position = position;
//    }
//
//    void setAdditionalMoves(Board b, int i) {
//        int nw = northWestSimpleMove(i);
//        int ne = northEastSimpleMove(i);
//
//        if (!isValidMove(b, nw)) {
//            if (isValidMove(b, northWestJumpMove(i))) {
//                nw = northWestJumpMove(i);
//            } else {
//                nw = -1;
//            }
//        }
//        if (!isValidMove(b, ne)) {
//            if (isValidMove(b, northEastJumpMove(i))) {
//                ne = northEastJumpMove(i);
//            } else {
//                ne = -1;
//            }
//        }
//
//        if (nw == -1) {
//            if (ne == -1) {
//                additionalMoves = new ArrayList<>(0);
//            } else {
//                additionalMoves = new ArrayList<>(1);
//                additionalMoves.add(ne);
//            }
//        } else {
//            if (ne == -1) {
//                additionalMoves = new ArrayList<>(1);
//                additionalMoves.add(nw);
//            } else {
//                additionalMoves = new ArrayList<>(2);
//                additionalMoves.add(nw);
//                additionalMoves.add(ne);
//            }
//        }
//    }
//
//    @Override
//    public List<Integer> getPossibleMoves(Board board, int position) {
//        this.setPossibleMoves(board, position);
//        this.setAdditionalMoves(board, position);
//        this.addAdditionalMoves(additionalMoves);
//        return this.possibleMoves;
//    }
//}
