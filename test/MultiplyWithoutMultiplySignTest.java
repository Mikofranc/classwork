import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyWithoutMultiplySignTest {
    @Test
    public  void MultiplyTest(){
        MultiplyWithoutMultiplySign multiplyWithoutMultiplySign = new MultiplyWithoutMultiplySign();
        int answer = multiplyWithoutMultiplySign.multiply(-10,-3);
        int expected = 30;
        assertEquals(expected,answer);
    }



}