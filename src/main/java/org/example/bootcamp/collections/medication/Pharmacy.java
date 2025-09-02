package org.example.bootcamp.collections.medication;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medicationMap;

    public Pharmacy() {
        this.medicationMap = new HashMap<>();
    }

    public int getCount() {
        return medicationMap.size();
    }

    public void save(Medication medication) {
        this.medicationMap.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return this.medicationMap.get(medicationName);
    }

    public void delete(String medicationName) {
        this.medicationMap.remove(medicationName);
    }

    public void printMedications() {
        for (Medication medication : this.medicationMap.values()) {
            String availability = medication.isAvailable() ? "ist verfügbar" : "ist nicht verfügbar";
            System.out.println(medication.getName() + " vom Preis " + medication.getPrice() + " "  + availability);
        }
    }
}
