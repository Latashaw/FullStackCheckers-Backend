package stg.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by prestonbattin on 3/12/17.
 */
@Entity
@Table(name = "checkersSavedGame")
public class CheckersEntity {

    @NotNull
    private int[] board = new int[32];
    @NotNull
    private int positionTo;
    @NotNull
    private int positionFrom;
    @NotNull
    private int blackPieceCount;
    @NotNull
    private int whitePieceCount;
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public CheckersEntity(){
        this.id = 1;
    };

    public CheckersEntity(int[] board, int positionTo, int positionFrom, int blackPieceCount, int whitePieceCount){
        this.board = board;
        this.positionTo = positionTo;
        this.positionFrom = positionFrom;
        this.blackPieceCount = blackPieceCount;
        this.whitePieceCount = whitePieceCount;
        this.id = 1;

    }


    public int[] getBoard() {
        return board;
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

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
