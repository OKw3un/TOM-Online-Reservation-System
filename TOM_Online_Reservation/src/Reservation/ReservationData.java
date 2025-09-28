package Reservation;

import VoyageModels.Voyage;

//Class that holds reservation data (voyage and seatNumber)
public class ReservationData {
    private Voyage voyage;
    private int seatNumber;

    public ReservationData(Voyage voyage, int seatNumber) {
        this.voyage = voyage;
        this.seatNumber = seatNumber;
    }

    public Voyage getVoyage() {
        return voyage;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}