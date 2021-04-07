package ru.mephi.java.ch02.task15;

public class Test {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Bread", 1, 1.9);
        invoice.addItem("Milk", 2, 4.60);
        invoice.addItem("Eggs", 9, 0.29);
        invoice.addItem("Egввввgs", 49, 0.629);
        invoice.checkout();
        invoice.otmena();
        invoice.otmena();
        invoice.otmena();
        invoice.checkout();
        invoice.addItem("Meat", 1, 5.9);
        invoice.addItem("Lollipop1", 5, 0.3);
        invoice.addItem("Lollipop2", 5, 0.3);
        invoice.addItem("Lollipop3", 5, 0.3);
        invoice.addItem("Lollipop4", 5, 0.3);
        invoice.addItem("Lollipop5", 5, 0.3);
        invoice.addItem("Lollipop6", 5, 0.3);
        invoice.addItem("Lollipop7", 5, 0.3);
        invoice.addItem("Lollipop8", 5, 0.3);
        invoice.checkout();
    }
}
