package BankPackage;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account>accounts= new ArrayList<>();
    private  double balance;
    public void createAccount(String firstName, String secondName, String email, String phone){
        Account account = new Account(firstName, secondName, email, phone);
        account.setAccountNumber(setAccountNumber(phone));
        accounts.add(account);
        if(account.getAccountNumber().length() > 0){
            System.out.println("Successful!!!");
            System.out.println("Account Details\n" + account.toString());
            System.out.println("Your account number is: "+account.getAccountNumber());
        }else {
            System.out.println("Opps Account creation not successful");
        }
    }
    public    void setPassword(String accountNumber, String pass){
       for(Account account: accounts){
           if(account.getAccountNumber().equals(accountNumber)){
               account.setPassword(pass);
               System.out.println("su");
           }else {
               System.out.println("Details not found...could not set password");
           }
       }
    }
    private String setAccountNumber(String number){
         StringBuilder no = new StringBuilder();
         for (int index = 1; index < number.length(); index++){
             no.append(number.charAt(index));
         }
        System.out.println(no.toString());
         return String.valueOf(no);
    }
    public void deposit(String accountNumber, int amount){
        if(checkValidityOfAcc(accountNumber)==true){
            for(Account account: accounts){
                if(account.getAccountNumber().equals(accountNumber) && amount > 0){
                    balance =account.deposit(amount);
                    System.out.println("Successful  balance is: " + balance);
                }else {
                    System.out.println("invalid account details");
                }
            }
        }else {
            System.out.println("Account not found");
        }
    }
    private  boolean checkValidityOfAcc(String accontNo){
        for(Account account: accounts){
            if(account.getAccountNumber().equals(accontNo) ){
                return  true;
            }
        }
        return false;
    }
    public void   withdraw(String accountNumber, int amount, String pin){
        for(Account account: accounts){
            if (account.getAccountNumber().equals(accountNumber) && amount > 0 && account.getpassword().equals(pin)){
               balance= account.withdraw(amount, pin);
                System.out.println("Successful you balance is: "+ balance);
            }else {
                System.out.println("invalid  details");
            }
        }
    }
    public void transfer(String reciverAccNo, int amount, String accountNumber, String pin){
        for(Account account: accounts){
            if(reciverAccNo.length() > 0 && amount > 0){
                if(account.getAccountNumber().equals(accountNumber) && account.getpassword().equals(pin)){
                    if(account.getBalance() > amount){
                        balance =account.getBalance() - amount;
                        System.out.println("Successful you balance is: "+ balance);
                    }else {
                        System.out.println("insufficient funds");
                    }
                }else {
                    System.out.println("Invalid details");
                }
            }else {
                System.out.println("Invalid Recipient account number or invalid amount");
            }
        }
    }
    public void balance(String accountNumber, String pin){
        for(Account account: accounts){
            if(checkValidityOfAcc(accountNumber)==true && account.getpassword().equals(pin)){
                System.out.println("Your balance is: " + balance);
            }
        }
    }
}
