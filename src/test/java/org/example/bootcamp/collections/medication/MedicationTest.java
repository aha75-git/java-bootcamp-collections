package org.example.bootcamp.collections.medication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicationTest {
    private Medication medication;

    @BeforeEach
    void setUp() {
        medication = new Medication("Paracetamol", 5.99, true);
    }

    @Test
    void testGetName() {
        assertEquals("Paracetamol", medication.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(5.99, medication.getPrice(), 0);
    }

    @Test
    void testIsAvailable() {
        assertTrue(medication.isAvailable());
    }
}