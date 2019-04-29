

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {

    @Test
    public void PieceTest() {
        Piece p1 = new Piece("Cheval");

        assertEquals(p1, p1.getPiece());
    }
}