package Reservation;

import Strategies.SeatSelectionStrategy;
import VoyageModels.Voyage;
import java.util.ArrayList;
import java.util.List;

public class ReservationContext {
    private SeatSelectionStrategy strategy; //Strategy design pattern object to select seat when making reservation

    private List<ReservationData> reservations = new ArrayList<>(); //List that keeps the reservations

    public void setStrategy(SeatSelectionStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean makeReservation(Voyage voyage) { 
        int selectedSeat = strategy.selectSeat(voyage.getSeats()); //Using strategy's selectSeat method to reach selected seat by user in that voyage
        if (selectedSeat != -1) { 
            voyage.reserveSeat(selectedSeat); //Reserve the seat in that voyage
            reservations.add(new ReservationData(voyage, selectedSeat)); //Save the reservation to reservations to show them on user's resarvations
            return true;
        } else {
            System.out.println("No available seats.");
            return false;
        }
    }

    public boolean cancelReservation(int seatNumber) {
        reservations.remove(seatNumber); //Removing reservation from reservations
        return true;
    }

    public List<ReservationData> getReservations() {
        return reservations;
    }
}