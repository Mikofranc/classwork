package BankPackage;

public class Account {
    private  String accountNumber;
    private  String password;
    private String phoneNumber;
    private double amount;
    private  double balance;
    private String firstName;
    private String lastName;
    private String email;
//    private  int count;

public String getAccountNumber() {
    return accountNumber;
}

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Account(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber=phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(int amount){
        if (amount > 0){
            this.amount = amount;
             balance +=amount;
        }else {
            System.out.println("please enter amount more than zero");
        }
        return balance;
    }
    public  void setPassword(String password){
        this.password = password;
    }
    public String getpassword(){
        return  password;
    }
    public double withdraw(int amount, String password){
        this.amount = amount;
        if (password.equals(this.password)){
            return balance -= amount;
        }
        else {
            return 0;
        }
    }
    public  double getBalance(String password){
        if (password.equals(getpassword())){
            balance= balance ;
        }
        else {
            System.out.println("please enter the right password");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Names: "+firstName+" "+lastName+"\nEmail: "+email+"\nPhone number: "+phoneNumber;
    }
    //    public static void main(String[] args) {
//        Account account = new Account();
//        double deposit = account.deposit(-1);
//        System.out.println(deposit);
//    }


}
