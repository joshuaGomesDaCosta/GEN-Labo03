import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void aSquareHasToHaveAName() {
        Square s = new Square("Départ");
        assertEquals(s.getName(), "Départ");
    }
}
