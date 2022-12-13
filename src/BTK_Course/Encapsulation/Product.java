package BTK_Course.Encapsulation;

public class Product {

    //attribute veya field
   private int _id;
   private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    public  Product(){

    }


    public Product(int _id, String name, String description, double price, int stockAmount, String kod) {
        this._id = _id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.kod = kod;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + _id;
    }


}
