package CompositeFilters;

import VoyageModels.Voyage;

/**
 * ✅ VoyageSpecification interface represents a contract for defining
 * criteria that a Voyage object must meet.
 *
 * It is used in combination with the Specification design pattern
 * to allow flexible and reusable filtering logic.
 */
public interface VoyageSpecification {

    /**
     * Checks if a given Voyage satisfies the specification criteria.
     *
     * @param voyage The Voyage object to evaluate.
     * @return true if the voyage meets the condition; false otherwise.
     */
    boolean isSatisfiedBy(Voyage voyage);
}
