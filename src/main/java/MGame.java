
import java.util.ArrayList;
import java.util.List;

public class MGame {
    private final Board board = new Board();
    private Die[] dice = new Die[2];
    private List<Player> players = new ArrayList<Player>();
    private final int roundCnt = 20;

    public MGame(String[] playersName) throws Exception{
        if(playersName.length < 2)
            throw new Exception("pas assez de joueurs");

        for(String name: playersName){
            players.add(new Player(name, dice, board));
        }
    }

    public void playGame(){
        for(int i = 0; i < roundCnt; i++){
            playRound();
        }
    }

    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }
}
