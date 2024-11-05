package com.pluralsight;

import java.io.*;

public class DealershipFileManager {

        public static void readAll() {
            String csvFile = "inventory.csv"; //make csv variable to make easier for self
            String line;

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                while ((line = br.readLine()) != null)  {// Read Everything until there is nothing left

                    String[] values = line.split(","); // when (|) is used file shows like this 1 0 1 1 2 | 1 9 9 3 | F o r d | E x p l o r e r | S U V | R e d | 5 2 5 1 2 3 | 9 9 5 . 0 0

                    for (String value : values) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    public static void saveInventory () {

        try {

            FileWriter fw = new FileWriter("inventory.csv");

            for (Vehicle p :                                               ();) {
                String data = p.getDate() + "|" + p.getTime() + "|"
                        + p.getDescription() + p.getVendor() + p.getAmount() + "\n";
                fw.write(data);
            }
            fw.close();


        } catch (Exception e) {
            System.out.println("FILE WRITE ERROR");
        }

    }



}




