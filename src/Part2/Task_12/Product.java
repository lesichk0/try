package Part2.Task_12;

public class Product {
    private ProductType productType;
    private String name;
    public Product(ProductType type, String name) {
        this.productType = type;
        this.name = name;
    }

    public ProductType getType() {
        return productType;
    }

    public String getName() {
        return name;
    }
    // Додаткові методи...
}

