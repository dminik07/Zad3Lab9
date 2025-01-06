public class Main {
    public static void main(String[] args) {
        // Create an Account object with a certain balance
        Account myAccount = new Account("John Doe", 1000, "AB12345");

        try {
            // Attempt a transfer larger than the current balance
            myAccount.transfer(1500);
            System.out.println("Transfer completed successfully.");
        } catch (NotEnoughMoneyException e) {
            // Catch our custom exception
            System.out.println("Custom exception caught: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions that might occur
            System.out.println("An unexpected exception was caught: " + e.getMessage());
        } finally {
            // Print the current balance regardless of the outcome
            System.out.println("Final account balance: " + myAccount.getBalance());
        }
    }
}
