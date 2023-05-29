public class InvalidAmountException extends Exception {
    private String message;

    //if you have zero balance in your account
    public InvalidAmountException(String m) {
        super("Invalid Amount, You have 0 balance in your account!");
        this.message = m;
    }
}
