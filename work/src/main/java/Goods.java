public class Goods {
    private String name;
    private String material;
    private double price;
    private int length;
    private int width;
    private CategoryType categoryType;


    public Goods(String name, String material, double price, int length, int width, CategoryType categoryType) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.length = length;
        this.width=width;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", width=" + width +
                ", categoryType=" + categoryType +
                '}';
    }
}



