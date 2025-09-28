package Strategies;

/**
 * SeatSelectionStrategy defines a contract for selecting a seat
 * from an array representing seat occupancy.
 */
public interface SeatSelectionStrategy {

    /**
     * Selects a seat index based on the provided seats occupancy array.
     *
     * @param seats a boolean array where true indicates occupied seat,
     *              and false indicates available seat
     * @return the index of the selected seat, or -1 if no seats are available
     */
    int selectSeat(boolean[] seats);
}