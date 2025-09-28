package VehicleModels;

/**
 * Abstract base class for all transport vehicles in the system
 * Provides common functionality for managing seats and vehicle information.
 */
public abstract class TransportVehicle {
    protected String companyName;
    protected int capacity;
    protected String route;
    protected boolean[] seats;

    /**
     * Constructor for creating a new transport vehicle
     * 
     * @param companyName Name of the company operating the vehicle
     * @param capacity    Total seat capacity of the vehicle
     * @param route       Route information of the vehicle
     */
    public TransportVehicle(String companyName, int capacity, String route) {
        this.companyName = companyName;
        this.capacity = capacity;
        this.route = route;
        this.seats = new boolean[capacity];
    }

    /**
     * Gets the type of the vehicle
     * 
     * @return String representing the vehicle type
     */
    public abstract String getVehicleType();

    /**
     * Checks if a specific seat is available
     * 
     * @param seatnumber The seat number to check
     * @return true if the seat is available, false otherwise
     */
    public boolean isSeatAvailable(int seatnumber) {
        return seatnumber >= 0 && seatnumber < capacity && !seats[seatnumber];
    }

    /**
     * Attempts to reserve a specific seat
     * 
     * @param number The seat number to reserve
     * @return true if reservation was successful, false otherwise
     */
    public boolean reserveSeat(int number) {
        if (isSeatAvailable(number)) {
            seats[number] = true;
            return true;
        }
        return false;
    }

    // Getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * Get the array of seat availability status
     * 
     * @return boolean array where true means seat is taken
     */
    public boolean[] getSeats() {
        return seats;
    }

    /**
     * Cancels a reservation for a specific seat
     * 
     * @param seatNumber The seat number to cancel
     * @return true if cancellation was successful, false otherwise
     */
    public boolean cancelReservation(int seatNumber) {
        if (seatNumber >= 0 && seatNumber < capacity && seats[seatNumber]) {
            seats[seatNumber] = false;
            return true;
        }
        return false;
    }
}
