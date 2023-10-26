package Structural_Design_Pattern.Adapter.Google_Pay_CaseStudy;
public interface BankAPIAdapter {
    public String transfer(String toUserName, String fromUserName, double amount);
    public double checkBalance(String userName);
    public boolean authenticate(String userName);
}