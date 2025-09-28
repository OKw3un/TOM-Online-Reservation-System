package Commands;

import Singleton.VoyageList;
import VoyageModels.Voyage;

/**
 * AddVoyageCommand implements the Command pattern to add a Voyage
 * to a VoyageList. This action can also be undone.
 */
public class AddVoyageCommand implements Command {

    private VoyageList voyageList;   // The list where the voyage will be added
    private Voyage voyage;           // The voyage to be added
    private boolean wasExecuted = false;  // Tracks whether the command has been executed

    /**
     * Constructs a command to add a voyage to the given voyage list.
     *
     * @param voyageList the target voyage list
     * @param voyage the voyage to add
     */
    public AddVoyageCommand(VoyageList voyageList, Voyage voyage) {
        this.voyageList = voyageList;
        this.voyage = voyage;
    }

    /**
     * Executes the command by adding the voyage to the list.
     */
    @Override
    public void execute() {
        voyageList.addVoyage(voyage);
        wasExecuted = true;
        System.out.println("Voyage has been added: " + voyage.getOrigin() + " -> " + voyage.getDestination());
    }

    /**
     * Undoes the command by removing the voyage if it was previously added.
     */
    @Override
    public void undo() {
        if (wasExecuted) {
            voyageList.removeVoyage(voyage);
            System.out.println("Voyage addition has been undone.");
            wasExecuted = false;
        }
    }

    /**
     * Provides a textual description of this command.
     *
     * @return a string describing the voyage that was added
     */
    @Override
    public String getDescription() {
        return "Voyage add: " + voyage.getOrigin() + " -> " + voyage.getDestination();
    }
}