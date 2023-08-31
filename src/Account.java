import java.math.BigDecimal;

import StringValdtation.StringValidator;
import StringValdtation.StringValidator.*;
public class Account {
    private static String name;
    private BigDecimal balance;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        boolean n = StringValidator.checkThatStringDoesNotHaveNumber(name);
        if (n = true)this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    @Override
    public  String toString(){
        return "Account\n"+"name: " +name+"\nbalance: "+balance +"\n";
    }
}
