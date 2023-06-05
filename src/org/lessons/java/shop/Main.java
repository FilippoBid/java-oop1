package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Product patate = new Product("patate","patate fresche",2.40);
        Product cane = new Product("cane","cane in scatola",10.40);

        System.out.println(patate.getData());
        System.out.println(patate.getVatPrice());
        System.out.println(cane.getData());
        System.out.println(cane.getVatPrice());

        cane.setName("burrito sauce");
        cane.setDescription("carne in scatola");

        System.out.println(cane.getData());
        System.out.println(cane.getCompleteName());




    }

}
