package pl.StrongSoft.data.jpa.domain.entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author jarek
 */
@Entity
@Table(name = "pracownik_adres")
@Data
@NamedQueries({
    @NamedQuery(name = "PracownikAdres.findAll", query = "SELECT p FROM PracownikAdres p")
    , @NamedQuery(name = "PracownikAdres.findByPracownikAdresId", query = "SELECT p FROM PracownikAdres p WHERE p.pracownikAdresId = :pracownikAdresId")
    , @NamedQuery(name = "PracownikAdres.findByUlica", query = "SELECT p FROM PracownikAdres p WHERE p.ulica = :ulica")
    , @NamedQuery(name = "PracownikAdres.findByNrDomu", query = "SELECT p FROM PracownikAdres p WHERE p.nrDomu = :nrDomu")
    , @NamedQuery(name = "PracownikAdres.findByNrMieszkania", query = "SELECT p FROM PracownikAdres p WHERE p.nrMieszkania = :nrMieszkania")
    , @NamedQuery(name = "PracownikAdres.findByKodPocztowy", query = "SELECT p FROM PracownikAdres p WHERE p.kodPocztowy = :kodPocztowy")
    , @NamedQuery(name = "PracownikAdres.findByMiasto", query = "SELECT p FROM PracownikAdres p WHERE p.miasto = :miasto")
    , @NamedQuery(name = "PracownikAdres.findByPanstwo", query = "SELECT p FROM PracownikAdres p WHERE p.panstwo = :panstwo")})
public class PracownikAdres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pracownik_adres_id")
    private Integer pracownikAdresId;
    @Column(name = "ulica")
    private String ulica;
    @Column(name = "nr_domu")
    private String nrDomu;
    @Column(name = "nr_mieszkania")
    private String nrMieszkania;
    @Column(name = "kod_pocztowy")
    private String kodPocztowy;
    @Column(name = "miasto")
    private String miasto;
    @Column(name = "panstwo")
    private String panstwo;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pracownikAdresId != null ? pracownikAdresId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PracownikAdres)) {
            return false;
        }
        PracownikAdres other = (PracownikAdres) object;
        if ((this.pracownikAdresId == null && other.pracownikAdresId != null) || (this.pracownikAdresId != null && !this.pracownikAdresId.equals(other.pracownikAdresId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.StrongSoft.data.jpa.domain.entities.PracownikAdres[ pracownikAdresId=" + pracownikAdresId + " ]";
    }

}
