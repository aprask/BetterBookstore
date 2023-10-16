package Inventory.Item.Factory;

import Inventory.Item.Book;
import Inventory.Item.CD;
import Inventory.Item.Item;
import Inventory.*;
import java.util.Scanner;

public class Factory
{
    private final Scanner scan = new Scanner(System.in);
    private ItemType CD = ItemType.CD;
    private ItemType Book = ItemType.BOOK;
    private ItemType DVD = ItemType.DVD;
    private Inventory inventory;

    public Factory()
    {

    }
    public void constructItem()
    {
        System.out.println("1 = CD\n2 = Book\n3 = DVD");
        int newItemType = scan.nextInt();
        itemDetails(newItemType);
        do {
            System.out.println("Would you like another item? ");
            System.out.println("1 = CD\n2 = Book\n3 = DVD");
            System.out.println("Type -1 to exit");
            newItemType = scan.nextInt();
            if(newItemType != -1)
            {
                itemDetails(newItemType);
            }
            else
            {
                break;
            }
        } while(itemDetails(newItemType));
    }
    public boolean itemDetails(int itemType)
    {
        if(itemType == 1 || itemType == 2 || itemType == 3)
        {
            System.out.println("Enter item name: ");
            String itemName = scan.next();
            System.out.println("Enter item price: ");
            double itemPrice = scan.nextDouble();
            System.out.println("Enter item ID: ");
            int itemID = scan.nextInt();
            if(itemType == getCD().ID)
            {
                System.out.println("Enter the CD's length in seconds: ");
                double cdLength = scan.nextDouble();
                this.inventory.addItem(new CD(itemName,itemPrice,itemID,cdLength));
                return true;
            }
            else if(itemType == getBook().ID)
            {
                System.out.println("Enter the page count: ");
                int pageCount = scan.nextInt();
                this.inventory.addItem(new Book(itemName,itemPrice,itemID,pageCount));
                return true;
            }
            else if(itemType == getDVD().ID)
            {
                System.out.println("Enter the DVD's length in seconds: ");
                double dvdLength = scan.nextDouble();
                this.inventory.addItem(new CD(itemName,itemPrice,itemID,dvdLength));
                return true;
            }

        }
        else
        {
            System.out.println("Invalid Item Type");
            return false;
        }
        return false;
    }
    public ItemType getCD() {
        return CD;
    }

    public void setCD(ItemType CD) {
        this.CD = CD;
    }

    public ItemType getBook() {
        return Book;
    }

    public void setBook(ItemType book) {
        Book = book;
    }

    public ItemType getDVD() {
        return DVD;
    }

    public void setDVD(ItemType DVD) {
        this.DVD = DVD;
    }
}
