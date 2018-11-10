public class Goods {
    private String name;
    private String material;
    private double price;
    private CategoryType categoryType;

    public Goods(String name, String material, double price, CategoryType categoryType) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.categoryType = categoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryType=" + categoryType +
                '}';
    }
}
