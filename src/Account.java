package src;

import java.util.ArrayList;

public class Account {
    private Integer id;
    private Double balance;
    private String typeAccount;

    private ArrayList<String> transactions;

    public Account(Integer id, Double balance, String typeAccount) {
        this.id = id;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.transactions = new ArrayList<String>();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getTypeAccount() {
        return this.typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public ArrayList<String> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(String information) {
        this.transactions.add(information);
    }

    public void readTransactions() {
        for (String txt : transactions) {
            System.out.println(txt);
        }
    }


    public String info() {
        return "Balance: " + this.balance;
    }
}
