package Strategies;

/**
 * LastAvailableSeatStrategy implements the SeatSelectionStrategy interface
 * by selecting the last available seat (the last false in the boolean array).
 */
public class LastAvailableSeatStrategy implements SeatSelectionStrategy {

    /**
     * Selects the last available seat from the seats array.
     *
     * @param seats an array representing seat occupancy (true = occupied, false = available)
     * @return the index of the last available seat, or -1 if none are available
     */
    @Override
    public int selectSeat(boolean[] seats) {
        for (int i = seats.length - 1; i >= 0; i--) {
            if (!seats[i]) {
                return i;
            }
        }
        return -1; // No available seat found
    }
}