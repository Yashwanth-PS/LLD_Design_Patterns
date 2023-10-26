package Structural_Design_Pattern.Adapter.Google_Pay_CaseStudy;

public class YesBankAdapter implements BankAPIAdapter {
    private YesBankAPI yesBankAPI;

    public YesBankAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        char result = yesBankAPI.transfer(fromUserName, toUserName, (int) amount);
        if (result == 'D') {
            return "Transaction Successful";
        } else {
            return "Transaction Failed";
        }
    }

    @Override
    public double checkBalance(String userName) {
        return yesBankAPI.checkBalance(userName);
    }

    @Override
    public boolean authenticate(String userName) {
        return yesBankAPI.authenticate(userName) == 'Y';
    }
}
