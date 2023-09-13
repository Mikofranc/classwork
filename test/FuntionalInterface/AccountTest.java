package FuntionalInterface;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void withdraw(){
        assertThrows(RuntimeException.class,()->Account.withdraw(BigDecimal.valueOf(-1000)));
    }
}