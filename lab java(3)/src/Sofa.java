public class Sofa extends Goods {
    private int length;
    private int width;

    public Sofa (String name, String material, double price, CategoryType categoryType, int length, int width) {
        super(name, material,price, categoryType);
        this.length = length;
        this.width = width;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "Sofa{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
