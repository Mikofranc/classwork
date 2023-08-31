package ReverseSentense;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSentenceTest {
    @Test
    public void reverse(){
        String input = ReverseSentence.reverseSentence("i  java");
        String expected = "java  i";
        assertEquals(expected,input);
    }
    @Test
    public void checkSpecialCharacters(){
        int actual =ReverseSentence.specialCharSize("...(@85fffs>@@@@>&&%");
        int expected = 14;
        assertEquals(expected,actual);
    }
    @Test
    public void checkMostOccurringChar(){
        String actual = ReverseSentence.mostOccuringChar("ilovejava");
        String expected = "v";
        assertEquals(expected, actual);
    }

}