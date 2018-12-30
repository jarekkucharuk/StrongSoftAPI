package pl.StrongSoft.data.jpa.domain.entities;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author jarek
 */
@Entity
@Table(name = "pracownik")
@NamedQueries({
    @NamedQuery(name = "Pracownik.findAll", query = "SELECT p FROM Pracownik p")
    , @NamedQuery(name = "Pracownik.findByPracownikId", query = "SELECT p FROM Pracownik p WHERE p.pracownikId = :pracownikId")
    , @NamedQuery(name = "Pracownik.findByImie", query = "SELECT p FROM Pracownik p WHERE p.imie = :imie")
    , @NamedQuery(name = "Pracownik.findByNazwisko", query = "SELECT p FROM Pracownik p WHERE p.nazwisko = :nazwisko")
    , @NamedQuery(name = "Pracownik.findByEmail", query = "SELECT p FROM Pracownik p WHERE p.email = :email")})
public class Pracownik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pracownik_id")
    private Integer pracownikId;
    @Basic(optional = false)
    @Column(name = "imie")
    private String imie;
    @Basic(optional = false)
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "pracownik_adres", referencedColumnName = "pracownik_adres_id")
    @OneToOne(optional = false)
    private PracownikAdres pracownikAdres;

    public Pracownik() {
    }

    public Pracownik(Integer pracownikId) {
        this.pracownikId = pracownikId;
    }

    public Pracownik(Integer pracownikId, String imie, String nazwisko) {
        this.pracownikId = pracownikId;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Integer getPracownikId() {
        return pracownikId;
    }

    public void setPracownikId(Integer pracownikId) {
        this.pracownikId = pracownikId;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PracownikAdres getPracownikAdres() {
        return pracownikAdres;
    }

    public void setPracownikAdres(PracownikAdres pracownikAdres) {
        this.pracownikAdres = pracownikAdres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pracownikId != null ? pracownikId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pracownik)) {
            return false;
        }
        Pracownik other = (Pracownik) object;
        if ((this.pracownikId == null && other.pracownikId != null) || (this.pracownikId != null && !this.pracownikId.equals(other.pracownikId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.StrongSoft.data.jpa.domain.entities.Pracownik[ pracownikId=" + pracownikId + " ]";
    }
}
