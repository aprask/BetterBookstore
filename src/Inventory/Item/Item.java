package Inventory.Item;

public class Item {
    private String name;
    private double price;
    private boolean sold;
    private int ID;

    public Item(String itemName) {
        this.name = itemName;
        this.sold = false;
    }

    public Item(String itemName, double itemPrice, int id) {
        this.name = itemName;
        this.price = itemPrice;
        this.sold = false;
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
