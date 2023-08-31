import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreaseArraylengthTest {
    @Test
    public void increaseArraylength(){
        IncreaseArraylength increaseArraylength = new IncreaseArraylength();
        int[] arrayToIncrease = {1,2,3};
        int[] actual = increaseArraylength.arrayIncrease(arrayToIncrease);
        int[] expected = {1,2,3,0,0,0};
        assertArrayEquals(expected, actual );
    }
}