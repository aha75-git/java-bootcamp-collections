package org.example.bootcamp.collections.bonus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeutelTest {

    private Beutel beutel;

    @BeforeEach
    void setUp() {
        beutel = new Beutel();
    }

    @Test
    void testAddAndSize() {
        beutel.add(2);
        beutel.add(3);
        beutel.add(4);
        beutel.add(5);
        assertEquals(4, beutel.size());
    }

    @Test
    void testGet() {
        beutel.add(2);
        beutel.add(3);
        beutel.add(4);
        beutel.add(5);
        beutel.add(1);
        assertEquals(3, beutel.get(1));
        assertEquals(1, beutel.get(4));
        assertEquals(2, beutel.get(0));
    }

    @Test
    void testRemove() {
        beutel.add(2); //
        beutel.add(3);
        beutel.add(4);
        beutel.add(5); //
        beutel.add(1); //

        assertEquals(5, beutel.size());
        beutel.remove(3);
        assertEquals(4, beutel.size());
        assertEquals(1, beutel.get(3));

        beutel.remove(0);
        assertEquals(3, beutel.size());
        assertEquals(3, beutel.get(0));

        beutel.remove(2);
        assertEquals(2, beutel.size());
        assertEquals(4, beutel.get(1));
    }

    @Test
    void testRemoveLast() {
        beutel.add(2);
        beutel.add(3);
        beutel.add(4);
        beutel.add(5);
        beutel.add(1);

        assertEquals(5, beutel.size());
        assertEquals(1, beutel.get(4));
        beutel.removeLast();
        assertEquals(4, beutel.size());
        assertEquals(5, beutel.get(3));
        beutel.removeLast();
        assertEquals(3, beutel.size());
        assertEquals(4, beutel.get(2));
    }

    @Test
    void testRemoveInvalidIndex() {
        beutel.add(2);
        beutel.add(3);
        assertThrows(IndexOutOfBoundsException.class, () -> beutel.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> beutel.remove(2));
    }

    @Test
    void testRemoveLastEmpty() {
        beutel.removeLast();
    }

    @Test
    void testPrintElements() {
        beutel.add(1);
        beutel.add(2);
        beutel.add(3);
        beutel.printElements();
    }
}