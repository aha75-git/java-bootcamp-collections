package org.example.bootcamp.collections.bonus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SackTest {
    private Sack sack;

    @BeforeEach
    void setUp() {
        sack = new Sack();
    }

    @Test
    void testAddAndSize() {
        sack.add(2);
        sack.add(3);
        sack.add(4);
        sack.add(5);
        assertEquals(4, sack.size());
    }

    @Test
    void testAddByIndexAndSize() {
        sack.add(2);
        sack.add(3);
        sack.add(4);
        sack.add(5);
        assertEquals(4, sack.size());
        assertEquals(4, sack.get(2));

        sack.add(2, 66);
        assertEquals(5, sack.size());
        assertEquals(66, sack.get(2));
        assertEquals(4, sack.get(3));
        assertEquals(5, sack.get(4));

        sack.add(5, 55);
        assertEquals(6, sack.size());
        assertEquals(55, sack.get(5));

        sack.add(0, 1);
        assertEquals(7, sack.size());
        assertEquals(1, sack.get(0));
        assertEquals(55, sack.get(6));
    }

    @Test
    void testGet() {
        sack.add(2);
        sack.add(3);
        sack.add(4);
        sack.add(5);
        sack.add(1);
        assertEquals(3, sack.get(1));
        assertEquals(1, sack.get(4));
        assertEquals(2, sack.get(0));
    }

    @Test
    void testRemove() {
        sack.add(2); //
        sack.add(3);
        sack.add(4);
        sack.add(5); //
        sack.add(1); //

        assertEquals(5, sack.size());
        sack.remove(3);
        assertEquals(4, sack.size());
        assertEquals(1, sack.get(3));

        sack.remove(0);
        assertEquals(3, sack.size());
        assertEquals(3, sack.get(0));

        sack.remove(2);
        assertEquals(2, sack.size());
        assertEquals(4, sack.get(1));
    }

    @Test
    void testRemoveLast() {
        sack.add(2);
        sack.add(3);
        sack.add(4);
        sack.add(5);
        sack.add(1);

        assertEquals(5, sack.size());
        assertEquals(1, sack.get(4));
        sack.removeLast();
        assertEquals(4, sack.size());
        assertEquals(5, sack.get(3));
        sack.removeLast();
        assertEquals(3, sack.size());
        assertEquals(4, sack.get(2));
    }

    @Test
    void testRemoveInvalidIndex() {
        sack.add(2);
        sack.add(3);
        assertThrows(IndexOutOfBoundsException.class, () -> sack.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> sack.remove(2));
    }

    @Test
    void testRemoveLastEmpty() {
        assertThrows(IndexOutOfBoundsException.class, () -> sack.removeLast());
    }

    @Test
    void testPrintElements() {
        sack.add(1);
        sack.add(2);
        sack.add(3);
        sack.printElements();
    }
}