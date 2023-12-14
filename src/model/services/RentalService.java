package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.awt.desktop.AboutEvent;
import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayments;

        if (hours <= 12.0) {
            basicPayments = pricePerHour * Math.ceil(hours);
        } else {
            basicPayments = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tex(basicPayments);

        carRental.setInvoice(new Invoice(basicPayments, tax));
    }
}
