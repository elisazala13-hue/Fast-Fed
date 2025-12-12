package model;

import java.util.Date;

public class Porosia {

    private int porosi_id;
    private int klienti_id;
    private int restorant_id;
    private int shperndaresi_id;
    private Date data_porosise;
    private float cmimi_total;
    private String status;
    private String adresa;

    public Porosia() {}

    public Porosia(int porosi_id, int klienti_id, int restorant_id, int shperndaresi_id,
                   Date data_porosise, float cmimi_total, String status, String adresa) {
        this.porosi_id = porosi_id;
        this.klienti_id = klienti_id;
        this.restorant_id = restorant_id;
        this.shperndaresi_id = shperndaresi_id;
        this.data_porosise = data_porosise;
        this.cmimi_total = cmimi_total;
        this.status = status;
        this.adresa = adresa;
    }

    public void notifyStatus() {
        // implemento
    }

    // GETTERS & SETTERS

    public int getPorosi_id() { return porosi_id; }
    public void setPorosi_id(int porosi_id) { this.porosi_id = porosi_id; }

    public int getKlienti_id() { return klienti_id; }
    public void setKlienti_id(int klienti_id) { this.klienti_id = klienti_id; }

    public int getRestorant_id() { return restorant_id; }
    public void setRestorant_id(int restorant_id) { this.restorant_id = restorant_id; }

    public int getShperndaresi_id() { return shperndaresi_id; }
    public void setShperndaresi_id(int shperndaresi_id) { this.shperndaresi_id = shperndaresi_id; }

    public Date getData_porosise() { return data_porosise; }
    public void setData_porosise(Date data_porosise) { this.data_porosise = data_porosise; }

    public float getCmimi_total() { return cmimi_total; }
    public void setCmimi_total(float cmimi_total) { this.cmimi_total = cmimi_total; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getAdresa() { return adresa; }
    public void setAdresa(String adresa) { this.adresa = adresa; }
}