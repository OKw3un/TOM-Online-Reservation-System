package CompositeFilters;

import VoyageModels.Voyage;

/**
 * DateAfterSpec is a specification that checks if a Voyage's date
 * matches the specified target date.
 * 
 * Note: Despite the class name suggesting a "date after" check,
 * this implementation currently checks for equality.
 */
public class DateSpec implements VoyageSpecification {

    private String date; // The target date to compare with

    /**
     * Constructs a DateAfterSpec with the given date string.
     *
     * @param date the date to compare voyages against
     */
    public DateSpec(String date) {
        this.date = date;
    }

    /**
     * Checks if the voyage's date is equal to the specified date.
     *
     * @param voyage the voyage to evaluate
     * @return true if dates match; false otherwise
     */
    @Override
    public boolean isSatisfiedBy(Voyage voyage) {
        return voyage.getDate().equalsIgnoreCase(date);
    }
}