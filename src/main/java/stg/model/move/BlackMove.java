package stg.model.move;

/**
 * Created by rickjackson on 3/6/17.
 */
public interface BlackMove {
    
    default int[] southMoves(int i) {
        if (i < 0 || i > 27) {
            throw new IndexOutOfBoundsException();
        }
        int[] p;
        
        if ((i / 4) % 2 == 0) {
            if ((i + 1) % 4 == 0) {
                p = new int[1];
                p[0] = i + 4;
                return p;
            } else {
                p = new int[2];
                p[0] = i + 4;
                p[1] = i + 5;
                return p;
            }
        } else {
            if (i % 4 == 0) {
                p = new int[1];
                p[0] = i + 5;
                return p;
            } else {
                p = new int[2];
                p[0] = i + 3;
                p[1] = i + 4;
                return p;
            }
        }
    }
}
