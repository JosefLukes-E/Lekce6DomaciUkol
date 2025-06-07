//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.engeto.DomaciUkol6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] stockLevels = {10, 20, 30, 40, 50};
        int totalStock = 0;
        for (int i = 0; i < stockLevels.length; i++) {
            System.out.println("Produkt " + (i + 1) + " má na skladě " + stockLevels[i]);
            totalStock += stockLevels[i];
        }
        System.out.println("Celkový počet kusů na skladě " + totalStock);

         ArrayList<String> productNames = new ArrayList<>();

        productNames.add("Laptop");
        productNames.add("Notebook");
        productNames.add("Desktop");
        productNames.add("Ultrabook");
        productNames.add("Macbook");

        listOfProducts(productNames,stockLevels);

        System.out.println( findProduct("Macbook", productNames, stockLevels) );

        updateStock(3,22,stockLevels);

        listOfProducts(productNames,stockLevels);

        removeProduct(2,productNames,stockLevels);

        listOfProducts(productNames,stockLevels);

    }

    public static String findProduct(String productName, List<String> products, int[] stock){

        if (findProductIndex(productName, products)!=-1) {
            return "Pozice hledaného prouktu " + productName + " je " +  (products.indexOf(productName) + 1) + " na skladě je " + stock[products.indexOf(productName)] + " ks";
        }

        return "Produkt nenalezen";
    }
    public static int findProductIndex(String productName, List<String> products){

        for (String name: products){
            if (name.equals(productName)){
                return products.indexOf(name);
            }
        }
        return -1;
    }



    public static void removeProduct(int index, List<String> products, int[] stock) {
        products.set(index, "-");
        stock[index] = 0;
    }
    public static void updateStock(int index, int quantity, int[] stock) {
        stock[index] = quantity;
    }

    public static void listOfProducts (List<String> products, int[] stock) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Produkt " + (i + 1) + " je " + products.get(i) + " a na skladě je " + stock[i] + " ks");
        }
        System.out.println("-----");
    }

}