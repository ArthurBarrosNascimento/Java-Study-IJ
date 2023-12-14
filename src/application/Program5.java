package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data:");

        System.out.print("Number: ");
        int contractNumber = sc.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Contract value: ");
        double valueContract = sc.nextDouble();

        Contract contract = new Contract(contractNumber, date, valueContract);

        System.out.print("Enter the number of installments: ");
        int numberOfInstallments = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());

        System.out.println("ISNTALLMENTS:");

        contractService.processContract(contract, numberOfInstallments);

        for (Installment installment: contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
