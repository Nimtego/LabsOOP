package model.lab7;

import model.AbstractModel;
import model.lab6.BankAccount;

import java.math.BigDecimal;
import java.util.Random;

import static utils.Constant.DESCRIPTION_LAB_7;
import static utils.Constant.LAB_7_QUESTION;

/**
 * Created by nimtego_loc on 24.06.2018.
 */
public class Lab7Transfer extends AbstractModel {

    private Bank bank;

    public Lab7Transfer() {
        this.bank = new BankBean();
    }

    @Override
    public String solution(String request) {
        int count = Integer.parseInt(request);
        for (int i = 0; i < count; i++) {
            BankAccount bankAccount = new BankAccount();
            bankAccount.setAccBal(new BigDecimal(new Random().nextInt()));
            bank.addAccount(bankAccount);
        }
        return bank.toString();
    }

    @Override
    protected String setHeader() {
        return DESCRIPTION_LAB_7;
    }

    @Override
    protected String setQuestion() {
        return LAB_7_QUESTION;
    }
}
