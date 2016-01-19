/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morrentalmobil;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mor
 */
@Entity
@Table(name = "mobil", catalog = "rental_mobil", schema = "")
@NamedQueries({
    @NamedQuery(name = "Mobil_1.findAll", query = "SELECT m FROM Mobil_1 m"),
    @NamedQuery(name = "Mobil_1.findByKodeMobil", query = "SELECT m FROM Mobil_1 m WHERE m.kodeMobil = :kodeMobil"),
    @NamedQuery(name = "Mobil_1.findByNamaMobil", query = "SELECT m FROM Mobil_1 m WHERE m.namaMobil = :namaMobil"),
    @NamedQuery(name = "Mobil_1.findByMerekMobil", query = "SELECT m FROM Mobil_1 m WHERE m.merekMobil = :merekMobil"),
    @NamedQuery(name = "Mobil_1.findByTahunMobil", query = "SELECT m FROM Mobil_1 m WHERE m.tahunMobil = :tahunMobil"),
    @NamedQuery(name = "Mobil_1.findByHargaSewa", query = "SELECT m FROM Mobil_1 m WHERE m.hargaSewa = :hargaSewa")})
public class Mobil_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_mobil")
    private Integer kodeMobil;
    @Basic(optional = false)
    @Column(name = "nama_mobil")
    private String namaMobil;
    @Basic(optional = false)
    @Column(name = "merek_mobil")
    private String merekMobil;
    @Basic(optional = false)
    @Column(name = "tahun_mobil")
    private int tahunMobil;
    @Basic(optional = false)
    @Column(name = "harga_sewa")
    private int hargaSewa;

    public Mobil_1() {
    }

    public Mobil_1(Integer kodeMobil) {
        this.kodeMobil = kodeMobil;
    }

    public Mobil_1(Integer kodeMobil, String namaMobil, String merekMobil, int tahunMobil, int hargaSewa) {
        this.kodeMobil = kodeMobil;
        this.namaMobil = namaMobil;
        this.merekMobil = merekMobil;
        this.tahunMobil = tahunMobil;
        this.hargaSewa = hargaSewa;
    }

    public Integer getKodeMobil() {
        return kodeMobil;
    }

    public void setKodeMobil(Integer kodeMobil) {
        Integer oldKodeMobil = this.kodeMobil;
        this.kodeMobil = kodeMobil;
        changeSupport.firePropertyChange("kodeMobil", oldKodeMobil, kodeMobil);
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        String oldNamaMobil = this.namaMobil;
        this.namaMobil = namaMobil;
        changeSupport.firePropertyChange("namaMobil", oldNamaMobil, namaMobil);
    }

    public String getMerekMobil() {
        return merekMobil;
    }

    public void setMerekMobil(String merekMobil) {
        String oldMerekMobil = this.merekMobil;
        this.merekMobil = merekMobil;
        changeSupport.firePropertyChange("merekMobil", oldMerekMobil, merekMobil);
    }

    public int getTahunMobil() {
        return tahunMobil;
    }

    public void setTahunMobil(int tahunMobil) {
        int oldTahunMobil = this.tahunMobil;
        this.tahunMobil = tahunMobil;
        changeSupport.firePropertyChange("tahunMobil", oldTahunMobil, tahunMobil);
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        int oldHargaSewa = this.hargaSewa;
        this.hargaSewa = hargaSewa;
        changeSupport.firePropertyChange("hargaSewa", oldHargaSewa, hargaSewa);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeMobil != null ? kodeMobil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobil_1)) {
            return false;
        }
        Mobil_1 other = (Mobil_1) object;
        if ((this.kodeMobil == null && other.kodeMobil != null) || (this.kodeMobil != null && !this.kodeMobil.equals(other.kodeMobil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "morrentalmobil.Mobil_1[ kodeMobil=" + kodeMobil + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
