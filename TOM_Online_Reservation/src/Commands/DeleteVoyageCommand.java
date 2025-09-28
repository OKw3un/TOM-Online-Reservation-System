package Commands;

import Singleton.VoyageList;
import VoyageModels.Voyage;

/**
 * DeleteVoyageCommand implements the Command pattern to delete a Voyage
 * from a VoyageList. The deletion can also be undone.
 */
public class DeleteVoyageCommand implements Command {

    private VoyageList voyageList;         // The list from which the voyage will be removed
    private Voyage deletedVoyage;          // The voyage to be deleted
    private int originalIndex;             // The original index of the deleted voyage
    private boolean wasExecuted = false;   // Tracks whether the command has been executed

    /**
     * Constructs a DeleteVoyageCommand for a given voyage index.
     *
     * @param voyageList   the list of voyages
     * @param voyageIndex  the index of the voyage to delete
     */
    public DeleteVoyageCommand(VoyageList voyageList, int voyageIndex) {
        this.voyageList = voyageList;
        this.originalIndex = voyageIndex;
        this.deletedVoyage = voyageList.getVoyageAt(voyageIndex);
    }

    /**
     * Executes the command by removing the voyage at the specified index.
     */
    @Override
    public void execute() {
        if (deletedVoyage != null) {
            voyageList.removeAt(originalIndex);
            wasExecuted = true;
            System.out.println("Voyage has been deleted: " + deletedVoyage.getOrigin() + " -> " + deletedVoyage.getDestination());
        }
    }

    /**
     * Undoes the deletion by re-adding the voyage to the list.
     * Note: It is re-added to the end of the list, not its original position.
     */
    @Override
    public void undo() {
        if (wasExecuted && deletedVoyage != null) {
            voyageList.addVoyage(deletedVoyage);
            System.out.println("Voyage deletion has been undone.");
            wasExecuted = false;
        }
    }

    /**
     * Provides a description of the delete operation.
     *
     * @return a string describing the deleted voyage, or a message if invalid
     */
    @Override
    public String getDescription() {
        return deletedVoyage != null
                ? "Voyage deletion: " + deletedVoyage.getOrigin() + " -> " + deletedVoyage.getDestination()
                : "Invalid voyage deletion";
    }
}