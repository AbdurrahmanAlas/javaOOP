package BTK_Course.classesWithAttribute;

public class Main {

    public static void main(String[] args) {

        Product product=new Product();
        product.setName("Laptop");
        product.set_id(1);
        product.setDescription("asus");
        product.setPrice(5000);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);



        System.out.println(product.getName());

        System.out.println(product.getKod());

    }







}
