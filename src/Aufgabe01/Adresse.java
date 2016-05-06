package Aufgabe01;

/**
 * Created by chris on 26.04.16.
 */
public class Adresse {
    private String strasse;
    private int hausnummer;
    private int plz;
    private String ort;
    private String land;


    // Konstruktoren
    public Adresse(String strasse, int hausnummer, int plz, String ort, String land){
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
    }

    // Get und Set Methoden
    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    // Override Methoden
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj.getClass() != getClass()){
            return false;
        }

        Adresse other = (Adresse) obj;

        if(this.strasse.equals(other.strasse) && this.land.equals(other.land) && this.hausnummer == other.hausnummer && this.plz == other.plz ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = strasse != null ? strasse.hashCode() : 0;
        result = 31 * result + hausnummer;
        result = 31 * result + plz;
        result = 31 * result + (land != null ? land.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                ", plz=" + plz +
                ", land='" + land + '\'' +
                '}';
    }
}
