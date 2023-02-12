public class Product {
    protected static int id = 0;
    protected final int productId;
    protected final String name;
    protected int price;
    protected int productCount;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.productCount = 0;
        id++; // Product.id++
        this.productId = id;
    }

    public int getProductId() {
        return productId;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + "(артикул:" + this.productId + "), цена: " +
                this.price + "руб/шт, кол-во: " + this.productCount + "шт.\n";
    }
}
