import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.LinkedList;
        import java.util.List;

public class ShopManager {

    private String name;
    private int workinghours;

    private List<Goods> availableGoods = new ArrayList<>();

    public List<Goods> findGoodsByMaterial(List<Goods> goods, String material) {
        List<Goods> result = new LinkedList<>();
        for (Goods good : goods) {
            if (good.getMaterial() == material) {
                result.add(good);
            }
        }
        return result;
    }

    public List<Goods> findGoodsByPrice(double price) {
        List<Goods> result = new LinkedList<>();
        for (Goods good : availableGoods) {
            if (good.getPrice() < price) {
                result.add(good);
            }
        }
        return result;
    }

    public void sortByLength(List<Goods> goods) {
        goods.sort(Comparator.comparing(Goods::getName));
    }

    public void sortByWidth(List<Goods> goods) {
        goods.sort(Comparator.comparing(Goods::getName));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }

    public List<Goods> getAvailableGoods() {
        return availableGoods;
    }
}
