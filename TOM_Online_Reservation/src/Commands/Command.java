package Commands;

/**
 * Command interface defines a contract for executing operations,
 * undoing them, and providing a textual description.
 *
 * This interface is a part of the Command design pattern,
 * which encapsulates a request as an object.
 */
public interface Command {

    /**
     * Executes the command.
     */
    void execute();

    /**
     * Undoes the command, reverting the changes made by execute().
     */
    void undo();

    /**
     * Returns a description of the command, typically used for logging or history display.
     *
     * @return a string describing the command
     */
    String getDescription();
}