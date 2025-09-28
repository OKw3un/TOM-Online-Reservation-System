package Strategies;

/**
 * UserSelectedSeatStrategy implements the SeatSelectionStrategy interface
 * by selecting a specific seat chosen by the user, if it is available.
 */
public class UserSelectedSeatStrategy implements SeatSelectionStrategy {

    private int seatNumber; // The seat number selected by the user

    /**
     * Constructs the strategy with the user-selected seat number.
     *
     * @param seatNumber the seat index the user wants to select
     */
    public UserSelectedSeatStrategy(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * Returns the user-selected seat if it is available.
     *
     * @param seats a boolean array representing seat occupancy (true = occupied, false = available)
     * @return the selected seat number if available, or -1 if unavailable or invalid
     */
    @Override
    public int selectSeat(boolean[] seats) {
        if (seatNumber >= 0 && seatNumber < seats.length && !seats[seatNumber]) {
            return seatNumber;
        }
        return -1; // Selected seat is not available or out of range
    }
}