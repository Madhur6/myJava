
class Bank {
    private int balance; 
    private final long accountNumber; 

    public Bank(int balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void withdraw(int amount, long accountNum) {
        // Authentication: Ensures only the correct account holder can withdraw money.
        if (accountNum != this.accountNumber) {
            System.out.println("Validation failed! Invalid credentials.");
            return;
        }

        // Validation: Prevents overdraft and negative withdrawals.
        if (amount > balance || amount <= 0) {
            System.out.println("Invalid amount. Please input a valid amount!");
            return;
        }

        this.balance -= amount;
        System.out.println("Successful withdrawal! New balance is: " + this.balance);
    }

    public void deposit(int amount, long accountNum) {
        // Authentication: Only the correct account holder should be able to deposit.
        if (accountNum != this.accountNumber) {
            System.out.println("Validation failed! Invalid credentials.");
            return;
        }

        // Validation: Deposits must be positive.
        if (amount <= 0) {
            System.out.println("Invalid amount. Please input a valid amount!");
            return;
        }

        this.balance += amount;
        System.out.println("Successful deposit! New balance is: " + this.balance);
    }

    public int getBalance(long accountNum) {
        // Authentication: Ensures only the account owner can check balance.
        if (accountNum != this.accountNumber) {
            System.out.println("Validation failed! Invalid credentials.");
            return -1;
        }
        return balance;
    }
}



public class encapsulationEx {
    public static void main(String[] args) {
        Bank harry = new Bank(1000, 123456789L);

        // Access control: Incorrect account number, should return a validation error.
        System.out.println("Testing balance access: " + harry.getBalance(12345678L));

        // Validation: Invalid deposit amount, should not be allowed.
        harry.deposit(-1, 123456789L);

        // Successful deposit with authentication.
        harry.deposit(100, 123456789L);

        // Authentication failure: Incorrect account number for withdrawal.
        harry.withdraw(1101, 123456L);

        // Successful withdrawal with authentication.
        harry.withdraw(145, 123456789L);

        // Encapsulation: Accessing balance only through a method, not directly.
        System.out.println("Final Balance: " + harry.getBalance(123456789L));
    }
}
