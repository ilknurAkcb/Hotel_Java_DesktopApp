/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ilknur
 */
public class Sutunlar {
   private int MusteriID;
  private String MAd;
  private String MSoyad;
  private int MTlf;
  private String MAdres;

    public int getMusteriID() {
        return MusteriID;
    }

    public void setMusteriID(int MusteriID) {
        this.MusteriID = MusteriID;
    }

    public String getMAd() {
        return MAd;
    }

    public void setMAd(String MAd) {
        this.MAd = MAd;
    }

    public String getMSoyad() {
        return MSoyad;
    }

    public void setMSoyad(String MSoyad) {
        this.MSoyad = MSoyad;
    }

    public int getMTlf() {
        return MTlf;
    }

    public void setMTlf(int MTlf) {
        this.MTlf = MTlf;
    }

    public String getMAdres() {
        return MAdres;
    }

    public void setMAdres(String MAdres) {
        this.MAdres = MAdres;
    }

    public Sutunlar(int MusteriID, String MAd, String MSoyad, int MTlf, String MAdres) {
        this.MusteriID = MusteriID;
        this.MAd = MAd;
        this.MSoyad = MSoyad;
        this.MTlf = MTlf;
        this.MAdres = MAdres;
    }
}
