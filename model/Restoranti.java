package model;

import java.util.Date;

public class Restoranti {

    private int restorant_id;
    private int user_id;
    private String emri_restorant;
    private String adresa;
    private String NIPT;
    private String status;
    private Date data_regjistrimit;

    public Restoranti() {}

    public Restoranti(int restorant_id, int user_id, String emri_restorant, String adresa,
                      String NIPT, String status, Date data_regjistrimit) {
        this.restorant_id = restorant_id;
        this.user_id = user_id;
        this.emri_restorant = emri_restorant;
        this.adresa = adresa;
        this.NIPT = NIPT;
        this.status = status;
        this.data_regjistrimit = data_regjistrimit;
    }

    public void manageMenu() {
        // implemento
    }

    public void manageOrders() {
        // implemento
    }

    public void generateStats() {
        // implemento
    }

    // GETTERS & SETTERS

    public int getRestorant_id() { return restorant_id; }
    public void setRestorant_id(int restorant_id) { this.restorant_id = restorant_id; }

    public int getUser_id() { return user_id; }
    public void setUser_id(int user_id) { this.user_id = user_id; }

    public String getEmri_restorant() { return emri_restorant; }
    public void setEmri_restorant(String emri_restorant) { this.emri_restorant = emri_restorant; }

    public String getAdresa() { return adresa; }
    public void setAdresa(String adresa) { this.adresa = adresa; }

    public String getNIPT() { return NIPT; }
    public void setNIPT(String NIPT) { this.NIPT = NIPT; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getData_regjistrimit() { return data_regjistrimit; }
    public void setData_regjistrimit(Date data_regjistrimit) { this.data_regjistrimit = data_regjistrimit; }
}