package Factories;

import VehicleModels.Bus;
import VehicleModels.Plane;
import VehicleModels.TransportVehicle;

/**
 * TransportVehicleFactory is a simple factory class that creates
 * instances of TransportVehicle subclasses based on the given type.
 */
public class TransportVehicleFactory {

    /**
     * Creates a TransportVehicle instance according to the specified type.
     *
     * @param type the type of vehicle to create ("plane" or "bus")
     * @param company the company operating the vehicle
     * @param capacity the capacity of the vehicle
     * @param route the route (only applicable for Plane)
     * @return a new TransportVehicle instance of the specified type
     * @throws IllegalArgumentException if the vehicle type is invalid
     */
    public static TransportVehicle createVehicle(String type, String company, int capacity, String route) {
        switch (type.toLowerCase()) {
            case "plane":
                return new Plane(company, capacity, route);
            case "bus":
                return new Bus(company, capacity);
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }
}