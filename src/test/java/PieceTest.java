import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {
    @Test
    public void pieceTestName(){
        assertEquals("Dés à coudre", Piece.deACoudre.toString());
        assertEquals("Brouette", Piece.brouette.toString());
        assertEquals("Botte", Piece.botte.toString());
        assertEquals("Chien", Piece.chien.toString());
        assertEquals("Voiture", Piece.voiture.toString());
        assertEquals("Fer à repasser", Piece.ferARepasser.toString());
        assertEquals("Chapeau", Piece.chapeau.toString());
        assertEquals("Bateau", Piece.bateau.toString());
    }

    @Test
    public void pieceTestId(){
        assertEquals(1, Piece.deACoudre.getId());
        assertEquals(2, Piece.brouette.getId());
        assertEquals(3, Piece.botte.getId());
        assertEquals(4, Piece.chien.getId());
        assertEquals(5, Piece.voiture.getId());
        assertEquals(6, Piece.ferARepasser.getId());
        assertEquals(7, Piece.chapeau.getId());
        assertEquals(8, Piece.bateau.getId());
    }

    @Test
    public void pieceTestPiece(){
        assertEquals(Piece.deACoudre, Piece.deACoudre.getPiece());
        assertEquals(Piece.brouette, Piece.brouette.getPiece());
        assertEquals(Piece.botte, Piece.botte.getPiece());
        assertEquals(Piece.chien, Piece.chien.getPiece());
        assertEquals(Piece.voiture, Piece.voiture.getPiece());
        assertEquals(Piece.ferARepasser, Piece.ferARepasser.getPiece());
        assertEquals(Piece.chapeau, Piece.chapeau.getPiece());
        assertEquals(Piece.bateau, Piece.bateau.getPiece());
    }
}