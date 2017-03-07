package stg.model.piece;

import stg.model.Color;
import stg.model.move.BlackMove;
import stg.model.move.WhiteMove;

/**
 * Created by rickjackson on 3/6/17.
 */
public class BlackKing implements King, BlackMove, WhiteMove {
    Color color = Color.BLACK;
}
