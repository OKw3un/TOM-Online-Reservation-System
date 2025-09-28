package Singleton;

import VoyageModels.Voyage;
import java.util.*;

public class VoyageList implements Iterable<Voyage> {
    private static VoyageList instance;
    private List<Voyage> voyages = new ArrayList<>(); //Voyages list

    private VoyageList() {
        //To avoid creating objects from outside
    }

    public static synchronized VoyageList getInstance() { //To get instance of VoyageList. It is needed because we will have only one voyage list object.
        if (instance == null) {
            instance = new VoyageList();
        }
        return instance;
    }

    public void addVoyage(Voyage voyage) { 
        voyages.add(voyage);
    }

    public void removeVoyage(Voyage voyage) {
        voyages.remove(voyage);
    }

    public void removeAt(int index) {
        if (index >= 0 && index < voyages.size()) {
            voyages.remove(index);
        }
    }

    public Voyage getVoyageAt(int index) {
        if (index >= 0 && index < voyages.size()) {
            return voyages.get(index);
        }
        return null;
    }

    public int size() {
        return voyages.size();
    }

    @Override
    public Iterator<Voyage> iterator() {
        return voyages.iterator();
    }
}
