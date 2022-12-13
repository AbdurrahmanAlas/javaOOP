package BTK_Course;

public class method2 {

    public static void main(String[] args) {

        String mesaj="Bugün hava cok guzel";
       String yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);

        String yenimesaj2=sehirver();

        System.out.println(yenimesaj2);

        int sayi3=topla(2,4);
        System.out.println(sayi3);

        int toplam=topla2(3,4,6,7,8);
        System.out.println(toplam );


    }

    public  static void ekle(){

        System.out.println("Eklendi");

    }

    public  static  void  sil(){

        System.out.println("Silindi");
    }

    public  static  void  guncelle(){

        System.out.println("güncellendi");
    }

    public  static  int topla(int sayi1,int sayi2){

        return  sayi1+sayi2;
    }


    public  static  String sehirver(){

        return "Kayseri";
    }


    public  static  int topla2(int... sayilar ) {

        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;

        }
        return toplam;

    }
}