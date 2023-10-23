package src;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> listAccount;

    public Bank() {
        this.listAccount = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        this.listAccount.add(account);
    }

    public void removeAccount(Account account) {

    }

    public void deposit(Account account, Double money) {

    }

    public void transfer(Account sender, Account receiver, Double amount) {
        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        String infoTransactionReceiver = "Da nhan " + amount + " tien";
        String infoTransactionSender = "Da gui " + amount + " tien";
        receiver.setTransactions(infoTransactionReceiver);
        sender.setTransactions(infoTransactionSender);
    }

}
