package VehicleModels;

/**
 * Represents an airplane in the transportation system
 * Extends TransportVehicle with plane-specific implementations.
 */
public class Plane extends TransportVehicle {

    /**
     * Constructor for creating a new plane
     * 
     * @param companyName Name of the airline company
     * @param capacity    Total passenger capacity of the plane
     * @param route       Flight route information
     */
    public Plane(String companyName, int capacity, String route) {
        super(companyName, capacity, route);
    }

    /**
     * Gets the type of vehicle
     * 
     * @return String indicating this is a plane
     */
    @Override
    public String getVehicleType() {
        return "Models.Plane";
    }
}