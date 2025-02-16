// Testlauf.java
package de.iu.require4testing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Testlauf")
public class Testlauf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private Date startdatum;
    private Date enddatum;

    // Konstruktor
    public Testlauf() {}

    public Testlauf(String name, Date startdatum, Date enddatum) {
        this.name = name;
        this.startdatum = startdatum;
        this.enddatum = enddatum;
    }

    // Getter und Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(Date startdatum) {
        this.startdatum = startdatum;
    }

    public Date getEnddatum() {
        return enddatum;
    }

    public void setEnddatum(Date enddatum) {
        this.enddatum = enddatum;
    }
}
