import src.Account;
import src.Bank;

public class Main {
    public static void main(String[] args) {
        Account son = new Account(1, 300000.0, "1");
        Account hung = new Account(2, 200000.0, "1");
        Bank tpbank = new Bank();
        tpbank.addAccount(son);
        tpbank.addAccount(hung);

        tpbank.transfer(son, hung, 15000.0);
        System.out.println("-- Tien con lai: " + son.getBalance());

    }
}
