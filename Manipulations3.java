package day09StringManipullations;

import java.util.Scanner;

public class Manipulations3 {
    public static void main(String[] args) {
        Scanner unit=new Scanner(System.in);
        System.out.println("Lutfen tam isminizi girin");
        String tamisim= unit.nextLine();
        System.out.println("Lutfen dogum yilinizi girin");
        String dogum= unit.next();
        System.out.println("isminizin ilk 2 harfiyle baslayan, soyisminizin son 2 harfiyle biten" +
                " ve icinde dogum tarihiniz olan bir parola olusturun");
        String psw=unit.next();
        String ilkiki=tamisim.substring(0,2);
        String soniki=tamisim.split(" ")[1].substring(0,2);
boolean first=psw.startsWith(ilkiki);
boolean second=psw.endsWith(soniki);
boolean third=psw.contains(dogum);
if (first&&second&&third){
    System.out.println("Parola gecerli");
} else {
    System.out.println("Lutfen kurallara uygun bir parola girin");
}



    }
}
