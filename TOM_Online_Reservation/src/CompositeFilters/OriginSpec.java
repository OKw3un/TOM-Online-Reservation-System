package CompositeFilters;

import VoyageModels.Voyage;

/**
 * OriginSpec is a specification that checks whether a Voyage's
 * origin matches a specified value.
 * 
 * This class is part of the Specification design pattern
 * for flexible filtering based on voyage origin.
 */
public class OriginSpec implements VoyageSpecification {

    private String origin; // The origin location to filter by

    /**
     * Constructs an OriginSpec with the specified origin.
     *
     * @param origin the origin to match
     */
    public OriginSpec(String origin) {
        this.origin = origin;
    }

    /**
     * Checks if the voyage's origin matches the specified origin.
     *
     * @param voyage the voyage to evaluate
     * @return true if the origin matches; false otherwise
     */
    @Override
    public boolean isSatisfiedBy(Voyage voyage) {
        return voyage.getOrigin().equalsIgnoreCase(origin);
    }
}