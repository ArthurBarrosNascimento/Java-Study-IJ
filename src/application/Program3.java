package application;

import model.entities.Reservation;
import model.excepetions.DomainExcepetion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int numberRoom = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkInDate = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOutDate = sdf.parse(sc.next());

            Reservation reservation = new Reservation(numberRoom, checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkInDate = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOutDate = sdf.parse(sc.next());

            reservation.updateDates(checkInDate, checkOutDate);

            System.out.println("Reservation: " + reservation);

            sc.close();
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainExcepetion e) {
            System.out.println("Error in Reservation: " + e.getMessage());
        }
    }
}
