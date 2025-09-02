package org.example.bootcamp.collections.medication;

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        pharmacy.save(new Medication("Paracetamol", 5.99, true));
        pharmacy.save(new Medication("Active Kohle", 6.99, true));
        pharmacy.save(new Medication("Ibuprofen", 7.49, false));

        System.out.println("Anzahl der Medikamente: " + pharmacy.getCount());

        Medication medication = pharmacy.find("Paracetamol");
        if (medication != null) {
            System.out.println("Das gefundene Medikament: " + medication.getName());
        } else  {
            System.out.println("Das Medikament nicht gefunden");
        }

        System.out.println();
        pharmacy.printMedications();
        System.out.println();

        pharmacy.delete("Ibuprofen");
        System.out.println("Anzahl der Medikamente: " + pharmacy.getCount());
        pharmacy.printMedications();
    }
}
