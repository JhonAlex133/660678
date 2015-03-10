package com.example.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {
    // Create a Counting Map
    // Create a Name Mapping Map

    public static void main(String[] args) {

        // List of part data
        String[] parts = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};

        // Create Product Name Part Number map
        private Map<String, Long> productCountMap = new HashMap<>();
        
        private Map<String, String> productNames = new TreeMap<>();
//        productNames.put("Blue Polo Shirt", "1S01");
//        productNames.put("Black Polo Shirt", "1S02");
//        productNames.put("Red Ball Cap", "1H01");
//        productNames.put("Duke Mug   ", "1M02");

        // Create Product Counter Object and process data
        
        ProductCounter pc1 = new ProductCounter(productNames);
        pc1.processList(parts);
        pc1.printReport();
    }

    public ProductCounter(Map productNames) {
        this.productNames = productNames;
    }

    public void processList(String[] list) {
        long curVal = 0;
        for (String item : list) {
            if (productCountMap.containsKey(itemNumber)) {
                curVal = productCountMap.get(itemNumber);
                curVal++;
                productCountMap.put(itemNumber, new Long(curVal))
            }else{
                productCountMap.put(itemNumber, new Long(1))
            }
        }
    }

    public void printReport() {
        System.out.println(" === Reporte del Producto ===");
        for(String key:productNames.keySet()){
            System.out.println("Nombres: " + key);
            System.out.println("\t\tcount: " + productCountMap.get(productNames.get(key)));
        }
    }
}
