package Structural_Design_Pattern.Adapter.Phone_Pay_CaseStudy;
public class YesBankAPI {
    public char transfer(String fromPerson, String toPerson, int Amount){
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