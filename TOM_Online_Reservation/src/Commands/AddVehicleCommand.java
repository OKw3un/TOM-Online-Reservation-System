package Commands;

import VehicleModels.TransportVehicle;
import java.util.List;

/**
 * AddVehicleCommand implements the Command pattern to add a TransportVehicle
 * to a given list of vehicles. The command can also be undone.
 */
public class AddVehicleCommand implements Command {

    private List<TransportVehicle> vehicles;      // The list to which the vehicle will be added
    private TransportVehicle vehicle;             // The vehicle to be added
    private boolean wasExecuted = false;          // Tracks whether the command has been executed

    /**
     * Constructor to initialize the command with a vehicle list and the vehicle to add.
     *
     * @param vehicles the list of transport vehicles
     * @param vehicle the vehicle to add
     */
    public AddVehicleCommand(List<TransportVehicle> vehicles, TransportVehicle vehicle) {
        this.vehicles = vehicles;
        this.vehicle = vehicle;
    }

    /**
     * Executes the command: adds the vehicle to the list.
     */
    @Override
    public void execute() {
        vehicles.add(vehicle);
        wasExecuted = true;
        System.out.println("Vehicle added: " + vehicle.getCompanyName() + " (" + vehicle.getVehicleType() + ")");
    }

    /**
     * Undoes the command: removes the vehicle from the list if it was added.
     */
    @Override
    public void undo() {
        if (wasExecuted && vehicles.contains(vehicle)) {
            vehicles.remove(vehicle);
            System.out.println("Vehicle addition has been undone.");
            wasExecuted = false;
        }
    }

    /**
     * Returns a textual description of the command for logging or history purposes.
     *
     * @return a string describing the vehicle addition
     */
    @Override
    public String getDescription() {
        return "Vehicle add: " + vehicle.getCompanyName() + " (" + vehicle.getVehicleType() + ")";
    }
}