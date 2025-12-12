package model;

public class Menu {

    private int menu_id;
    private int restorant_id;

    public Menu() {}

    public Menu(int menu_id, int restorant_id) {
        this.menu_id = menu_id;
        this.restorant_id = restorant_id;
    }

    public void addProdukt(int produktID) {
        // implemento
    }

    public void removeProdukt(int produktID) {
        // implemento
    }

    public void updateProdukt(int produktID) {
        // implemento
    }

    // GETTERS & SETTERS

    public int getMenu_id() { return menu_id; }
    public void setMenu_id(int menu_id) { this.menu_id = menu_id; }

    public int getRestorant_id() { return restorant_id; }
    public void setRestorant_id(int restorant_id) { this.restorant_id = restorant_id; }
}