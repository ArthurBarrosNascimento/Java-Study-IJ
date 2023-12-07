package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int numberRoom = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkInDate = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOutDate = sdf.parse(sc.next());

        if (!checkOutDate.after(checkInDate)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(numberRoom, checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkInDate = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOutDate = sdf.parse(sc.next());

            String error = reservation.updateDates(checkInDate, checkOutDate);

            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
        }


        sc.close();
    }
}
