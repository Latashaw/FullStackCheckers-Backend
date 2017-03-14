//package stg.model.piece;
//
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import stg.model.board.Board;
//import stg.model.move.BlackMove;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by rickjackson on 3/6/17.
// */
//@JsonDeserialize(as = BlackMan.class)
//public class BlackMan implements Man, BlackMove {
//    List<Integer> possibleMoves;
//    final private String name = "BLACK_MAN";
//
//    public String getName() {
//        return name;
//    }
//
//    public BlackMan() {
//
//    }
//
//    public BlackMan(int position) {
//        this.possibleMoves = new ArrayList<>();
//    }
//
//    void setPossibleMoves(Board b, int i) {
//        int sw = southWestSimpleMove(i);
//        int se = southEastSimpleMove(i);
//
//        if (!isValidMove(b, sw)) {
//            if (isValidMove(b, southWestJumpMove(i))) {
//                sw = southWestJumpMove(i);
//            } else {
//                sw = -1;
//            }
//        }
//        if (!isValidMove(b, se)) {
//            if (isValidMove(b, southEastJumpMove(i))) {
//                se = southEastJumpMove(i);
//            } else {
//                se = -1;
//            }
//        }
//
//        if (sw == -1) {
//            if (se == -1) {
//                possibleMoves = new ArrayList<>(0);
//            } else {
//                possibleMoves = new ArrayList<>(1);
//                possibleMoves.add(se);
//            }
//        } else {
//            if (se == -1) {
//                possibleMoves = new ArrayList<>(1);
//                possibleMoves.add(sw);
//            } else {
//                possibleMoves = new ArrayList<>(2);
//                possibleMoves.add(sw);
//                possibleMoves.add(se);
//            }
//        }
//    }
//
//    void addAdditionalMoves(List moves) {
//        possibleMoves.addAll(moves);
//    }
//
//    public List<Integer> getPossibleMoves(Board board, int position) {
//        this.setPossibleMoves(board, position);
//        return possibleMoves;
//    }
//
////    boolean isValidMove(Board b, int to) {
////        if (to <= 1 && to >= 32) {
////            return false;
////        }
////        Object o = b.getBoard().get(to);
////
////        if (o instanceof BlackMan) {
////            return false;
////        }
////        return o instanceof Empty;
////    }
//}
