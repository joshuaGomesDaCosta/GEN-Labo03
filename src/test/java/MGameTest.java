
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

public class MGameTest {
    @Test
    public void itShouldWorkBetween2and8Players() {
        int i = 2;
        try{

            List<String> players = new ArrayList<String>();
            players.add("joueur1");
            players.add("joueur2");
            for (i = 2; i < 8; i++) {
                players.add("joueur" + i);
                new MGame(players.toArray(new String[]{}));
            }
        }
        catch(Exception e){
            if(e.getMessage() == "pas assez de joueurs" || e.getMessage() == "trop de joueurs"){
                fail(i +" joeurs");
            }
        }

        try {
            new MGame(new String[]{"joueur1"});
            fail("only 1 player");
        }
         catch(Exception e){
            assertTrue(true);
        }
        try{
            new MGame(new String[]{"joueur1","joueur2","joueur3","joueur4","joueur5","joueur6","joueur7","joueur8","joueur9"});
            fail("too mush players(9)");
        }
        catch(Exception e){
            assertTrue(true);
        }
    }
}
