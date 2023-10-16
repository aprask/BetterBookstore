package Inventory.Item;

public class Book extends Item
{
    private int pageCount;
    public Book(String itemName, double itemPrice, int id, int pageCount) {
        super(itemName, itemPrice, id);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
