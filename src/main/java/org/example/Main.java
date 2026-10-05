package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int sayi) {
        if (sayi < 0) {
            sayi = sayi * -1;
        }
        String sayi2 = String.valueOf(sayi);
        int uzunluk = sayi2.length();
        for (int i = 0; i < uzunluk/2; i++) {
            if (sayi2.charAt(i) != sayi2.charAt(uzunluk - 1 - i)) {
                return false;
            }

        }
        return true;
    }
     public static boolean isPerfectNumber(int sayi){
        if(sayi < 0){
            return false;
        }
        int toplam = 0;
        for(int i=1 ; i< sayi ; i++){
            if(sayi % i == 0){
                toplam+=i;
            }
        }
        return toplam == sayi;
     }
     public static String numberToWords(int sayi){
        if(sayi < 0 ){
            return "Invalid Value";
        }
        String[] kelimeler = {
                "Zero",
                "One",
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "Nine"
        };
        String sayiString = String.valueOf(sayi);
        String sonuc = "";
        for(int i=0 ; i < sayiString.length() ; i++) {
            if(sonuc.isEmpty()){
                sonuc = sonuc + kelimeler[sayiString.charAt(i) - '0'];
            } else {
                sonuc = sonuc + " " + kelimeler[sayiString.charAt(i) - '0'];
            }
        }
        return sonuc;
     }
}
