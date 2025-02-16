// TestfallBean.java
package de.iu.require4testing.beans;

import de.iu.require4testing.entities.Testfall;
import de.iu.require4testing.entities.Anforderung;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@SessionScoped
public class TestfallBean implements Serializable {

    private String titel;
    private String beschreibung;
    private Anforderung anforderung;

    @PersistenceContext
    private EntityManager em;

    public void save() {
        Testfall testfall = new Testfall(titel, beschreibung, anforderung);
        em.persist(testfall);
        titel = null;
        beschreibung = null;
        anforderung = null;
    }

    // Getter und Setter
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Anforderung getAnforderung() {
        return anforderung;
    }

    public void setAnforderung(Anforderung anforderung) {
        this.anforderung = anforderung;
    }
}
