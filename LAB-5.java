package BM23AI045;

import java.util.Vector;

class Product {
    String name;
    double price;
    String category;
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class OnlineShoppingManager {
    private Vector<Product> inventory;
    public OnlineShoppingManager() {
        inventory = new Vector<>();
    }

    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                System.out.println(name + " has been removed from the inventory.");
                return;
            }
        }
        System.out.println(name + " not found in the inventory.");
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        if (inventory.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : inventory) {
                System.out.println("Name: " + product.name + ", Price: " + product.price + ", Category: " + product.category);
            }
        }
    }

    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();
        manager.addProduct("Laptop", 40000, "Electronics");
        manager.addProduct("T-shirt", 550, "Clothing");
        manager.addProduct("Book", 920, "Books");
        manager.displayInventory();
        manager.removeProduct("Book");
        manager.displayInventory();
        manager.removeProduct("Laptop");
        manager.displayInventory();
    }
}

//output:
Inventory:
Name: Laptop, Price: 40000.0, Category: Electronics
Name: T-shirt, Price: 550.0, Category: Clothing
Name: Book, Price: 920.0, Category: Books
Book has been removed from the inventory.
Inventory:
Name: Laptop, Price: 40000.0, Category: Electronics
Name: T-shirt, Price: 550.0, Category: Clothing
Laptop has been removed from the inventory.
Inventory:
Name: T-shirt, Price: 550.0, Category: Clothing

Process finished with exit code 0
