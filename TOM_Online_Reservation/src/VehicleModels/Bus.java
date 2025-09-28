package VehicleModels;

/**
 * Represents a bus in the transportation system
 * Extends TransportVehicle with bus-specific implementations.
 */
public class Bus extends TransportVehicle {

    /**
     * Constructor for creating a new bus
     * 
     * @param companyName Name of the bus company
     * @param capacity    Total passenger capacity of the bus
     */
    public Bus(String companyName, int capacity) {
        super(companyName, capacity, null); // Route is managed separately for buses
    }

    /**
     * Gets the type of vehicle
     * 
     * @return String indicating this is a bus
     */
    @Override
    public String getVehicleType() {
        return "Models.Bus";
    }
}