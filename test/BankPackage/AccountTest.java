package BankPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;
    @BeforeEach
    public void beforEach(){
        account =new Account("micheal","Ayomide","michealayomide@gmail.com","09011480776");
    }
    @Test
    public void testThatYouCanDeposit(){
//        Account account = new Account();
        account.deposit(1000);
        assertEquals(account.deposit(4000), 5000);
    }
    @Test
    public void testThatYouCanWithraw(){
        account.deposit(5000);
        account.setPassword("mik");
        assertEquals(account.withdraw(2000, "mik"), 3000);
    }
    @Test
    public void checkBalance(){
        account.setPassword("mik");
        assertEquals(account.getBalance("k"), 0);
    }

}