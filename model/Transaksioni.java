package model;

import java.util.Date;

public class Transaksioni {

    private int transaksioni_id;
    private int porosi_id;
    private int klient_id;
    private int restorant_id;
    private int shperndares_id;
    private float shuma;
    private String metoda;
    private String status;
    private Date data_transaksioni;

    public Transaksioni() {}

    public Transaksioni(int transaksioni_id, int porosi_id, int klient_id, int restorant_id,
                        int shperndares_id, float shuma, String metoda, String status,
                        Date data_transaksioni) {
        this.transaksioni_id = transaksioni_id;
        this.porosi_id = porosi_id;
        this.klient_id = klient_id;
        this.restorant_id = restorant_id;
        this.shperndares_id = shperndares_id;
        this.shuma = shuma;
        this.metoda = metoda;
        this.status = status;
        this.data_transaksioni = data_transaksioni;
    }

    public void processPayment() {
        // implemento
    }

    // GETTERS & SETTERS

    public int getTransaksioni_id() { return transaksioni_id; }
    public void setTransaksioni_id(int transaksioni_id) { this.transaksioni_id = transaksioni_id; }

    public int getPorosi_id() { return porosi_id; }
    public void setPorosi_id(int porosi_id) { this.porosi_id = porosi_id; }

    public int getKlient_id() { return klient_id; }
    public void setKlient_id(int klient_id) { this.klient_id = klient_id; }

    public int getRestorant_id() { return restorant_id; }
    public void setRestorant_id(int restorant_id) { this.restorant_id = restorant_id; }

    public int getShperndares_id() { return shperndares_id; }
    public void setShperndares_id(int shperndares_id) { this.shperndares_id = shperndares_id; }

    public float getShuma() { return shuma; }
    public void setShuma(float shuma) { this.shuma = shuma; }

    public String getMetoda() { return metoda; }
    public void setMetoda(String metoda) { this.metoda = metoda; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getData_transaksioni() { return data_transaksioni; }
    public void setData_transaksioni(Date data_transaksioni) { this.data_transaksioni = data_transaksioni; }
}