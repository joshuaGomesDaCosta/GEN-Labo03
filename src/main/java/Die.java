import java.util.Random;

public class Die {
    private final Random rand = new Random();
    protected final int maxFace = 6;
    protected final int minFace = 1;
    private int value;

    public Die(){
        value = minFace;
    }

    public void roll(){
        value =  minFace + rand.nextInt(maxFace - minFace);
    }

    public int getFaceValue(){
        return value;
    }
}
