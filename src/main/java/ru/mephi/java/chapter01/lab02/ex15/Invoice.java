package ru.mephi.java.chapter01.lab02.ex15;

// Реализуйте полностью класс Invoice, представленный в разделе 2.6.1.
// Предоставьте метод, выводящий счет-фактуру, и демонстрационную версию программы,
// составляющей и выводящей образец счета-фактуры.

import java.util.ArrayList;

public class Invoice {

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Karamelka ", 3, 24.95);
        invoice.addItem("Marmeladka", 2, 49.95);
        invoice.print();
    }

    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        double price() {
            return quantity * unitPrice;
        }

        public String toString() {
            return quantity + " x " + description + " at $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println("Total - $" + total);
    }

}