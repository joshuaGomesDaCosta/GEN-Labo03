import java.util.Random;

public class Die {
    private final Random rand = new Random();
    protected final int maxFace = 6;

    public Die(){

    }

    public int getFaceValue(){
        return rand.nextInt(maxFace);
    }
}
