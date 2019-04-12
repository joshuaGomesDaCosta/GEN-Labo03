import java.util.Iterator;
import java.util.LinkedList;

public class Board {
    private LinkedList<Square> squares;
    private final int NB_SQUARES = 40;

    public Board() {
        squares = new LinkedList<>();
        // Depart
        squares.add(new Square("Départ"));

        for(int i = 1; i < NB_SQUARES; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    public LinkedList<Square> getSquares() {
        return squares;
    }

    public Square getSquare(Square oldLoc, int fv) {
        Iterator iterator = squares.iterator();
        Square square;

        int i = 0;
        while (iterator.hasNext()) {
            if(iterator.next().equals(oldLoc)) {
                break;
            }
            i++;
        }

        return squares.get((i + fv) % NB_SQUARES);
    }

}
