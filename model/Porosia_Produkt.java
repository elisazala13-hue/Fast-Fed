package model;

public class Porosia_Produkt {

    private int porosi_id;
    private int produkt_id;
    private int sasia;
    private float cmimi;

    public Porosia_Produkt() {}

    public Porosia_Produkt(int porosi_id, int produkt_id, int sasia, float cmimi) {
        this.porosi_id = porosi_id;
        this.produkt_id = produkt_id;
        this.sasia = sasia;
        this.cmimi = cmimi;
    }

    // GETTERS & SETTERS

    public int getPorosi_id() { return porosi_id; }
    public void setPorosi_id(int porosi_id) { this.porosi_id = porosi_id; }

    public int getProdukt_id() { return produkt_id; }
    public void setProdukt_id(int produkt_id) { this.produkt_id = produkt_id; }

    public int getSasia() { return sasia; }
    public void setSasia(int sasia) { this.sasia = sasia; }

    public float getCmimi() { return cmimi; }
    public void setCmimi(float cmimi) { this.cmimi = cmimi; }
}