package Inventory.Item.Factory;

import Inventory.Item.Item;
import User.Command;
import Inventory.Inventory;

public class StoreItems implements Command {
    Inventory inventory = new Inventory();
    @Override
    public void execute() {
        System.out.println("Total Number of Items: " + inventory.getItemList().size());
    }

    public void storeItem(Item item)
    {
        this.inventory.addItem(item);
    }
}
