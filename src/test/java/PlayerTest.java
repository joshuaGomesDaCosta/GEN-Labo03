
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    Player p1 = new Player("Jhon");
    Player p2 = new Player("Bob", Piece.brouette);

    @Test
    public void playerTestName(){
        assertEquals("Jhon", p1.getName());
        assertEquals("Jhon", p1.toString());

        assertEquals("Bob", p2.getName());
        assertEquals("Bob", p2.toString());
    }

    @Test
    public void playerTestPiece(){
        p1.setPiece(Piece.deACoudre);

        assertEquals(Piece.deACoudre, p1.getPiece());
        assertEquals(Piece.brouette, p2.getPiece());

        assertNotEquals(Piece.botte, p1.getPiece());
        assertNotEquals(Piece.chien, p2.getPiece());
    }

    @Test
    public void playerTestTakeTurn(){
        p1.takeTurn();
    }
}
