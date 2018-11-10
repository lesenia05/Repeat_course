public class Bath  extends Goods{
    private int length;
    private int width;
    private double volume;

    public Bath(String name, String material, double price, CategoryType categoryType, int length, int width, double volume) {
        super(name ,material, price, categoryType);
        this.length = length;
        this.width = width;
        this.volume = volume;
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Bath{" +
                "length=" + length +
                ", width=" + width +
                ", volume=" + volume +
                '}';
    }
}
