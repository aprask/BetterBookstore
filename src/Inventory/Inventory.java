package Inventory;

import Inventory.Item.Item;

import java.util.ArrayList;

public class Inventory
{
    ArrayList<Item> itemList = new ArrayList<Item>();
    public Inventory()
    {

    }
    public void addItem(Item item)
    {
        this.itemList.add(item);
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
}
