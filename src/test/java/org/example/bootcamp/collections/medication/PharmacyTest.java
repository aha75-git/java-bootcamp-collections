package org.example.bootcamp.collections.medication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PharmacyTest {

    private Pharmacy pharmacy;

    @BeforeEach
    void setUp() {
        pharmacy = new Pharmacy();
    }

    @Test
    void testSaveAndGetCount() {
        Medication med1 = new Medication("Paracetamol", 5.99, true);
        Medication med2 = new Medication("Ibuprofen", 7.49, false);
        pharmacy.save(med1);
        pharmacy.save(med2);
        assertEquals(2, pharmacy.getCount());
    }

    @Test
    void testFindExistingMedication() {
        Medication med1 = new Medication("Paracetamol", 5.99, true);
        Medication med2 = new Medication("Ibuprofen", 7.49, false);
        pharmacy.save(med1);
        pharmacy.save(med2);

        Medication foundMedication = pharmacy.find("Paracetamol");
        assertNotNull(foundMedication);
        assertEquals("Paracetamol", foundMedication.getName());
    }

    @Test
    void testFindNotExistingMedication() {
        Medication med1 = new Medication("Paracetamol", 5.99, true);
        pharmacy.save(med1);

        Medication foundMedication = pharmacy.find("Ibuprofen");
        assertNull(foundMedication);
    }


    @Test
    void testDelete() {
        Medication med1 = new Medication("Paracetamol", 5.99, true);
        Medication med2 = new Medication("Ibuprofen", 7.49, false);
        pharmacy.save(med1);
        pharmacy.save(med2);
        assertEquals(2, pharmacy.getCount());

        pharmacy.delete("Ibuprofen");
        assertEquals(1, pharmacy.getCount());

        pharmacy.delete("Paracetamol");
        assertEquals(0, pharmacy.getCount());
    }

    @Test
    void testPrintMedications() {
        Medication med1 = new Medication("Paracetamol", 5.99, true);
        Medication med2 = new Medication("Ibuprofen", 7.49, false);

        pharmacy.save(med1);
        pharmacy.save(med2);

        pharmacy.printMedications();
    }
}