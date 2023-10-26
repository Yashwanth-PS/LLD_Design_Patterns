package Structural_Design_Pattern.Adapter.Google_Pay_CaseStudy;
public class YesBankAPI {
    public char transfer(String fromPerson, String toPerson, int Amount){
        // logic for verifying whether the transaction was completed
        return 'D';
    }
    public int checkBalance(String accountDetails){
        // logic for checking account balance
        return 1000;
    }
    public char authenticate(String accountDetails){
        // logic for authentication
        return 'Y';
    }
}