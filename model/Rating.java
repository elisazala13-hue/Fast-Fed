package model;

public class Rating {

    private int rating_id;
    private int porosi_id;
    private int vleresimi;
    private String koment;

    public Rating() {}

    public Rating(int rating_id, int porosi_id, int vleresimi, String koment) {
        this.rating_id = rating_id;
        this.porosi_id = porosi_id;
        this.vleresimi = vleresimi;
        this.koment = koment;
    }

    public void submitRating(int orderID) {
        // implemento
    }

    // GETTERS & SETTERS

    public int getRating_id() { return rating_id; }
    public void setRating_id(int rating_id) { this.rating_id = rating_id; }

    public int getPorosi_id() { return porosi_id; }
    public void setPorosi_id(int porosi_id) { this.porosi_id = porosi_id; }

    public int getVleresimi() { return vleresimi; }
    public void setVleresimi(int vleresimi) { this.vleresimi = vleresimi; }

    public String getKoment() { return koment; }
    public void setKoment(String koment) { this.koment = koment; }
}