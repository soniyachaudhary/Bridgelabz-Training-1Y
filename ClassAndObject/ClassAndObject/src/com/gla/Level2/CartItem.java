package com.gla.Level2;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    // Method to display item and return its cost
    double getItemTotal() {
        return price * quantity;
    }

    void display() {
        System.out.println(itemName + " - Price: " + price + " - Qty: " + quantity);
    }

    public static void main(String[] args) {
        // Creating items (Adding to cart)
        CartItem item1 = new CartItem("Laptop", 50000, 1);
        CartItem item2 = new CartItem("Mouse", 500, 2);
        CartItem item3 = new CartItem("Headphones", 1500, 1);

        System.out.println("Items in your cart:");
        item1.display();
        item2.display();
        item3.display();

        // Calculating total
        double total = item1.getItemTotal() + item2.getItemTotal() + item3.getItemTotal();
        System.out.println("Total Cost: Rs. " + total);

        // Simulating "Remove from cart" by subtracting an item's cost
        System.out.println("\nRemoving Headphones from cart...");
        total = total - item3.getItemTotal();

        System.out.println("Final Total Cost: Rs. " + total);
    }
}