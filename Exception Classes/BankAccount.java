/**
 * Seiji Zapanta
 * Wenjia Li
 * CSCI 185
 * November 29, 2022
 * M6: Write Your Own Exception Classes Lab
 */

import javax.swing.*;

public class BankAccount {
    private double balance, newBalance, leftBalance;
    private double depositAmount;
    private double withdrawAmount;

    //default constructor
    public BankAccount(){
        balance =0;
    }
    //fully loaded constructor
    public BankAccount(double initialBalance, double deposit, double withdraw){
        balance = initialBalance;
        depositAmount = deposit;
        withdrawAmount = withdraw;
    }
    //mutator --> set
    public void setBalance(double newBal){
        balance = newBal;
    }
    public double getBalance(){
        return balance;
    }
    public void setDepositAmount(double deposit){
        depositAmount = deposit;
    }
    public double getDepositAmount(){
        return depositAmount;
    }
    public void setWithdrawAmount(double withdraw){
        this.withdrawAmount = withdraw;
    }
    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    //calculate newBalance after depositing
    public double calcDeposit(double depositAmount){
        newBalance = balance + depositAmount;
        return newBalance;
    }
    //calculate newBalance after withdrawing
    public double calcWithdraw(double withdrawAmount){
        leftBalance = balance - withdrawAmount;
        return leftBalance;
    }
    //toString method
    public String toString(){
        String s = "";
        s += "Initial Balance: " + balance;
        s += "\n New Balance after depositing: " + newBalance;
        s += "\n New Balance after withdrawing: " + leftBalance;
        return s;
    }


    //main method
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setBalance(100.00);

        JOptionPane transactionType = new JOptionPane(JOptionPane.YES_OPTION);
        //ask the user if they want to deposit or withdraw money
        int depositOrWithdraw = JOptionPane.showConfirmDialog(transactionType, "Press 'Yes' to deposit and 'No' withdraw money" +
                "\n Current Account Balance: " + account1.balance);

        try {
            //deposit option
            if (depositOrWithdraw == JOptionPane.YES_OPTION) {
                //get deposit amount from user
                double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount: "));
                if(account1.balance == 0){ //if account balance is 0
                    throw new InvalidAmountException("Invalid Amount, You have 0 balance in your account.");
                }
                else if (depositAmount < 0) { //negative input check
                    throw new DepositNegativeException("You can't deposit a negative amount");
                }
                else {
                    //calling the method calcDeposit to add the amount entered to the current balance
                    account1.calcDeposit(depositAmount);
                    //show the new balance after transaction
                    JOptionPane.showMessageDialog(null, "Your new Balance: " + account1);
                    System.exit(0);
                }
            //withdraw option
            } else {
                //get withdraw amount from user
                double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdraw amount: "));
                if(account1.balance == 0){ //if account balance is 0
                    throw new InvalidAmountException("Invalid Amount, You have 0 balance in your account.");
                }
                else if (withdrawAmount > account1.balance) { //overdraft
                    throw new IllegalArgumentException("Not enough balance to withdraw this amount!", account1.balance); //overdraft exception
                }
                else if (withdrawAmount < 0) { //negative input check
                    throw new DepositNegativeException("You can't withdraw a negative amount, please try again!");
                } else {
                    //calling a method that subtracts amount entered to current balance
                    account1.calcWithdraw(withdrawAmount);
                    //show the new balance after transaction
                    JOptionPane.showMessageDialog(null, "Your new Balance" + account1);
                    System.exit(0);
                }
            }
            //catching exceptions
        }catch (InvalidAmountException e){ //if current balance is 0
            JOptionPane.showMessageDialog(null, "Invalid Amount, You currently have 0 balance in your account!");
        }catch (IllegalArgumentException e) { //overdraft
            JOptionPane.showMessageDialog(null, "Not enough balance to withdraw this amount!  " + "\n\tYou only have: "  + account1.balance + " in your account!");//overdraft exception
        }catch (DepositNegativeException e){ //negative input check
            JOptionPane.showMessageDialog(null, "Invalid input! Please input a positive number in order to deposit/withdraw!!");
        }
    }

}
