// TestlaufBean.java
package de.iu.require4testing.beans;

import de.iu.require4testing.entities.Testlauf;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.Date;

@Named
@SessionScoped
public class TestlaufBean implements Serializable {

    private String name;
    private Date startdatum;
    private Date enddatum;

    @PersistenceContext
    private EntityManager em;

    public void save() {
        Testlauf testlauf = new Testlauf(name, startdatum, enddatum);
        em.persist(testlauf);
        name = null;
        startdatum = null;
        enddatum = null;
    }

    // Getter und Setter
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
