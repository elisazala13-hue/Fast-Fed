package model;

public class Shperndaresi {

    private int shperndaresi_id;
    private int user_id;
    private int restorant_id;
    private String status;
    private String mjeti;

    public Shperndaresi() {}

    public Shperndaresi(int shperndaresi_id, int user_id, int restorant_id,
                         String status, String mjeti) {
        this.shperndaresi_id = shperndaresi_id;
        this.user_id = user_id;
        this.restorant_id = restorant_id;
        this.status = status;
        this.mjeti = mjeti;
    }

    public void trackDelivery(int orderID) {
        // implemento
    }

    public void updateDeliveryStatus(int orderID, String status) {
        // implemento
    }

    public void receiveOrderNotification(int orderID) {
        // implemento
    }

    // GETTERS & SETTERS

    public int getShperndaresi_id() { return shperndaresi_id; }
    public void setShperndaresi_id(int shperndaresi_id) { this.shperndaresi_id = shperndaresi_id; }

    public int getUser_id() { return user_id; }
    public void setUser_id(int user_id) { this.user_id = user_id; }

    public int getRestorant_id() { return restorant_id; }
    public void setRestorant_id(int restorant_id) { this.restorant_id = restorant_id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getMjeti() { return mjeti; }
    public void setMjeti(String mjeti) { this.mjeti = mjeti; }
}