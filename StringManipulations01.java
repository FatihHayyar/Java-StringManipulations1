package day09StringManipullations;

public class StringManipulations01 {
    public static void main(String[] args) {
//        String str="java is easy";
//       int a= str.indexOf("a");
//        System.out.println("a = " + a);
//        //indexof metodu verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
//int b=str.lastIndexOf("a");
//        System.out.println("b = " + b);
        //lastindexof metodu verilen karakter veya karakterlerin son gorunumunun indexini verir.

        //Example 1: Bir String'deki bir character'in
        // tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz

//        String cumle= "Galatasaray kazandi ";
//       int a=cumle.indexOf("a");
//       int b=cumle.lastIndexOf("a");
//        System.out.println(a==b ? "tekrarsiz":"tekrarli");
//        int c=cumle.indexOf('a',5);//5 ten sonraki ilk a ynin indexini yazar
//        System.out.println("c = " + c);
//
String st="Java is java.";
boolean a=st.isEmpty();
        System.out.println("a = " + a);
// isEmty() metodu bir string in bos olup olmadigini kontrol eder.
// EGer string de hic karakter yoksa true return eder.
        boolean b=st.isBlank();
        System.out.println("b = " + b);
        // isBlank hem bos hemde sadece space icin dogru olur.
        //example
        //kullanicidan alinan isim space den fsrkli en az bir karakter icermeli



    }
}
