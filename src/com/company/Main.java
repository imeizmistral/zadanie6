package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Wypisywanie();
        //Modulo();
        //Prostopadloscian();
        //parzystaczynie();
        //dodatniaczynie();
        //trzyliczby();
        //piecliczb();
        rok();
    }

    public static void Stozek() {
        System.out.println("Podaj promień podstawy stożka");
        Scanner ar = new Scanner(System.in);
        int r = ar.nextInt();
        System.out.println("Podaj wysokość stożka");
        Scanner ah = new Scanner(System.in);
        int h = ah.nextInt();

        float pi = 3.14f;
        double l = Math.sqrt((r * r) + (h * h));
        double polep = pi * r * r;
        double poleb = pi * r * l;
        double pole = polep + poleb;
        double obwod = 2 * pi * r;
        System.out.println("Pole podstawy to: " + polep);
        System.out.println("Pole stożka to: " + pole);
        System.out.println("Obwód stożka to: " + (obwod));
    }

    public static void Wypisywanie() {
        System.out.println("Podaj pierwszą liczbę");
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();
        System.out.println("Podaj drugą liczbę");
        Scanner liczba2 = new Scanner(System.in);
        int b = liczba2.nextInt();


        int roznica = Math.abs(a - b);
        int suma = a + b;
        int iloczyn = a * b;
        float iloraz = a / b;
        System.out.println("Suma to: " + suma);
        System.out.println("Różnica to: " + roznica);
        System.out.println("Iloczyn to: " + iloczyn);
        System.out.println("Iloraz to: " + iloraz);
    }

    public static void Modulo() {
        System.out.println("Podaj pierwszą liczbę");
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();
        System.out.println("Podaj drugą liczbę");
        Scanner liczba2 = new Scanner(System.in);
        int b = liczba2.nextInt();

        int calkowita = Math.round(a / b);
        int modulo = a % b;
        System.out.println("Część całkowita to: " + calkowita);
        System.out.println("Reszta z dzielenia to: " + modulo);

    }

    public static void Prostopadloscian() {
        System.out.println("Podaj pierwszą dlugosc");
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();
        System.out.println("Podaj drugą długość");
        Scanner liczba2 = new Scanner(System.in);
        int b = liczba2.nextInt();
        System.out.println("Podaj wysokość");
        Scanner liczba3 = new Scanner(System.in);
        int c = liczba3.nextInt();

        int objetosc = a * b * c;
        int pole = (2 * a * b) + (2 * a * c) + (2 * b * c);
        System.out.println("Objętość to: " + objetosc);
        System.out.println("Pole całkowite to: " + pole);
    }

    public static void parzystaczynie() {
        System.out.println("Wpisz liczbę");
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();

        if (a % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }
    }

    public static void dodatniaczynie() {
        System.out.println("Wpisz liczbę");
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();

        if (a < 0) {
            System.out.println("Liczba ujemna");
        } else if (a == 0) {
            System.out.println("Zerooo!!");
        } else {
            System.out.println("Liczba dodatnia");
        }
    }

    public static void trzyliczby() {
        System.out.println("Podaj pierwszą liczbę");
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();
        System.out.println("Podaj drugą liczbę");
        Scanner liczba2 = new Scanner(System.in);
        int b = liczba2.nextInt();
        System.out.println("Podaj trzecią liczbę");
        Scanner liczba3 = new Scanner(System.in);
        int c = liczba3.nextInt();

       if(a>b && a>c) {
           System.out.println("Największa liczba to :" + a);
       }
       else if (b>c){
           System.out.println("Największa liczba to :" + b);
        }
       else {
           System.out.println("Największa liczba to :" + c);
       }

        if(a<b && a<c) {
            System.out.println("Najmniejsza liczba to :" + a);
        }
        else if (b<c){
            System.out.println("Najmniejsza liczba to :" + b);
        }
        else {
            System.out.println("Najmniejsza liczba to :" + c);
        }

    }
    public static void piecliczb() {
        System.out.println("Podaj pierwszą liczbę");
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();
        System.out.println("Podaj drugą liczbę");
        Scanner liczba2 = new Scanner(System.in);
        int b = liczba2.nextInt();
        System.out.println("Podaj trzecią liczbę");
        Scanner liczba3 = new Scanner(System.in);
        int c = liczba3.nextInt();
        System.out.println("Podaj czwartą liczbę");
        Scanner liczba4 = new Scanner(System.in);
        int d = liczba4.nextInt();
        System.out.println("Podaj piątą liczbę");
        Scanner liczba5 = new Scanner(System.in);
        int e = liczba5.nextInt();

        if(a>b && a>c && a>d && a>e) {
            System.out.println("Największa liczba to :" + a);
        }
        else if ( b>c && b>d && b>e){
            System.out.println("Największa liczba to :" + b);
        }
        else if (c>d && c>e){
            System.out.println("Największa liczba to :" + c);
        }
        else if (d>e){
            System.out.println("Największa liczba to :" + d);
        }
        else {
            System.out.println("Największa liczba to :" + e);
        }

        if(a<b && a<c && a<d && a<e) {
            System.out.println("Najmniejsza liczba to :" + a);
        }
        else if ( b<c && b<d && b<e){
            System.out.println("Najmniejsza liczba to :" + b);
        }
        else if (c<d && c<e){
            System.out.println("Najmniejsza liczba to :" + c);
        }
        else if (d<e){
            System.out.println("Najmniejsza liczba to :" + d);
        }
        else {
            System.out.println("Najmniejsza liczba to :" + e);
        }

    }
    public static void rok(){
        System.out.println("Podaj rok");
        Scanner liczba1 = new Scanner(System.in);
        int a = liczba1.nextInt();

        if(((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)){
            System.out.println("Rok przestępny :" + a);
        }
        else{
            System.out.println("Rok nieprzestępny :" + a);
        }
    }
}