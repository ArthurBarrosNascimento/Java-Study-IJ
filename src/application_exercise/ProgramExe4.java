package application_exercise;

import entities_exercise.AccountEx4;
import model.excepetions.DomainExcepetion;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExe4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int numberAccount = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holderAccount = sc.nextLine();
            System.out.print("Initial balance: ");
            double balanceAccount = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimitAccount = sc.nextDouble();

            AccountEx4 acc = new AccountEx4(numberAccount, holderAccount, balanceAccount, withdrawLimitAccount);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();

            acc.withdrawa(withdraw);

            System.out.println("New balance: " + acc.getBalance());

            sc.close();
        } catch (DomainExcepetion e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
