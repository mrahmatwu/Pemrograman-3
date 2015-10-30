/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morrentalmobil;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Mor
 */
@Entity
@Table(name = "transaksi", catalog = "rental_mobil", schema = "")
@NamedQueries({
    @NamedQuery(name = "Transaksi.findAll", query = "SELECT t FROM Transaksi t"),
    @NamedQuery(name = "Transaksi.findByNoTransaksi", query = "SELECT t FROM Transaksi t WHERE t.noTransaksi = :noTransaksi"),
    @NamedQuery(name = "Transaksi.findByTanggal", query = "SELECT t FROM Transaksi t WHERE t.tanggal = :tanggal"),
    @NamedQuery(name = "Transaksi.findByKodePelanggan", query = "SELECT t FROM Transaksi t WHERE t.kodePelanggan = :kodePelanggan"),
    @NamedQuery(name = "Transaksi.findByKodeMobil", query = "SELECT t FROM Transaksi t WHERE t.kodeMobil = :kodeMobil"),
    @NamedQuery(name = "Transaksi.findByTypeMobil", query = "SELECT t FROM Transaksi t WHERE t.typeMobil = :typeMobil"),
    @NamedQuery(name = "Transaksi.findByBiayaSewa", query = "SELECT t FROM Transaksi t WHERE t.biayaSewa = :biayaSewa"),
    @NamedQuery(name = "Transaksi.findByLamaSewa", query = "SELECT t FROM Transaksi t WHERE t.lamaSewa = :lamaSewa"),
    @NamedQuery(name = "Transaksi.findByTotal", query = "SELECT t FROM Transaksi t WHERE t.total = :total")})
public class Transaksi implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "no_transaksi")
    private Integer noTransaksi;
    @Basic(optional = false)
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Basic(optional = false)
    @Column(name = "kode_pelanggan")
    private int kodePelanggan;
    @Basic(optional = false)
    @Column(name = "kode_mobil")
    private int kodeMobil;
    @Basic(optional = false)
    @Column(name = "type_mobil")
    private String typeMobil;
    @Basic(optional = false)
    @Column(name = "biaya_sewa")
    private int biayaSewa;
    @Basic(optional = false)
    @Column(name = "lama_sewa")
    private int lamaSewa;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;

    public Transaksi() {
    }

    public Transaksi(Integer noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public Transaksi(Integer noTransaksi, Date tanggal, int kodePelanggan, int kodeMobil, String typeMobil, int biayaSewa, int lamaSewa, int total) {
        this.noTransaksi = noTransaksi;
        this.tanggal = tanggal;
        this.kodePelanggan = kodePelanggan;
        this.kodeMobil = kodeMobil;
        this.typeMobil = typeMobil;
        this.biayaSewa = biayaSewa;
        this.lamaSewa = lamaSewa;
        this.total = total;
    }

    public Integer getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(Integer noTransaksi) {
        Integer oldNoTransaksi = this.noTransaksi;
        this.noTransaksi = noTransaksi;
        changeSupport.firePropertyChange("noTransaksi", oldNoTransaksi, noTransaksi);
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        Date oldTanggal = this.tanggal;
        this.tanggal = tanggal;
        changeSupport.firePropertyChange("tanggal", oldTanggal, tanggal);
    }

    public int getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(int kodePelanggan) {
        int oldKodePelanggan = this.kodePelanggan;
        this.kodePelanggan = kodePelanggan;
        changeSupport.firePropertyChange("kodePelanggan", oldKodePelanggan, kodePelanggan);
    }

    public int getKodeMobil() {
        return kodeMobil;
    }

    public void setKodeMobil(int kodeMobil) {
        int oldKodeMobil = this.kodeMobil;
        this.kodeMobil = kodeMobil;
        changeSupport.firePropertyChange("kodeMobil", oldKodeMobil, kodeMobil);
    }

    public String getTypeMobil() {
        return typeMobil;
    }

    public void setTypeMobil(String typeMobil) {
        String oldTypeMobil = this.typeMobil;
        this.typeMobil = typeMobil;
        changeSupport.firePropertyChange("typeMobil", oldTypeMobil, typeMobil);
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }

    public void setBiayaSewa(int biayaSewa) {
        int oldBiayaSewa = this.biayaSewa;
        this.biayaSewa = biayaSewa;
        changeSupport.firePropertyChange("biayaSewa", oldBiayaSewa, biayaSewa);
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        int oldLamaSewa = this.lamaSewa;
        this.lamaSewa = lamaSewa;
        changeSupport.firePropertyChange("lamaSewa", oldLamaSewa, lamaSewa);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        int oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noTransaksi != null ? noTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.noTransaksi == null && other.noTransaksi != null) || (this.noTransaksi != null && !this.noTransaksi.equals(other.noTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "morrentalmobil.Transaksi[ noTransaksi=" + noTransaksi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
