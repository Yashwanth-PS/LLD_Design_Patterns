package Structural_Design_Pattern.Adapter.Google_Pay_CaseStudy;

public class ICICIBankAPI {
    public String doPayment(long fromId, long toId, double Amount){
        // logic for verifying whether the transaction was completed
        return "success";
    }
    public double Balance(long accountId){
        // logic for checking account balance
        return 1000;
    }
    public boolean checkUser(long accountId){
        // logic for authentication
        return true;
    }
}
