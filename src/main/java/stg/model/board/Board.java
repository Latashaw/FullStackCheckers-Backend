package stg.model.board;

/**
 * Created by rickjackson on 3/6/17.
 */
public class Board {
   private int[] board = new int[32];
    private int positionTo;
    private int positionFrom;
   private int blackPieceCount;
   private int whitePieceCount;
   private int id = 1;


  public   Board(){
      for(int i = 0; i < 32; i++){
          if(i <12)
              board[i] = 1;
          if(i > 12 && i <= 19)
              board[i] = 0;
          if(i >= 20)
              board[i] = -1;
      }
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getBoard() {
        return board;
    }

    public void checkPossibleMoves(){

      if(positionFrom == 0){
          if(board[4] == 0)
              board[4] = -3;
          if(board[5] == 0){
              board[5] = -3;
          }
      }

      else if(positionFrom == 1){
          if(board[5] == 0)
              board[5] = -3;
          if(board[6] ==0)
              board[6] = -3;
      }

      else if(positionFrom == 2){
          if(board[6] == 0)
              board[6] = -3;
          if(board[7] ==0)
              board[7] = -3;
      }

      else if(positionFrom == 3){
          if(board[7] == 0)
              board[7] = -3;
      }

      else if(positionFrom == 4){
          if(board[8] == 0)
              board[8] = -3;
      }

      else if(positionFrom == 5){
          if(board[8] == 0)
              board[8] = -3;
          if(board[9] ==0)
              board[9] = -3;
      }

      else if(positionFrom == 6){
          if(board[9] == 0)
              board[9] = -3;
          if(board[10] ==0)
              board[10] = -3;
      }
      else if(positionFrom == 7){
          if(board[11] == 0)
              board[11] = -3;
          if(board[10] ==0)
              board[10] = -3;
      }

     else if(positionFrom == 8){
          if(board[12] == 0)
          board[12] = -3;
          if(board[13] ==0)
          board[13] = -3;
      }
      else if(positionFrom == 9){
         if(board[13] ==0)
          board[13] = -3;
         if(board[14] == 0)
          board[14] = -3;
      }

      else if(positionFrom == 10){
          if(board[14] == 0)
              board[14] = -3;
          if(board[15] ==0)
              board[15] = -3;
      }

      else if(positionFrom == 11){
          if(board[15] == 0)
              board[15] = -3;
      }


    }

    public void resetToAndFrom(){
        this.positionFrom = 0;
        this.positionTo = 0;
    }

    public void clearMoves(){

        for(int i = 0; i < 32; i++){
            if(board[i] == -3)
                board[i] = 0;
        }
    }

    public void movePiece(){
        clearMoves();
        board[positionTo] = board[positionFrom];
        board[positionFrom] = 0;
        resetToAndFrom();

    }

    public void setBoard(int[] board) {
        this.board = board;
    }

    public int getPositionTo() {
        return positionTo;
    }

    public void setPositionTo(int positionTo) {
        this.positionTo = positionTo;
    }

    public int getPositionFrom() {
        return positionFrom;
    }

    public void setPositionFrom(int positionFrom) {
        this.positionFrom = positionFrom;
    }

    public int getBlackPieceCount() {
        return blackPieceCount;
    }

    public void setBlackPieceCount(int blackPieceCount) {
        this.blackPieceCount = blackPieceCount;
    }

    public int getWhitePieceCount() {
        return whitePieceCount;
    }

    public void setWhitePieceCount(int whitePieceCount) {
        this.whitePieceCount = whitePieceCount;
    }

    //
//    public Board() {
//
//        blackPieceCount = 12;
//        whitePieceCount = 12;
//        startGame();
//    }
//
//    public Board(Board b){
//        blackPieceCount = 12;
//        whitePieceCount = 12;
//        this.board = b.getBoard();
//    }
//
//    public void startGame(){
//        for (int i = 1; i <= 32; i++) {
//            if (i <= 12) {
//                board.put(i, new BlackMan());
//            } else if (i >= 21) {
//                board.put(i, new WhiteMan());
//            } else {
//                board.put(i, new Empty());
//            }
//        }
//    }
//
//    @JsonAnySetter
//    public void setBoard(Map<Integer, Piece> board) {
//        this.board = board;
//    }
//
//    private Piece determiner(Piece p){
//        if(p.equals(new BlackMan()))
//            return new BlackMan();
//        else
//            return new WhiteMan();
//    }
//
//    public Map<Integer, Piece> getBoard() {
//        return board;
//    }
//
//    public int getPositionFrom() {
//        return positionFrom;
//    }
//
//    public void setPositionFrom(int positionFrom) {
//        this.positionFrom = positionFrom;
//    }
//
//    public int getPositionTo() {
//        return positionTo;
//    }
//
//    public void setPositionTo(int positionTo) {
//        this.positionTo = positionTo;
//    }
//
//    public int getBlackPieceCount() {
//        return blackPieceCount;
//    }
//
//    public void setBlackPieceCount(int blackPieceCount) {
//        this.blackPieceCount = blackPieceCount;
//    }
//
//    public int getWhitePieceCount() {
//        return whitePieceCount;
//    }
//
//    public void setWhitePieceCount(int whitePieceCount) {
//        this.whitePieceCount = whitePieceCount;
//    }
//
//    public boolean checkPositionEmpty(int position) {
//        return board.get(position) instanceof Empty;
//    }
//
//    public Map<Integer, Piece> updateBoard(int positionFrom,
//                                               int positionTo) {
//        board.replace(positionTo,
//                      board.get(positionTo),
//                      board.get(positionFrom));
//        board.replace(positionFrom, new Empty());
//        return board;
//    }
//
////    public Board getPossibleBoardState(int possiblePositionFrom,
////                                       int possiblePositionTo) {
////        Board boardCopy = this.copy();
////        boardCopy.updateBoard(possiblePositionFrom, possiblePositionTo);
////        return boardCopy;
////    }
//
////    public Board getPossibleBoardState(Board board,
////                                       int possiblePositionFrom,
////                                       int possiblePositionTo) {
////        Board boardCopy = new Board();
////        boardCopy.setBoard(this.board);
////        boardCopy.updateBoard(possiblePositionFrom, possiblePositionTo);
////        return boardCopy;
////    }
//
//    public Map<Integer, Piece> capturePiece(int position) {
//        if (board.get(position) instanceof WhiteMan
//            || board.get(position) instanceof WhiteKing)
//            whitePieceCount--;
//        if (board.get(position) instanceof BlackMan
//            || board.get(position) instanceof BlackKing)
//            blackPieceCount--;
//        board.replace(position, new Empty());
//        return board;
//    }
//
//    public boolean checkGameFinished() {
//        return (blackPieceCount == 0 || whitePieceCount == 0);
//    }
//
////    public boolean isWhiteWinner() {
////        return blackPieceCount == 0;
////    }
////
////    public boolean isBlackWinner() {
////        return whitePieceCount == 0;
////    }
////
////    public Board copy() {
////        Board boardCopy = new Board();
////        boardCopy.setBoard(this.board);
////        boardCopy.setBlackPieceCount(getBlackPieceCount());
////        boardCopy.setWhitePieceCount(getWhitePieceCount());
////        return boardCopy;
////    }
//
//    static public List<Integer> getMoves(Board board, int i) {
//        Piece p = board.getBoard().get(i);
//        return p.getPossibleMoves(board, i);
//    }
//
    
}