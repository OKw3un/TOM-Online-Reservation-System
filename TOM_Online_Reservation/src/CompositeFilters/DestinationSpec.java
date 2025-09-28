package CompositeFilters;

import VoyageModels.Voyage;

/**
 * DestinationSpec is a specification that checks whether a Voyage's
 * destination matches a specified value.
 * 
 * It is used as part of the Specification design pattern to allow
 * flexible filtering of voyages based on destination.
 */
public class DestinationSpec implements VoyageSpecification {

    private String destination; // The destination to filter by

    /**
     * Constructs a DestinationSpec with the given destination.
     *
     * @param destination the target destination to match
     */
    public DestinationSpec(String destination) {
        this.destination = destination;
    }

    /**
     * Checks if the voyage's destination matches the specified destination.
     *
     * @param voyage the voyage to evaluate
     * @return true if the destination matches; false otherwise
     */
    @Override
    public boolean isSatisfiedBy(Voyage voyage) {
        return voyage.getDestination().equalsIgnoreCase(destination);
    }
}