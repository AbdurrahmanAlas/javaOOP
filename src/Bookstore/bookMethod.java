package Bookstore;

import java.util.List;
import java.util.Scanner;

public class bookMethod {

    static Scanner scan = new Scanner(System.in);
    static int kitapNo = 1000;




    public static void  kitaplarEkle(List<Book> liste){


        Book book1=new Book(++kitapNo,"sefiller","victorhugo",1890,100);
        Book book2=new Book(++kitapNo,"seranad","felan",1999,220);
        Book book3=new Book(++kitapNo,"insan ne ile yasar","victor",3434,4444);

        liste.add(book1);
        liste.add(book2);
        liste.add(book3);








    }

    public static void menu(List<Book> liste) {

        System.out.println("========= KİTAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n3: " +
                "Tum kitaplari listele\n4: Bitir");


        System.out.println("Isleminizi seciniiz : ");
        int tercih = scan.nextInt();

        switch (tercih) {

            case 1:
                kitapEkle(liste);
                break;
            case 2:
                noIleSil(liste);
                break;
            case 3:
                listele(liste);
                break;
            case 4:
                bitir();
                break;
            default:
                System.out.println("yanlış giriş yapıldı tekrar deneyin");
                break;

        }


    }

    private static void bitir() {

        System.out.println("yine bekleriz");
    }

    private static void listele(List<Book> liste) {

        for (Book b : liste) {
            System.out.println(b.toString());
        }
        menu(liste);


    }

    private static void noIleSil(List<Book> liste) {

        System.out.println("Silinecek kitap no giriniz :");
        int silinecekNo = scan.nextInt();
        for (Book k : liste) {

            if (k.getNo() == silinecekNo) {

                liste.remove(k);
                menu(liste);
            }

        }
        System.out.println(silinecekNo + "ait kitap bulunamadı  !!!");
        menu(liste);


    }















    private static void kitapEkle(List<Book> liste) {


        System.out.println("Kitap ismi giriniz :");
        scan.nextLine(); //dummy kukla boş scan
        String bookName=scan.nextLine();
        System.out.println("Kitapın yazar ismi giriniz : ");
        String authorName=scan.nextLine();
        System.out.println("Yayin yilini giriniz :");
        int year= scan.nextInt();
        System.out.println("Fiyati giriniz ");
        double price=scan.nextDouble();

        Book book=new Book(++kitapNo,bookName,authorName,year,price); //kitap objesi create edildi.
        liste.add(book);
        System.out.println(book.toString() + "eklendi");
        menu(liste);


    }


}
