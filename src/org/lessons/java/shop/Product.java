package org.lessons.java.shop;

import java.util.Random;

public class Product {
        // CAMPI o ATTRIBUTI
      private final int idCode;
      private String name;
      private String description;
      private double price;

      private int vat;





        // COSTRUTTORE
        Product(String name, String description, double price,int vat) {
            Random random = new Random();
            this.name = name;
            this.description = description;
            this.price = price;
            this.idCode = random.nextInt(9999999);
            this.vat = vat;
        }
        // METODI
        public String getData() {
            String data = "Name: " + name + "\n" +"code: " + idCode + "\n" + "Description: " + description + "\n" + "price: "
                    + price + "\n" +"vat: " + vat ;
            return data;
        }


    public void setName(String name) {
        this.name = name;
    };public void setVat(int vat) {
        this.vat = vat;
    };

    public void setDescription(String description) {
        this.description = description;
    };

    public void setPrice(double price) {
        this.price = price;
    }


       public double getVatPrice() {

           return this.price + (this.price * this.vat / 100);
        }

        public String getCompleteName() {

            return this.name+ this.idCode;
        }


}


