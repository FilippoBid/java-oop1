package org.lessons.java.bank;

import org.lessons.java.shop.Product;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Conto conto1 = new Conto("gino");

        System.out.println(conto1.getMoney());
        System.out.println(conto1.getData());
        System.out.println(conto1.getCode());
*/
        System.out.println("Inserisci il tuo nome");
        Conto conto2 = new Conto(scan.nextLine());

        System.out.println(conto2.getMoney()+ "$");
        System.out.println(conto2.getData());
        System.out.println(conto2.getCode());







        System.out.print("Cosa desideri fare :" + "\n" + "premere 1 per depositare."+ "\n" + "premere 2 per prelevare"+ "\n" + "premere 3 per uscire"+ "\n");
        int actionIn = scan.nextInt();
        switch (actionIn) {
            case 1:
                System.out.println("Hai scelto depositare.");
                System.out.println("quanto vuoi depositare?");
                double amount = scan.nextDouble();
                if (amount > 0){
                    conto2.addMoney(amount);
                    System.out.println("operazione completata,saldo attuale:" + conto2.getMoney());
                }else {
                    System.out.println("inserire una somma positiva");
                }

                break;
            case 2:
                System.out.println("Hai scelto prelevare");
                System.out.println("quanto vuoi prelevare?");
                double amounttake = scan.nextDouble();
                if (amounttake>0 || (conto2.getMoney() - amounttake)<0){
                    System.out.println("saldo non disponibile");
                }else{
                    conto2.takeMoney(amounttake);
                    System.out.println("operazione completata,saldo attuale:" + conto2.getMoney());
                }


                break;
            case 3:
                System.out.println("Hai scelto uscire");
                break;
            default:
                System.out.println("Scelta non valida.");
        };









    }
}
