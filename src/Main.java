import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mission to Mars Simulation\n");
        Simulation simulation = new Simulation();

        try {
            // Load phase-1 items
            ArrayList<Item> u1Items = simulation.loadItems("phase-1.txt");
            // Load U1 rockets
            ArrayList<Rocket> u1Rockets = simulation.loadU1(u1Items);
            // Run U1 simulation
            Integer u1TotalBudget = simulation.runSimulation(u1Rockets);
            // Print U1 total budget
            System.out.println("U1 total budget: " + u1TotalBudget);

            // Load phase-2 items
            ArrayList<Item> u2Items = simulation.loadItems("phase-2.txt");
            // Load U2 rockets
            ArrayList<Rocket> u2Rockets = simulation.loadU2(u2Items);
            // Run U2 simulation
            Integer u2TotalBudget = simulation.runSimulation(u2Rockets);
            // Print U2 total budget
            System.out.println("U2 total budget: " + u2TotalBudget);

        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
