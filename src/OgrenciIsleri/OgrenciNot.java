package OgrenciIsleri;

import java.util.ArrayList;
import java.util.Arrays;

public class OgrenciNot  extends Ogrenci{

    private double ort;
    private ArrayList<String> dersAdi =new ArrayList<String>(

            Arrays.asList("1-Türkçe ", "2-Matematik ", "3-Fen ", "4-Sosyal "));

    private  ArrayList<Integer> dersNotu=new ArrayList<Integer>();

    public OgrenciNot() {
    }

    public OgrenciNot(int ogrNo, String ogrName, double ort, ArrayList<String> dersAdi, ArrayList<Integer> dersNotu) {
        super();
        this.ort = ort;
        this.dersAdi = dersAdi;
        this.dersNotu = dersNotu;
    }

    public double getOrt() {
        return ort;
    }

    public void setOrt(double ort) {
        this.ort = ort;
    }

    public ArrayList<String> getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(ArrayList<String> dersAdi) {
        this.dersAdi = dersAdi;
    }

    public ArrayList<Integer> getDersNotu() {
        return dersNotu;
    }

    public void setDersNotu(ArrayList<Integer> dersNotu) {
        this.dersNotu = dersNotu;
    }

    public OgrenciNot(int ogrNo, String ogrName) {
        super(ogrNo, ogrName);
    }
}
