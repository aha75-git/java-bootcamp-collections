package org.example.bootcamp.collections.bonus;

public class BonusMain {
    public static void main(String[] args) {
        Sack sack = new Sack();
        sack.add(1);
        sack.add(2);
        sack.add(3);
        sack.add(4);
        sack.add(15);
        sack.add(16);
        sack.add(33);

        sack.printElements();
        System.out.println();

        System.out.println("Size: " + sack.size());
        System.out.println("Element am index 1: " + sack.get(1));
        System.out.println();

        System.out.println("Das letzte Element : " + sack.get(sack.size() - 1));
        sack.removeLast();
        System.out.println("Size nach dem Löschen des letzten Elementes: " + sack.size());
        System.out.println("Das letzte Element : " + sack.get(sack.size() - 1));
        System.out.println();

        System.out.println("Das Element am index 3: " + sack.get(3)); // 4
        sack.remove(3);
        System.out.println("Size nach dem Löschen am index 3: " + sack.size());
        System.out.println("Das Element am index 3: " + sack.get(3)); // 15
        System.out.println();

        sack.printElements();
        System.out.println();

        System.out.println("Element am index 2: " + sack.get(2));
        sack.add(2, 66);
        System.out.println("Size: " + sack.size());
        System.out.println("Element am index 2: " + sack.get(2));
        System.out.println();
        sack.add(6, 55);
        System.out.println("Size: " + sack.size());
        System.out.println("Element am index 6: " + sack.get(6));

        sack.printElements();
        System.out.println();
    }
}
