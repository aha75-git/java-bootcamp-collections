package org.example.bootcamp.collections.bonus;

public class BeutelMain {
    public static void main(String[] args) {

        Beutel beutel = new Beutel();
        beutel.add(1);
        beutel.add(2);
        beutel.add(3);
        beutel.add(4);
        beutel.add(15);
        beutel.add(16);
        beutel.add(33);

        beutel.printElements();
        System.out.println();

        System.out.println("Size: " + beutel.size());
        System.out.println("Element am index 1: " + beutel.get(1));
        System.out.println();

        System.out.println("Das letzte Element : " + beutel.get(beutel.size() - 1));
        beutel.removeLast();
        System.out.println("Size nach dem Löschen des letzten Elementes: " + beutel.size());
        System.out.println("Das letzte Element : " + beutel.get(beutel.size() - 1));
        beutel.printElements();
        System.out.println();

        System.out.println("Das Element am index 3: " + beutel.get(3)); // 4
        beutel.remove(3);
        System.out.println("Size nach dem Löschen am index 3: " + beutel.size());
        System.out.println("Das Element am index 3: " + beutel.get(3)); // 15
        System.out.println();

        beutel.printElements();
        System.out.println();

        System.out.println("Element am index 2: " + beutel.get(2));
        beutel.add(66);
        System.out.println("Size: " + beutel.size());
        System.out.println();
        beutel.add(55);
        System.out.println("Size: " + beutel.size());
        System.out.println("Element am index 6: " + beutel.get(6));

        beutel.printElements();
        System.out.println();
    }
}
