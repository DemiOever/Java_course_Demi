package section2_syntax.part5_zoo;

import java.util.List;

public class ZooApp {

    public static void main(String[] args) {
        ZooApp zooApp = new ZooApp();
        zooApp.processZooData(args);
        zooApp.printZooSummary();
    }

    /**
     * Processes the command line data.
     * @param args
     */
    void processZooData(String[] args) {
        for (String animal : args) {
            ZooSpecies.registerSpeciesFromString(animal);
        }
    }

    /**
     * Prints a summary of the zoo.
     */
    void printZooSummary() {
        final List<ZooSpecies> allSpecies = ZooSpecies.getAllSpecies(); //YOUR CODE HERE; fetch all species
        System.out.println("allSpecies = " + allSpecies);
        for (ZooSpecies species : allSpecies) {
            System.out.println("Species: " + species.getSpeciesName() + ", Count: " + species.getIndividualCount());
        }
    }
}
