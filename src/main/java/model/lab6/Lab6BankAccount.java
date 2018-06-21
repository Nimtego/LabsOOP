package model.lab6;

import model.AbstractModel;

import static utils.Constant.DESCRIPTION_LAB_6;
import static utils.Constant.FLAG;
import static utils.Constant.LAB_6_QUESTION_1;

/**
 * Created by nimtego_loc on 21.06.2018.
 */
public class Lab6BankAccount extends AbstractModel {

    private BankAccount bankAccount;

    @Override
    public String solution(String request) throws NumberFormatException{
        if (bankAccount == null) {
            this.bankAccount = new BankAccount();
        }
        boolean flag = false;
        StringBuilder sbAccount = new StringBuilder();
        StringBuilder sbBalance = new StringBuilder();
        for (int i = 0; i < request.length(); i++) {
            if (request.charAt(i) == FLAG) {
                flag = true;
                continue;
            }
            if (!flag) {
                sbAccount.append(request.charAt(i));
                continue;
            }
            sbBalance.append(request.charAt(i));
        }
        long account = Long.parseLong(String.valueOf(sbAccount));
        bankAccount.populate(account, String.valueOf(sbBalance));
        return bankAccount.toString();
    }

    @Override
    protected String setHeader() {
        return DESCRIPTION_LAB_6;
    }

    @Override
    protected String setQuestion() {
        return LAB_6_QUESTION_1;
    }
}
