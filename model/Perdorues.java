package model;

import java.util.Date;

public class Perdorues {

    private int user_id;
    private String emri;
    private String mbiemri;
    private String email;
    private String fjalekalimi;
    private String telefon;
    private Date data_regjistrimit;
    private String roli;

    public Perdorues() {}

    public Perdorues(int user_id, String emri, String mbiemri, String email, String fjalekalimi,
                      String telefon, Date data_regjistrimit, String roli) {
        this.user_id = user_id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.email = email;
        this.fjalekalimi = fjalekalimi;
        this.telefon = telefon;
        this.data_regjistrimit = data_regjistrimit;
        this.roli = roli;
    }

    public boolean login() {
        // implemento
        return true;
    }

    public boolean register() {
        // implemento
        return true;
    }

    // GETTERS & SETTERS

    public int getUser_id() { return user_id; }
    public void setUser_id(int user_id) { this.user_id = user_id; }

    public String getEmri() { return emri; }
    public void setEmri(String emri) { this.emri = emri; }

    public String getMbiemri() { return mbiemri; }
    public void setMbiemri(String mbiemri) { this.mbiemri = mbiemri; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFjalekalimi() { return fjalekalimi; }
    public void setFjalekalimi(String fjalekalimi) { this.fjalekalimi = fjalekalimi; }

    public String getTelefon() { return telefon; }
    public void setTelefon(String telefon) { this.telefon = telefon; }

    public Date getData_regjistrimit() { return data_regjistrimit; }
    public void setData_regjistrimit(Date data_regjistrimit) { this.data_regjistrimit = data_regjistrimit; }

    public String getRoli() { return roli; }
    public void setRoli(String roli) { this.roli = roli; }
}