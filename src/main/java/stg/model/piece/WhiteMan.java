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
//@SuppressWarnings("Duplicates")
//@JsonDeserialize(as = WhiteMan.class)
//public class WhiteMan implements Man, WhiteMove {
//    private int position;
//    final private String name = "WHITE_MAN";
//
//    public String getName() {
//        return name;
//    }
//
//    List<Integer> possibleMoves;
//
//   public WhiteMan() {
//
//    }
//
//    public WhiteMan(int position) {
//        this.position = position;
//    }
//
////    void setPossibleMoves(Board b, int i) {
////        int nw = northWestSimpleMove(i);
////        int ne = northEastSimpleMove(i);
////
////        if (!isValidMove(b, nw)) {
////            if (isValidMove(b, northWestJumpMove(i))) {
////                nw = northWestJumpMove(i);
////            } else {
////                nw = -1;
////            }
////        }
////        if (!isValidMove(b, ne)) {
////            if (isValidMove(b, northEastJumpMove(i))) {
////                ne = northEastJumpMove(i);
////            } else {
////                ne = -1;
////            }
////        }
////
////        if (nw == -1) {
////            if (ne == -1) {
////                possibleMoves = new ArrayList<>(0);
////            } else {
////                possibleMoves = new ArrayList<>(1);
////                possibleMoves.add(ne);
////            }
////        } else {
////            if (ne == -1) {
////                possibleMoves = new ArrayList<>(1);
////                possibleMoves.add(nw);
////            } else {
////                possibleMoves = new ArrayList<>(2);
////                possibleMoves.add(nw);
////                possibleMoves.add(ne);
////            }
////        }
////    }
//
////    void addAdditionalMoves(List moves) {
////        possibleMoves.addAll(moves);
////    }
//
////    public List<Integer> getPossibleMoves(Board board, int position) {
////        this.setPossibleMoves(board, position);
////        return possibleMoves;
//    }
//
////    boolean isValidMove(Board b, int to) {
////        if (to <= 1 && to >= 32) {
////            return false;
////        }
////        Object o = b.getBoard().get(to);
////
////        if (o instanceof WhiteMan) {
////            return false;
////        }
////        return o instanceof Empty;
////    }
//
