import java.util.ArrayList;
import java.io.File;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(String sourceFile) throws Exception {
        File file = new File(sourceFile);
        Scanner scanner = new Scanner(file);
        ArrayList<Item> items = new ArrayList<Item>();

        while(scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("=");

            if(line.length != 2) {
                throw new InvalidPropertiesFormatException("Invalid line format in a supplied file!");
            }

            Item item = new Item(line[0], Integer.parseInt(line[1]));
            items.add(item);
        }

        System.out.println("items: " + items);

        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1Rockets = new ArrayList<Rocket>();
        U1 u1 = new U1();

        for (Item item : items) {
            if (!u1.canCarry(item)) {
                u1Rockets.add(u1);
                u1 = new U1();
            }
            u1.carry(item);
        }

        System.out.println("U1 rockets: " + u1Rockets);

        return u1Rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2Rockets = new ArrayList<Rocket>();
        U2 u2 = new U2();

        for (Item item : items) {
            if (!u2.canCarry(item)) {
                u2Rockets.add(u2);
                u2 = new U2();
            }
            u2.carry(item);
        }

        System.out.println("U2 rockets: " + u2Rockets);

        return u2Rockets;
    }

    public Integer runSimulation(ArrayList<Rocket> rockets) {
        Integer totalBudget = 0;
        Integer trial = 1;

        for (Rocket rocket : rockets) {
            while(!rocket.launch()) {
                trial++;
            }

            while(!rocket.land()) {
                trial++;
            }

            totalBudget += (trial * rocket.cost);
        }

        return totalBudget;
    }
}
