public class Lamp extends Goods{
    private String type;

    public Lamp (String name, String material, double price,int length, int width, CategoryType categoryType, String type) {
        super(name, material, price,length,width, categoryType);
        this.type=type;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "type=" + type +
                '}';
    }
}