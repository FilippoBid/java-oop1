package org.lessons.java.shop;

import java.util.Random;

public class Product {
        // CAMPI o ATTRIBUTI
      private final int idCode;
      private String name;
      private String description;
      private double price;





        // COSTRUTTORE
        Product(String name, String description, double price) {
            Random random = new Random();
            this.name = name;
            this.description = description;
            this.price = price;
            this.idCode = random.nextInt(9999999);
        }
        // METODI
        public String getData() {
            String data = "Name: " + name + "\n" +"code: " + idCode + "\n" + "Description: " + description + "\n" + "price: "
                    + price + "\n";
            return data;
        }


    public void setName(String name) {
        this.name = name;
    };

    public void setDescription(String description) {
        this.description = description;
    };

    public void setPrice(double price) {
        this.price = price;
    }


       public double getVatPrice() {
            int vat = 22;
            double priceWithVAT = this.price + (this.price * vat / 100);
            return priceWithVAT;
        }

        public String getCompleteName() {

            return this.name+ this.idCode;
        }


}


