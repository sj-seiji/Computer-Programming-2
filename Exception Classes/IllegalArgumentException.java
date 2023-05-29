public class IllegalArgumentException extends Exception {
    private String message;
    private double balance;

    public IllegalArgumentException(String m, double b){
        super("Not enough balance to withdraw this amount!");
        this.message = m;
        this.balance = b;
    }
}
