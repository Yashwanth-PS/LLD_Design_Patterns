package Structural_Design_Pattern.Adapter.Google_Pay_CaseStudy;

public class ICICIBankAdapter implements BankAPIAdapter{
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        long fromUserId = returnIdFromUserName(fromUserName);
        long toUserId= returnIdFromUserName(toUserName);
        return iciciBankAPI.doPayment(toUserId, fromUserId, amount);
    }

    @Override
    public double checkBalance(String userName) {
        return iciciBankAPI.Balance(returnIdFromUserName(userName));
    }

    @Override
    public boolean authenticate(String userName) {
        return iciciBankAPI.checkUser(returnIdFromUserName(userName));
    }

    private long returnIdFromUserName(String userName){
        return 0;
    }
}
