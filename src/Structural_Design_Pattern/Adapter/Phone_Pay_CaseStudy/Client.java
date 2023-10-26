package Structural_Design_Pattern.Adapter.Phone_Pay_CaseStudy;

public class Client {
    public static void main(String[] args) {
        // Create a YesBankAPI instance
        YesBankAPI yesBankAPI = new YesBankAPI();

        // Create a PhonePe instance with the YesBankAPI
        PhonePe phonePe = new PhonePe(yesBankAPI);

        // Perform operations using PhonePe
        String fromUser = "Alice";
        String toUser = "Bob";
        double amount = 500.0;

        // Transfer money
        String transferResult = phonePe.transferMoney(fromUser, toUser, amount);
        System.out.println(transferResult);

        // Check balance
        double balance = phonePe.checkBalance(fromUser);
        System.out.println("Balance for " + fromUser + ": " + balance);

        // Authenticate user
        boolean isAuthenticated = phonePe.login(fromUser);
        System.out.println("User Authentication Result: " + (isAuthenticated ? "Authenticated" : "Not Authenticated"));
    }
}