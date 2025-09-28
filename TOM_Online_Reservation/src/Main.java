import VoyageModels.FlightVoyage;
import VoyageModels.BusVoyage;
import Commands.AddVoyageCommand;
import Commands.Command;
import Manager.*;
import Singleton.*;
import VoyageModels.Voyage;
import GUI.WelcomeScreen;
/**
 * Main class serves as the entry point of the application.
 * It demonstrates the use of Singleton, Command, and GUI initialization.
 */
public class Main {
    public static void main(String[] args) {
        // Get singleton instances
        VoyageList voyageList = VoyageList.getInstance();
        AdminPanel adminPanel = AdminPanel.getInstance();
        AuthenticationManager auth = AuthenticationManager.getInstance();

        // Register sample users (normal and admin)
        auth.register("orçun", "alver", "1234", "11.01.2002", "orcun@hotmail.com", "normal");
        auth.register("admin1", "adminhesap", "adminpass", "15.23.2003", "admin@gmail.com", "admin");
        auth.register("melis", "çakan", "1234", "11.01.2002", "melis@gmail.com", "normal");

        // Create voyage objects (bus and flight)
        Voyage voyage = new BusVoyage("İzmir", "Ankara", "11.02.2021", "17.30", "Bus", "45789");
        Voyage voyage2 = new FlightVoyage("İzmir", "Uşak", "11.02.2021", "15.00", "Plane", "12345");
        Voyage voyage3 = new FlightVoyage("Bursa", "Ankara", "15.02.2020", "13.00", "Plane", "78998");

        // Create command objects to add voyages
        Command addVoyageCommand = new AddVoyageCommand(voyageList, voyage);
        Command addVoyageCommand2 = new AddVoyageCommand(voyageList, voyage2);
        Command addVoyageCommand3 = new AddVoyageCommand(voyageList, voyage3);

        // ▶Execute commands via AdminPanel (command pattern)
        adminPanel.executeCommand(addVoyageCommand);
        adminPanel.executeCommand(addVoyageCommand2);
        adminPanel.executeCommand(addVoyageCommand3);
        

        // 🖥Launch the GUI on the Event Dispatch Thread (EDT)
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });
    }
}
