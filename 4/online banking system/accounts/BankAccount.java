package accounts;
 public class BankAccount {
    public int accountNumber;
    public double balance;

    public BankAccount(int accountNumber, double balance) { // comstructor
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {// deposite method
        balance += amount;
        System.out.println("Deposit successful. New balance of:"+accountNumber+" is " + balance);
    }
// withdraw method , exception handling
    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("withdraw successful. New balance of:"+accountNumber+" is " + balance);
        } else {
            throw new InsufficientFundsException("Insufficient balance for withdrawal");
        }
    }
// transfer method
    public synchronized void transfer(BankAccount targetAccount, double amount) throws InsufficientFundsException {
        if (this.balance >= amount) { // checking 
            this.withdraw(amount);// 
            targetAccount.deposit(amount);
            
        } else {
            throw new InsufficientFundsException("Insufficient balance for transfer");
        }
    }
}
