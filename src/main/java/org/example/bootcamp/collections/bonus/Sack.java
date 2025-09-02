package org.example.bootcamp.collections.bonus;

public class Sack {
    private int[] elements = new int[10];
    private int size = 0;

    // Implementiere Schritt für Schritt die Methoden add, get, size, remove last, remove by index und so weiter.

    public void add(int element) {
        if(this.size == this.elements.length) {
            resize();
        }
        this.elements[this.size] = element;
        this.size++;
    }

    public void add(int index, int element) {
        if(index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if(this.size == index) {
            this.add(element);
            return;
        }
        if(this.size == this.elements.length) {
            resize();
        }

        int[] iClone = new int[this.size];
        System.arraycopy(this.elements, index, iClone, 0, this.size);
        this.elements[index] = element;
        this.size++;
        System.arraycopy(iClone, 0, this.elements, index+1, iClone.length);
    }

    public int get(int index) {
        if(index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return this.elements[index];
    }

    public int size() {
        return this.size;
    }

    public void remove(int index) {
        if(index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds: " + index);
        }

        for(int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[this.size - 1] = 0;
        this.size--;
    }

    public void removeLast() {
        if(this.size == 0) {
            throw new ArrayIndexOutOfBoundsException("Size is zero");
        }
        this.elements[this.size - 1] = 0;
        this.size--;
    }

    private void resize() {
        int newCapacity = this.elements.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(this.elements, 0, newArray, 0, this.elements.length);
        this.elements = newArray;
    }

    public void printElements() {
        for(int i = 0; i < this.size; i++) {
            System.out.print(this.elements[i] + " ");
        }
    }
}
