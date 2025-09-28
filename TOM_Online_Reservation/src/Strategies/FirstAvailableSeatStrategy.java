package Strategies;

/**
 * FirstAvailableSeatStrategy implements the SeatSelectionStrategy interface
 * by selecting the first available seat (the first false in the boolean array).
 */
public class FirstAvailableSeatStrategy implements SeatSelectionStrategy {

    /**
     * Selects the first available seat from the seats array.
     *
     * @param seats an array representing seat occupancy (true = occupied, false = available)
     * @return the index of the first available seat, or -1 if none are available
     */
    @Override
    public int selectSeat(boolean[] seats) {
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                return i;
            }
        }
        return -1; // No available seat found
    }
}