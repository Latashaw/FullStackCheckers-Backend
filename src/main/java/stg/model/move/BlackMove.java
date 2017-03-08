package stg.model.move;

/**
 * Created by rickjackson on 3/6/17.
 */
public interface BlackMove {
    
    default int southWestSimpleMove(int start) {
        checkSouthMove(start);
        
        if (start > 27
            || (start % 4 == 0 && (start / 4) % 2 != 0)) {
            return -1;
        } else if ((start / 4) % 2 == 0) {
            return start + 4;
        } else {
            return start + 3;
        }
    }
    
    default int southEastSimpleMove(int start) {
        checkSouthMove(start);
        
        if (start > 27
            || ((start + 1) % 4 == 0 && (((start + 1) / 4) % 2 != 0))) {
            return -1;
        } else if ((start / 4) % 2 == 0) {
            return start + 5;
        } else {
            return start + 4;
        }
    }
    
    default int southWestJumpMove(int start) {
        checkSouthMove(start);
        
        return (start > 24 || start % 4 == 0) ? -1 : start + 7;
    }
    
    default int southEastJumpMove(int start) {
        checkSouthMove(start);
        
        return (start > 24 || (start + 1) % 4 == 0) ? -1 : start + 9;
    }
    
    default void checkSouthMove(int index) {
        if (index < 0 || index > 31) {
            throw new IndexOutOfBoundsException();
        }
    }

}