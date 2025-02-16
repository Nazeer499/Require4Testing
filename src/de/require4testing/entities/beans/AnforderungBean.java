// AnforderungBean.java
package de.iu.require4testing.beans;

import de.iu.require4testing.entities.Anforderung;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class AnforderungBean implements Serializable {

    private String titel;
    private String beschreibung;

    @PersistenceContext
    private EntityManager em;

    public List<Anforderung> getAnforderungen() {
        return em.createQuery("SELECT a FROM Anforderung a", Anforderung.class).getResultList();
    }

    public void save() {
        Anforderung anforderung = new Anforderung(titel, beschreibung);
        em.persist(anforderung);
        titel = null;
        beschreibung = null;
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
}
