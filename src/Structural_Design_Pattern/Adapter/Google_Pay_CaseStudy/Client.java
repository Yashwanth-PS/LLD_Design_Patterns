package Structural_Design_Pattern.Adapter.Google_Pay_CaseStudy;

public class Client {
    public static void main(String[] args) {
        /* // Create a YesBankAPI instance
        YesBankAPI yesBankAPI = new YesBankAPI();

        // Create a GooglePay instance with the YesBankAPI
        GooglePay googlePay = new GooglePay(yesBankAPI); */

        // Create a ICICIBankAPI instance
        ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

        // Create a GooglePay instance with the ICICIBankAPI
        GooglePay googlePay = new GooglePay(iciciBankAPI);

        // Perform operations using GooglePay
        String fromUser = "Alice";
        String toUser = "Bob";
        double amount = 500.0;

        // Transfer money
        String transferResult = googlePay.transferMoney(fromUser, toUser, amount);
        System.out.println("Money Transfer Result: " + transferResult);

        // Check balance
        double balance = googlePay.checkBalance(fromUser);
        System.out.println("Balance for " + fromUser + ": " + balance);

        // Authenticate user
        boolean isAuthenticated = googlePay.login(fromUser);
        System.out.println("User Authentication Result: " + (isAuthenticated ? "Authenticated" : "Not Authenticated"));
    }
}