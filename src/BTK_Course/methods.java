package BTK_Course;

public class methods {

    public static void main(String[] args) {

        sayiBulmaca();

    }

    public static void sayiBulmaca() {

        int[] sayilar = new int[]{1, 2, 3, 7, 9, 0};
        int aranaca = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranaca) {

                varMi = true;
                break;
            }

        }
        if (varMi) {
            System.out.println("sayı mevcut" +aranaca);
        } else {
            System.out.println("sayi mevcut degil"+aranaca);
        }
    }

}