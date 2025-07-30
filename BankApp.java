/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void showDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: ₹" + balance);
    }

    void calculateInterest() {
        System.out.println("General bank account - no specific interest");
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String name, double balance) {
        super(name, balance); 
    }

    void calculateInterest() {
        double interest = balance * 0.04; 
        System.out.println("Savings Account Interest: ₹" + interest);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    void calculateInterest() {
        System.out.println("Current Account has no interest.");
    }
}


public class BankApp {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Parth", 10000);
        BankAccount acc2 = new CurrentAccount("Aarav", 20000);

        acc1.showDetails();
        acc1.calculateInterest();

        System.out.println();  // empty line

        acc2.showDetails();
        acc2.calculateInterest();
    }
}
