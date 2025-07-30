class Bank {
    int calculateInterest(int principal, int rate) {
        return (principal * rate) / 100;
    }
    int calculateInterest(int principal, int rate, int time) {
        return (principal * rate * time) / 100;
    }
    void displayBankType() {
        System.out.println("This is a general bank.");
    }
}
class SBI extends Bank {

    @Override
    void displayBankType() {
        System.out.println("This is SBI Bank.");
    }
}
public class BankDemo {
    public static void main(String[] args) {
       
        Bank bank = new Bank();
        System.out.println("Interest (2 args): ₹" + bank.calculateInterest(1000, 5));          
        System.out.println("Interest (3 args): ₹" + bank.calculateInterest(1000, 5, 2));        
        Bank generalBank = new Bank();
        Bank sbiBank = new SBI();  
        System.out.println("\nBank types:");
        generalBank.displayBankType();  
        sbiBank.displayBankType();     
    }
}
