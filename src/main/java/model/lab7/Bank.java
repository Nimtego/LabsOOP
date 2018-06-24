package model.lab7;

import model.lab6.BankAccount;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by nimtego_loc on 24.06.2018.
 */
public interface Bank {
    long addAccount(BankAccount bankAccount);
    void removeAccount(long id);
    List<BankAccount> listAccounts();
    void deposit(long id, BigDecimal sum);
    void withdraw(long id, BigDecimal sum);
    void transfer(long srcId, long dstId, BigDecimal sum);
}
