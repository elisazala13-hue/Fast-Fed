package model;

import java.util.Date;

public class Tracking {

    private int track_id;
    private int porosi_id;
    private int shperndares_id;
    private float gjatesia;
    private float gjatesia2;
    private Date koha;

    public Tracking() {}

    public Tracking(int track_id, int porosi_id, int shperndares_id,
                    float gjatesia, float gjatesia2, Date koha) {
        this.track_id = track_id;
        this.porosi_id = porosi_id;
        this.shperndares_id = shperndares_id;
        this.gjatesia = gjatesia;
        this.gjatesia2 = gjatesia2;
        this.koha = koha;
    }

    public void updateLocation() {
        // implemento
    }

    // GETTERS & SETTERS

    public int getTrack_id() { return track_id; }
    public void setTrack_id(int track_id) { this.track_id = track_id; }

    public int getPorosi_id() { return porosi_id; }
    public void setPorosi_id(int porosi_id) { this.porosi_id = porosi_id; }

    public int getShperndares_id() { return shperndares_id; }
    public void setShperndares_id(int shperndares_id) { this.shperndares_id = shperndares_id; }

    public float getGjatesia() { return gjatesia; }
    public void setGjatesia(float gjatesia) { this.gjatesia = gjatesia; }

    public float getGjatesia2() { return gjatesia2; }
    public void setGjatesia2(float gjatesia2) { this.gjatesia2 = gjatesia2; }

    public Date getKoha() { return koha; }
    public void setKoha(Date koha) { this.koha = koha; }
}