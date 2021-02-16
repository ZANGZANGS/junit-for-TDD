package part1.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers(){
        //ready
        ScoreCollection collection = new ScoreCollection();
        collection.add(()->5);
        collection.add(()->7);

        //run
        int acutalResult = collection.arithmeticMean();

        //assertThat
        assertThat(acutalResult, equalTo(6));

    }
}