
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;


public class DieTest {
    @Test
    public void rollShouldGenerateValueBetween1and6(){
        List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        Die die = new Die();
        for( int i = 0; i< 20; i++){
            die.roll();
            assertTrue(die.getFaceValue() >= 1);
            assertTrue(die.getFaceValue() <= 6);
        }
/*
        while( !values.isEmpty()){
            die.roll();
            assertTrue(die.getFaceValue() >= 1);
            assertTrue(die.getFaceValue() <= 6);

            for(int val: values){
                if( val == die.getFaceValue()){
                    values.remove(val);
                }
            }
        }
*/
    }

    @Test
    public void valueShouldBeValidAfterConstructor(){
        Die d = new Die();
        assertNotNull(d.getFaceValue());
    }

}
