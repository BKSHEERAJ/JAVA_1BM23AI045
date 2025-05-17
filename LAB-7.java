package BM23AI045;

import java.util.ArrayList;

class Pharmacy {
    public final int id;
    public final String name;
    public int quantity;
    public double price;
    public Pharmacy(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class PharmacyManagementSystem {
    private ArrayList<Pharmacy> inventory = new ArrayList<>();
    public void addItem(Pharmacy item) {
        inventory.add(item);
    }

    public void updateItem(int id, int quantity, double price) {
        for (Pharmacy item : inventory) {
            if (item.id == id) {
                item.quantity = quantity;
                item.price = price;
                break;
            }
        }
    }

    public void removeItem(int id) {
        inventory.removeIf(item -> item.id == id);
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Pharmacy item : inventory) {
            System.out.println(item.id + " | " + item.name + " | Quantity: " + item.quantity + " | Price: " + item.price);
        }
        System.out.println();
    }

    public Pharmacy searchItemByID(int id) {
        for (Pharmacy item : inventory) {
            if (item.id == id) {
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        PharmacyManagementSystem ims = new PharmacyManagementSystem();
        ims.addItem(new Pharmacy(1, "Crocin", 100, 2.5));
        ims.addItem(new Pharmacy(2, "Calpol", 50, 3.0));
        ims.addItem(new Pharmacy(3, "Crickmol", 200, 1.0));
        ims.displayInventory();
        ims.updateItem(1, 90, 2.0);
        ims.displayInventory();
        System.out.println("Searching for item with ID 2:");
        Pharmacy foundItem = ims.searchItemByID(2);
        if (foundItem != null) {
            System.out.println("Item found: " + foundItem.name);
        } else {
            System.out.println("Item not found.");
        }
        System.out.println();
        ims.removeItem(2);
        ims.displayInventory();
    }
}

//output:
Inventory:
1 | Crocin | Quantity: 100 | Price: 2.5
2 | Calpol | Quantity: 50 | Price: 3.0
3 | Crickmol | Quantity: 200 | Price: 1.0

Inventory:
1 | Crocin | Quantity: 90 | Price: 2.0
2 | Calpol | Quantity: 50 | Price: 3.0
3 | Crickmol | Quantity: 200 | Price: 1.0

Searching for item with ID 2:
Item found: Calpol

Inventory:
1 | Crocin | Quantity: 90 | Price: 2.0
3 | Crickmol | Quantity: 200 | Price: 1.0


Process finished with exit code 0
