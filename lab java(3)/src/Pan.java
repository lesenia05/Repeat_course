public class Pan extends Goods {
    private double volume;

    public Pan(String name,String material, double price, CategoryType categoryType, int volume) {
        super(name, material, price, categoryType);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Pan{" +
                "volume=" + volume +
                '}';
    }
}

