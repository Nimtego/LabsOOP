package model.lab7;

import model.lab6.BankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nimtego_loc on 24.06.2018.
 */
public class BankBean implements Bank{

    private Map<Long, BankAccount> bankAccountMap;
    private static long id = 1L;

    public BankBean() {
        this.bankAccountMap = new HashMap<>();
    }

    @Override
    public long addAccount(BankAccount bankAccount) {
        if (bankAccount.getAccNo() == 0)
            bankAccount.setAccNo(id++);
        if (!checkAccountIsReg(bankAccount.getAccNo())) {
            bankAccountMap.put(bankAccount.getAccNo(), bankAccount);
        }
        return bankAccount.getAccNo();
    }

    private boolean checkAccountIsReg(long id) {
        return bankAccountMap.containsKey(id);
    }

    @Override
    public void removeAccount(long id) {
        bankAccountMap.remove(id);
    }

    @Override
    public List<BankAccount> listAccounts() {
        return new ArrayList<>(bankAccountMap.values());
    }

    @Override
    public void deposit(long id, BigDecimal sum) {
        BigDecimal accSum = bankAccountMap.get(id).getAccBal().add(sum);
        bankAccountMap.get(id).setAccBal(accSum);
    }

    @Override
    public void withdraw(long id, BigDecimal sum) {
        BigDecimal accSubtract = bankAccountMap.get(id).getAccBal().subtract(sum);
        bankAccountMap.get(id).setAccBal(accSubtract);
    }

    @Override
    public void transfer(long srcId, long dstId, BigDecimal sum) {
        withdraw(srcId, sum);
        deposit(dstId, sum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (long id : bankAccountMap.keySet()) {
            sb.append("ID - ").append(id).append("\n")
                    .append("Balance - ")
                    .append(bankAccountMap.get(id)
                            .getAccBal())
                    .append("\n");
        }
        return String.valueOf(sb);
    }
}
