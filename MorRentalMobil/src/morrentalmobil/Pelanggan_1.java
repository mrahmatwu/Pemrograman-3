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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mor
 */
@Entity
@Table(name = "pelanggan", catalog = "rental_mobil", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pelanggan_1.findAll", query = "SELECT p FROM Pelanggan_1 p"),
    @NamedQuery(name = "Pelanggan_1.findByKodePelanggan", query = "SELECT p FROM Pelanggan_1 p WHERE p.kodePelanggan = :kodePelanggan"),
    @NamedQuery(name = "Pelanggan_1.findByNama", query = "SELECT p FROM Pelanggan_1 p WHERE p.nama = :nama"),
    @NamedQuery(name = "Pelanggan_1.findByNoTelepon", query = "SELECT p FROM Pelanggan_1 p WHERE p.noTelepon = :noTelepon")})
public class Pelanggan_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_pelanggan")
    private Integer kodePelanggan;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Lob
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "no_telepon")
    private int noTelepon;

    public Pelanggan_1() {
    }

    public Pelanggan_1(Integer kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public Pelanggan_1(Integer kodePelanggan, String nama, String alamat, int noTelepon) {
        this.kodePelanggan = kodePelanggan;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public Integer getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(Integer kodePelanggan) {
        Integer oldKodePelanggan = this.kodePelanggan;
        this.kodePelanggan = kodePelanggan;
        changeSupport.firePropertyChange("kodePelanggan", oldKodePelanggan, kodePelanggan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public int getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(int noTelepon) {
        int oldNoTelepon = this.noTelepon;
        this.noTelepon = noTelepon;
        changeSupport.firePropertyChange("noTelepon", oldNoTelepon, noTelepon);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodePelanggan != null ? kodePelanggan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelanggan_1)) {
            return false;
        }
        Pelanggan_1 other = (Pelanggan_1) object;
        if ((this.kodePelanggan == null && other.kodePelanggan != null) || (this.kodePelanggan != null && !this.kodePelanggan.equals(other.kodePelanggan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "morrentalmobil.Pelanggan_1[ kodePelanggan=" + kodePelanggan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
