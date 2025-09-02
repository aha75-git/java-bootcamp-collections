package org.example.bootcamp.collections;

import java.util.Objects;

public class Kurs {
    private String kursname, dozent, raum;

    public Kurs(String kursname, String dozent, String raum) {
        this.kursname = kursname;
        this.dozent = dozent;
        this.raum = raum;
    }

    public String getKursname() {
        return kursname;
    }

    public void setKursname(String kursname) {
        this.kursname = kursname;
    }

    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    @Override
    public String toString() {
        return "Kurs {" +
                "Kursname='" + kursname + '\'' +
                ", Dozent='" + dozent + '\'' +
                ", Raum='" + raum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kurs kurs = (Kurs) o;
        return Objects.equals(kursname, kurs.kursname) && Objects.equals(dozent, kurs.dozent) && Objects.equals(raum, kurs.raum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kursname, dozent, raum);
    }
}
