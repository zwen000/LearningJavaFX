public class Account {
    private int accountNumber;
    private String firstname;
    private String lastname;
    private double balance;

    public Account() {
        this(0,"","",0);
    }

    public Account(int accountNumber, String firstname, String lastname, double balance) {
        this.accountNumber = accountNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

