public class Sofa extends Goods {
    private String type;


    public Sofa (String name, String material,int length,int width, double price, CategoryType categoryType, String type) {
        super(name, material,price,length, width, categoryType);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "type=" + type +
                '}';
    }
}
