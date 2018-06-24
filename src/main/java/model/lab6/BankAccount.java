package model.lab6;

import java.math.BigDecimal;

/**
 * Created by nimtego_loc on 21.06.2018.
 */
public class BankAccount {
    private long accNo;
    private BigDecimal accBal;
    private AccountType accType;

    public void populate(String balance) throws NumberFormatException {
        for (int i = 0; i < balance.length(); i++) {
            if (!Character.isDigit(balance.charAt(i))
                    && (balance.charAt(i) != '.' && (i != 0 && balance.charAt(i) != '-'))){
                System.out.println(balance);
                throw new NumberFormatException("Wrong balance");

            }
        }
        this.accNo = 0;
        this.accBal = new BigDecimal(balance);
        this.accType = AccountType.CHECKING;
    }

    public void populate(long number, String balance) throws NumberFormatException {
        if (number < 0)
            throw new NumberFormatException();
        this.accNo = number;
        for (int i = 0; i < balance.length(); i++) {
            if (!Character.isDigit(balance.charAt(i))
                && (balance.charAt(i) != '.' && (i != 0 && balance.charAt(i) != '-'))){
                    System.out.println(balance);
                    throw new NumberFormatException("Wrong balance");

            }
        }
        this.accBal = new BigDecimal(balance);
        this.accType = AccountType.CHECKING;
    }

    public long getAccNo() {
        return accNo;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public void setAccBal(BigDecimal bigDecimal) {
        this.accBal = bigDecimal;
    }

    public BigDecimal getAccBal() {
        BigDecimal bd = new BigDecimal(accBal.toString());
        return accBal;
    }

    public AccountType getAccType() {
        return accType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account - ").
                append(accNo).append("\n").
                append("Balance - ").
                append(accBal).append("\n").
                append("Is checked - ").
                append(accType).append("\n");
        return String.valueOf(sb);
    }
}
