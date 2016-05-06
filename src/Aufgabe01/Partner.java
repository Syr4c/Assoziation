package Aufgabe01;

import java.util.Date;

/**
 *
 */
public class Partner {
    private String name;
    private String vorname;
    private Date geburtsdatum;

    // Konstruktoren
    public Partner(String name, String vorname, Date geburtsdatum){
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
    }

    public Partner(String name, String vorname){
        this.name = name;
        this.vorname = vorname;
    }

    // Get und Set Methoden
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getVorname(){
        return vorname;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public Date getGeburtsdatum(){
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum){
        this.geburtsdatum = geburtsdatum;
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
        Partner other = (Partner) obj;

        if(this.name.equals(other.name) && this.vorname.equals(other.vorname) && this.geburtsdatum.equals(other.geburtsdatum)){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (vorname != null ? vorname.hashCode() : 0);
        result = 31 * result + (geburtsdatum != null ? geburtsdatum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Partner{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                '}';
    }
}
