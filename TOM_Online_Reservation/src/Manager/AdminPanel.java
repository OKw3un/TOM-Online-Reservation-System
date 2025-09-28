package Manager;

import java.util.Stack;
import Commands.Command;

/**
 * AdminPanel class represents a Singleton command manager that allows executing,
 * undoing, and tracking commands using the Command design pattern.
 */
public class AdminPanel {
    // Singleton instance
    private static AdminPanel instance;

    // Stack to keep the history of executed commands
    private Stack<Command> commandHistory = new Stack<>();

    // Private constructor to prevent external instantiation
    private AdminPanel() {}

    /**
     * Singleton access method
     * Ensures only one instance of AdminPanel is created and reused.
     * @return the single instance of AdminPanel
     */
    public static synchronized AdminPanel getInstance() {
        if (instance == null) {
            instance = new AdminPanel();
        }
        return instance;
    }

    /**
     * ▶Executes a command and stores it in history.
     * @param command the Command object to execute
     */
    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command); // Save for possible undo
    }

    /**
     * Undoes the last executed command, if any.
     */
    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo(); // Reverse the command
        } else {
            System.out.println("No operation to undo.");
        }
    }

    /**
     * Displays the history of executed commands.
     */
    public void showCommandHistory() {
        if (commandHistory.isEmpty()) {
            System.out.println("Command history is empty.");
        } else {
            System.out.println("Command History:");
            for (Command cmd : commandHistory) {
                System.out.println("- " + cmd.getDescription()); // Print command description
            }
        }
    }
}
