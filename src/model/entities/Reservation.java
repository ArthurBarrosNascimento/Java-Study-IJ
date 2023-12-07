package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long dif = this.checkOut.getTime() - this.checkIn.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {
            return"Reservation dates for update must be future dates";
        }
        if (!checkOut.after(checkIn)) {
            return "Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        return "Room "
                + this.roomNumber
                + ", check-in: "
                + this.checkIn
                + sdf.format(this.checkIn)
                + ", check-out: "
                + sdf.format(this.checkOut)
                + ", "
                + this.duration()
                + " nights";
    }
}
