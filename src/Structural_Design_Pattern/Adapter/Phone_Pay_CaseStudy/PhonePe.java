package Structural_Design_Pattern.Adapter.Phone_Pay_CaseStudy;

public class PhonePe {
    private YesBankAPI yesBankAPI;
    public PhonePe(YesBankAPI yesBankAPI) {
        this.yesBankAPI = yesBankAPI;
    }
    public String transferMoney(String fromUserName, String toUserName, double amount){
        // Business Logic
        char result  = yesBankAPI.transfer(fromUserName, toUserName, (int)amount);
        if(result == 'D'){
            return "Transfer is Done";
        } else{
            return "Transfer Failed";
        }
    }
    public double checkBalance(String userName){
        // Business Logic
        return yesBankAPI.checkBalance(userName);
    }
    public boolean login(String userName){
        // Business Logic
        return yesBankAPI.authenticate(userName) == 'Y';
    }
}
