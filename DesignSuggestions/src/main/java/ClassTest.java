import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 * Created by latashawatson on 3/7/17.
 */
public class ClassTest {
    String pieceType;

    public void test() throws ClassNotFoundException {
        Space[] Board = new Space[10];
        Board[0] = new Space(new Piece("RED").getState());
        Board[1] = new Space(new Piece("BLACK").getState());
        Board[2] = new Space(new Piece("RED").getState());
        Board[3] = new Space(new King("KING BLACK").getState());
        Board[4] = new Space(new Piece("RED").getState());
        Board[5] = new Space(new Piece("BLACK").getState());
        Board[6] = new Space(new King("KING RED").getState());
        Board[7] = new Space("VACANT");
        Board[8] = new Space("SELECTED");
        Board[9] = new Space("VACANT");
        for (int i = 0; i < Board.length; i++) {
            Space space = Board[i];
            System.out.println(space.getState());
            pieceType = space.getClass().getName();

        }
//        Class<?> clazz = Class.forName(pieceType);
//        System.out.println(clazz);
//        Constructor<?> construct = clazz.getConstructors();
//        Space spaceTest = new clazz();
//        System.out.println(pieceType);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ClassTest classTest = new ClassTest();
        classTest.test();
    }

}
