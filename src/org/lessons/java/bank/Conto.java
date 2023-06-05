package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    /*VARIABILI*/
    public String name;
    public int idCode;
    public double money;
    // COSTRUTTORE
    Conto(String name) {
        Random random = new Random();
        this.name = name;

        this.money = 0.00;
        this.idCode = random.nextInt(1000);
    }
    // METODI
    public String getData() {
        String data = "Name: " + name + "\n" +"ID code: " + idCode + "\n" + "balance: " + money + "\n";
        return data;
    } public String getCode() {

        return = this.idCode;
    } public String getMoney() {

        return =String this.money;
    }

    public void setName(String name) {
        this.name = name;
    };
}
