package Structural_Design_Pattern.Adapter.Google_Pay_CaseStudy;
public class GooglePay {
    private BankAPIAdapter bankAPIAdapter;
    public GooglePay(ICICIBankAPI iciciBankAPI) {
        // bankAPIAdapter = new YesBankAdapter();
        bankAPIAdapter = new ICICIBankAdapter();
    }
    public String transferMoney(String fromUserName, String toUserName, double amount){
        // Business Logic
        return bankAPIAdapter.transfer(fromUserName, toUserName, amount);
    }
    public double checkBalance(String userName){
        // Business Logic
        return bankAPIAdapter.checkBalance(userName);
    }
    public boolean login(String userName){
        // Business Logic
        return bankAPIAdapter.authenticate(userName);
    }
}