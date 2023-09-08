package Istogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IstogramTest {
    @Test
    public void testIsogram(){
        assertTrue(Istogram.istogramCheck("the qick brwn fx jumps ov lazy d|"));
    }

}