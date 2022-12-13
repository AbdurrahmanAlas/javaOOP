package OgrenciIsleri;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciMethod {

    static int ogrenciN = 1;
    static Scanner scan = new Scanner(System.in);

    public static void menu(ArrayList<Ogrenci> liste, ArrayList<OgrenciNot> notListe) {

        System.out.println("========= ÖĞRENCİ İŞLERİ PROGRAMI =============\n1: ÖĞRENCİ KAYDI\n2: ÖĞRENCİ LİSTELE\n3: "
                + "ÖĞRENCİ KAYIT SİLME\n4: NOT GİRİŞİ\n5: ÇIKIŞ");

        int secim = scan.nextInt();

        switch (secim) {

            case 1:
                ogrKayit(liste);
                break;
            case 2:
                ogrListele(liste);
                break;
            case 3:
                ogrSil(liste);
                break;
            case 4:
                notGirisi(liste, notListe);
                break;
            case 5:
                cikiş();
            default:
                break;


        }


    }

    private static void cikiş() {
    }

    private static void notGirisi(ArrayList<Ogrenci> liste, ArrayList<OgrenciNot> notListe) {

        OgrenciNot ogrenciNot = new OgrenciNot();
        System.out.println("Ogrenci numarası giriniz :");
        int no = scan.nextInt();
        for (Ogrenci ogrenci:liste) {
            if(no==ogrenci.getOgrNo()){

                System.out.println(ogrenci.getOgrName() + "nın notlarını giriniz");
                for (int i = 0; i < ogrenciNot.getDersAdi().size(); i++) {

                    System.out.println(ogrenciNot.getDersAdi().get(i) +" :");
                    int not=scan.nextInt();


                }
            } else
                System.out.println("öğrenci bulunamadı !!!");

        }

    }

    private static void ogrSil(ArrayList<Ogrenci> liste) {

        for(Ogrenci o:liste){

            System.out.println(o);
        }
        System.out.println("Silinecek ögrenci numarasını giriniz :");
        int no = scan.nextInt();

        for(Ogrenci s :liste){

            if(no==s.getOgrNo()){
                liste.remove(s);

                for(Ogrenci o :liste){
                    System.out.println(o);
                }
                menu(liste,null);
            }



        }
        System.out.println("Silinecek ogrenci no bulunamadı !");
        menu(liste,null);

    }

    private static void ogrListele(ArrayList<Ogrenci> liste) {

        System.out.println("--------TÜM ÖGRENCİ LİSTESİ --------");
        for(Ogrenci o : liste) {

            System.out.println(o);
        }
        menu(liste,null);



    }

    private static void ogrKayit(ArrayList<Ogrenci> liste) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Ögrencinin adını giriniz :");
        String ad=scan.nextLine();
        Ogrenci ogrenci=new Ogrenci(++ogrenciN,ad);
        liste.add(ogrenci);
        System.out.println(ogrenci.toString() + "eklendi");
        menu(liste,null);



    }


}
