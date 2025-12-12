package model;

public class Produkti {

    private int produkt_id;
    private int menu_id;
    private String emri;
    private float cmimi;
    private String pershkrim;
    private String status;

    public Produkti() {}

    public Produkti(int produkt_id, int menu_id, String emri, float cmimi,
                    String pershkrim, String status) {
        this.produkt_id = produkt_id;
        this.menu_id = menu_id;
        this.emri = emri;
        this.cmimi = cmimi;
        this.pershkrim = pershkrim;
        this.status = status;
    }

    // GETTERS & SETTERS

    public int getProdukt_id() { return produkt_id; }
    public void setProdukt_id(int produkt_id) { this.produkt_id = produkt_id; }

    public int getMenu_id() { return menu_id; }
    public void setMenu_id(int menu_id) { this.menu_id = menu_id; }

    public String getEmri() { return emri; }
    public void setEmri(String emri) { this.emri = emri; }

    public float getCmimi() { return cmimi; }
    public void setCmimi(float cmimi) { this.cmimi = cmimi; }

    public String getPershkrim() { return perskhrim; }
    public void setPershkrim(String pershkrim) { this.pershkrim = pershkrim; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}