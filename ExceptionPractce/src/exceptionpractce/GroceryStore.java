/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionpractce;

import java.util.Scanner;
import java.util.ArrayList;
import org.omg.CORBA.DynAnyPackage.Invalid;
/**
 *
 * @author geovanny.ortiz001
 */
class NoInventoryException extends Exception {

    public NoInventoryException(String message) {
        super(message);
    }
}

class InventoryItem {

    String name;
    int quantity;

    public InventoryItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

public class GroceryStore {

    public static void main(String[] args) throws NoInventoryException, Exception{
        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Add an Item to Inventory");
            System.out.println("2 - Change Item Quantity");
            System.out.println("3 - View All Items");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the item name followed by the quantity");
                    items.add(new InventoryItem(scanner.next(), scanner.nextInt()));
                    for (InventoryItem ii : items){
                        if(ii.quantity <= 0){
                            throw NoInventoryException("0 items in inventory.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the item to change the quantity: ");
                    String tempItem = scanner.next();
                    System.out.println("Enter the new quantity for " + tempItem + ":");
                    int qty = scanner.nextInt();
                    for (InventoryItem ii : items) {
                        if (ii.name.equals(tempItem)) {
                            ii.quantity = qty;
                        }
                    }
                    break;
                case 3:
                    for (InventoryItem ii : items) {
                        System.out.println(ii.name + " quantity " + ii.quantity + ".");
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    
                            
            }
        }
    }

    private static Exception NoInventoryException(String _items_in_inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}