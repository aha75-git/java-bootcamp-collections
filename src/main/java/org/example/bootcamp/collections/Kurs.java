package org.example.bootcamp.collections;

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
}
