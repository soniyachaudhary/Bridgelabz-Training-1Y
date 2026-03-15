package com.gla.Level1;
class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    void calculateTotal(int quantity) {
        double total = price * quantity;
        System.out.println("Total cost for " + quantity + " items: " + total);
    }

    public static void main(String[] args) {
        Item i1 = new Item(501, "Keyboard", 800.0);
        i1.display();
        i1.calculateTotal(3);
    }
}
