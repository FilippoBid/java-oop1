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
    } public int getCode() {

        int data = this.idCode;
        return data;
    } public double getMoney() {
        double data = this.money;
        return data;
    }

    public void setName(String name) {
        this.name = name;
    };
    public void addMoney(double amount) {
        this.money = this.money + amount;
    };public void takeMoney(double amount) {
        this.money = this.money - amount;
    };
}
