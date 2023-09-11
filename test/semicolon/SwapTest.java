package semicolon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {
    @Test
    public void swapTest(){
        int[] num ={2,4,6,8,10};
        int[] expected ={2,4,8,6,10};
        int[] actual = Swap.swap(num,2,3);
        assertEquals(expected,actual);
    }


}