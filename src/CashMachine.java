import java.util.List;
import java.util.Scanner;
public class CashMachine implements ATM {
    public String title;
    public List<Account> accounts;

    // Get an account balance
    @Override
    public double get_balance(Account acc) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        var pin = scan.next();
        if (!pin.equals(acc.usr.pin_code)) return -1;
        return acc.balance;
    }

    // Top-up balance for an account (does not require check for enough money, but the PIN)
    @Override
    public double top_up_balance(Account acc, double top_up) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        var pin = scan.next();
        if (!pin.equals(acc.usr.pin_code)) return -1;
        return acc.balance += top_up;
    }

    // Withdraw balance from an account: check for correct PIN and correct balance
    // If account's bank is MyBank - No commission, else 2% of the withdrawal
    @Override
    public double withdraw_balance(Account acc, double withdraw) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        var pin = scan.next();
        if (!pin.equals(acc.usr.pin_code)) return -1;
        if (acc.balance < withdraw) return -2;
        if (!acc.title.equals("MyBank")) System.out.printf("Commision will be %s%n", withdraw * 1.02 - withdraw);
        if (!acc.title.equals("MyBank")) return acc.balance -= withdraw * 1.02;
        return acc.balance -= withdraw;
    }

    // Transfer money from one account to other account (require only sender's PIN) (checks for enough money)
    @Override
    public boolean transfer_balance(Account acc_sender, Account acc_recipient, double transfer) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        var pin = scan.next();
        if (!pin.equals(acc_sender.usr.pin_code)) return false;
        if (acc_sender.balance < transfer) return false;
        acc_sender.balance -= transfer;
        acc_recipient.balance += transfer;
        return true;
    }
}
