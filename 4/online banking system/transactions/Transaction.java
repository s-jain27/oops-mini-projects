package transactions;

import accounts.BankAccount;
import accounts.InsufficientFundsException; // importing 

public class Transaction extends Thread {
    public final BankAccount sourceAccount; // imp line
    public final BankAccount targetAccount;// imop lien
    public final double amount;
    public final String transactionType;
// constructor 
    public Transaction(BankAccount sourceAccount, BankAccount targetAccount, double amount, String transactionType) {
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public void run() {
        try {
            if (transactionType=="deposit") {
                sourceAccount.deposit(amount); 
            } else if (transactionType=="withdraw") {
                sourceAccount.withdraw(amount);
            } else if (transactionType=="transfer") { // transfer methof calling 
                sourceAccount.transfer(targetAccount, amount);
            }
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed");
        }
    }
}
