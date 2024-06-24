package Part2.Task_12;

public class ProductType {
    private String typeName;

    public ProductType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public static final ProductType TYPE1 = new ProductType("Type 1");
    public static final ProductType TYPE2 = new ProductType("Type 2");
}
