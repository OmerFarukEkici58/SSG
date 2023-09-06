package ssg_dersler.doWhileLoop;

public class C01_doWhileLoop {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin
        int i=11;
        while (i<=10){
            System.out.print(i+" ");
        i++;}//ilk once kontrol sonra dongu
        System.out.println("\n**************************");
        i=11;
        do {
            System.out.print(i+" ");

            i++;}while (i<=10);
        //ilk once dongu sonra kontrol
    }
}
