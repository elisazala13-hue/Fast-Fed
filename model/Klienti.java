package model;

import java.util.Date;

public class Klienti {

    private int klienti_id;
    private int user_id;
    private Date date_regjistrimit;

    public Klienti() {}

    public Klienti(int klienti_id, int user_id, Date date_regjistrimit) {
        this.klienti_id = klienti_id;
        this.user_id = user_id;
        this.date_regjistrimit = date_regjistrimit;
    }

    public void searchRestaurants(String filter) {
        // implemento
    }

    public void viewMenu(int restaurantID) {
        // implemento
    }

    public void createPorosi(String items) {
        // implemento
    }

    public void trackOrder(int orderID) {
        // implemento
    }

    public void leaveFeedback(int orderID, int rating, String comment) {
        // implemento
    }

    // GETTERS & SETTERS

    public int getKlienti_id() { return klienti_id; }
    public void setKlienti_id(int klienti_id) { this.klienti_id = klienti_id; }

    public int getUser_id() { return user_id; }
    public void setUser_id(int user_id) { this.user_id = user_id; }

    public Date getDate_regjistrimit() { return date_regjistrimit; }
    public void setDate_regjistrimit(Date date_regjistrimit) { this.date_regjistrimit = date_regjistrimit; }
}