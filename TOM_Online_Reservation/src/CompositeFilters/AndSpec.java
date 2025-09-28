package CompositeFilters;

import VoyageModels.Voyage;
import java.util.List;

/**
 * AndSpec is a composite specification that combines multiple VoyageSpecifications.
 * A voyage must satisfy all given specifications to be accepted.
 * 
 * This class applies the AND logic in the Specification design pattern.
 */
public class AndSpec implements VoyageSpecification {

    private List<VoyageSpecification> specs; // List of specifications to be checked

    /**
     * Constructs an AndSpec with a list of specifications to combine.
     *
     * @param specs the list of VoyageSpecifications
     */
    public AndSpec(List<VoyageSpecification> specs) {
        this.specs = specs;
    }

    /**
     * Checks if the given voyage satisfies all specifications in the list.
     *
     * @param voyage the voyage to check
     * @return true if the voyage satisfies all specs; false otherwise
     */
    @Override
    public boolean isSatisfiedBy(Voyage voyage) {
        for (VoyageSpecification spec : specs) {
            if (!spec.isSatisfiedBy(voyage)) {
                return false; // If any spec fails, return false
            }
        }
        return true; // All specs passed
    }
}