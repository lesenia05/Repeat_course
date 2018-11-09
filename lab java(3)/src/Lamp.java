public class Lamp extends Goods{
    private int length;

    public Lamp (String name,String material, double price, CategoryType categoryType, int length) {
        super(name, material, price, categoryType);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Lamp{" +
                "length=" + length +
                '}';
    }
}