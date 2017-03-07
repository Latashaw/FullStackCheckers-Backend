package stg.model.move;

/**
 * Created by rickjackson on 3/6/17.
 */
public interface WhiteMove {
    
    default int northWestSimpleMove(int start) {
        checkNorthSimpleMove(start);
        
        if (start < 4 || (start % 4 == 0 && (start / 4) % 2 != 0)) {
            return -1;
        } else if ((start / 4) % 2 == 0) {
            return start - 4;
        } else {
            return start - 5;
        }
    }
    
    default int northEastSimpleMove(int start) {
        checkNorthSimpleMove(start);
        
        if (start < 4 || ((start + 1) % 4 == 0 && ((start + 1) / 4) % 2 == 0)) {
            return -1;
        } else if ((start / 4) % 2 == 0) {
            return start - 3;
        } else {
            return start - 4;
        }
    }
    
    default int northWestJumpMove(int start) {
        checkNorthSimpleMove(start);
        
        return (start < 8 || start % 4 == 0) ? -1 : start - 9;
    }
    
    default int northEastJumpMove(int start) {
        checkNorthSimpleMove(start);
        
        return (start < 8 || (start + 1) % 4 == 0) ? -1 : start - 7;
    }
    
    default void checkNorthSimpleMove(int index) {
        if (index < 0 || index > 31) {
            throw new IndexOutOfBoundsException();
        }
    }
    
    // default int[] northMoves(int i) {
    //     if (i < 4 || i > 31) {
    //         throw new IndexOutOfBoundsException();
    //     }
    //     int[] p;
    //
    //     if ((i / 4) % 2 == 0) {
    //         if ((i + 1) % 4 == 0) {
    //             p = new int[1];
    //             p[0] = i - 4;
    //             return p;
    //         } else {
    //             p = new int[2];
    //             p[0] = i - 4;
    //             p[1] = i - 3;
    //             return p;
    //         }
    //     } else {
    //         if (i % 4 == 0) {
    //             p = new int[1];
    //             p[0] = i -4;
    //             return p;
    //         } else {
    //             p = new int[2];
    //             p[0] = i - 5;
    //             p[1] = i - 4;
    //             return p;
    //         }
    //     }
    // }
}
