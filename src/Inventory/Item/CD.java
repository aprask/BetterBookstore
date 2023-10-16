package Inventory.Item;

public class CD extends Item {
    private double CDLength;
    public CD(String itemName, double itemPrice, int id, double CDLength) {
        super(itemName, itemPrice, id);
        this.CDLength = CDLength;
    }

    public double getCDLength() {
        return CDLength;
    }

    public void setCDLength(double CDLength) {
        this.CDLength = CDLength;
    }


}
