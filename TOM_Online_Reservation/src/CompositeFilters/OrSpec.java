package CompositeFilters;

import VoyageModels.Voyage;

/**
 * OrSpec is a composite specification that represents the logical OR of two
 * VoyageSpecifications. A voyage satisfies this specification if it satisfies
 * at least one of the two contained specifications.
 */
public class OrSpec implements VoyageSpecification {

    private VoyageSpecification spec1; // First specification to evaluate
    private VoyageSpecification spec2; // Second specification to evaluate

    /**
     * Constructs an OrSpec with two specifications.
     *
     * @param spec1 the first specification
     * @param spec2 the second specification
     */
    public OrSpec(VoyageSpecification spec1, VoyageSpecification spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    /**
     * Checks if the voyage satisfies at least one of the two specifications.
     *
     * @param voyage the voyage to check
     * @return true if either spec1 or spec2 is satisfied; false otherwise
     */
    @Override
    public boolean isSatisfiedBy(Voyage voyage) {
        return spec1.isSatisfiedBy(voyage) || spec2.isSatisfiedBy(voyage);
    }
}