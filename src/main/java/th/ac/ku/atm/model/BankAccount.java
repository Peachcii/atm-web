package th.ac.ku.atm.model;

public class BankAccount {

    private int id;
    private int customerId;
    private String type;
    private double balance;

    public BankAccount(int id, int customerId, String type, double balance) {
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.balance = balance;
    }

    //ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Customer ID
    public int getCusId() {
        return customerId;
    }

    public void setCusId(int customerId) {
        this.customerId = customerId;
    }

    //Type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void add(BankAccount bankaccount) {
    }
}
