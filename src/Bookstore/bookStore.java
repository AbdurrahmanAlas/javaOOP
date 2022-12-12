package Bookstore;

import java.util.ArrayList;
import java.util.List;

public class bookStore {

    /*
	1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.
	2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.
	3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.
		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir
 */

    static List<Book> kitapliste=new ArrayList<>();

    public static void main(String[] args) {

        bookMethod.kitaplarEkle(kitapliste);

        Book manuelKitap = new Book();
        manuelKitap.setBookName("manuel giris javaCan");
        manuelKitap.setNo(1003);
        manuelKitap.setYear(2010);
        manuelKitap.setAuthorName("hasan fidan");
        manuelKitap.setPrice(123);

        kitapliste.add(manuelKitap);
        bookMethod.menu(kitapliste);


    }



}
