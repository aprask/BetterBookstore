package Inventory.Item;

public class DVD  extends Item{
    private double DVDLength;
    public DVD(String itemName, double itemPrice, int id, double DVDLength) {
        super(itemName, itemPrice, id);
        this.DVDLength = DVDLength;
    }

    public double getDVDLength() {
        return DVDLength;
    }

    public void setDVDLength(double DVDLength) {
        this.DVDLength = DVDLength;
    }
}
