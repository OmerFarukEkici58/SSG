package ssg_dersler.doWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        //2. Örnek
        //Girilen tamsayının basamaklarının toplamını yazan program.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        do {
            sayi=Math.abs(sayi);
            toplam+=sayi%10;
            sayi/=10;

        }while (sayi>0);{
            System.out.println("basamaklarin toplami : "+toplam);
        }

    }
}
