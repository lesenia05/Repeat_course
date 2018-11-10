public class Bath  extends Goods{
    private double volume;

    public Bath(String name, String material, double price, int length, int width, CategoryType categoryType, double volume) {
        super(name, material, price,length, width,categoryType);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bath{" +
                "volume=" + volume +
                '}';
    }
}
