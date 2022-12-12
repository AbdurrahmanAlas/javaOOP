package OgrenciIsleri;

public class Ogrenci {

    private int ogrNo;
    private String ogrName;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrNo=" + ogrNo +
                ", ogrName='" + ogrName + '\'' +
                '}';
    }

    public Ogrenci(){

    }
    public Ogrenci(int ogrNo, String ogrName) {
        super();
        this.ogrNo = ogrNo;
        this.ogrName = ogrName;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getOgrName() {
        return ogrName;
    }

    public void setOgrName(String ogrName) {
        this.ogrName = ogrName;
    }
}
