package Machine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    // set the customer number
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    // get the customer number
    public int getCustomerNumber() {
        return customerNumber;
    }
    //set the pin number
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    //get the pin number
    public int getPinNumber (){
        return pinNumber;
    }

    //get Checking Account Balance
    public  double getCheckingBalance(){
        return checkingBalance;
    }

    //get saving Account Balance
    public double getSavingBalance(){
        return savingBalance;
    }

    //Calculate checking account withdrawal
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //Calculate Saving account withdrawal
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    //Calculate checking account deposit
    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //Calculate saving account deposit
    public double calcSavingDeposit(double amount){
       savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    //Customer checking Account withdraw input
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account balance " + moneyFormat.format(checkingBalance));
        System.out.println("amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance is less than " + amount);
        }
    }

    //Customer Saving Account withdraw input
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account balance" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance " + savingBalance + "\n");
        }else {
            System.out.println("Balance is less than " + amount);
        }
    }
    //Customer checking Account deposit input
    public void getCheckingDepositInput(){
        System.out.println("Checking Account balance " + moneyFormat.format(checkingBalance));
        System.out.println("amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Account Balance " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance is less than 0.00");
        }
    }

    //Customer Saving Account deposit input
    public void getSavingDepositInput(){
        System.out.println("Saving Account balance" + moneyFormat.format(savingBalance));
        System.out.println("amount you want to deposit from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Account Balance " + moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance is less than 0.00");
        }
    }
    }

