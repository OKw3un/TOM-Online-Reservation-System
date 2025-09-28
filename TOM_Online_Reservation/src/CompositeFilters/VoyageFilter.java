package CompositeFilters;

import java.util.*;
import VoyageModels.Voyage;

/**
 * The VoyageFilter class provides functionality to filter voyages
 * based on a specified criterion.
 */
public class VoyageFilter {

    /**
     * Filters the provided voyages using the given specification.
     *
     * @param voyages An iterable collection of Voyage objects.
     * @param spec    A VoyageSpecification that defines the filtering criteria.
     * @return A list of voyages that satisfy the provided specification.
     */
    public List<Voyage> filter(Iterable<Voyage> voyages, VoyageSpecification spec) {
        List<Voyage> result = new ArrayList<>(); // List to store voyages that match the specification.
        for (Voyage voyage : voyages) {          // Iterate over each voyage in the provided collection.
            if (spec.isSatisfiedBy(voyage)) {      // Check if the voyage meets the specification criteria.
                result.add(voyage);              // If it does, add it to the result list.
            }
        }
        return result; // Return the list of filtered voyages.
    }
}
