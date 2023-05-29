public class DepositNegativeException extends Exception{
    private String message;

    public DepositNegativeException(String m){
        super("Invalid input! Please input a positive number in order to deposit/withdraw!!");
        this.message = m;
    }
}
