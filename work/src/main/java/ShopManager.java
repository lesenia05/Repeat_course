import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ShopManager {

    private String name;
    private int workinghours;

    private List<Goods> availableGoods = new ArrayList<>();

    public List<Goods> findGoodsByMaterial(List<Goods> availableGoods, String material) {
        List<Goods> result = new LinkedList<>();
        for (Goods good : availableGoods) {
            if (good.getMaterial() == material) {
                result.add(good);
            }
        }
        return result;
    }

    public List<Goods> findGoodsByPrice(List<Goods> list, double price) {
        List<Goods> result = new LinkedList<>();
        for (Goods good : availableGoods ) {
            if (good.getPrice() < price) {
                result.add(good);
            }
        }
        return result;
    }

    public void sortByLength(List<Goods> availableGoods) {
        availableGoods.sort(Comparator.comparing(Goods::getLength));
    }

    public void sortByWidth(List<Goods> availableGoods) {
        availableGoods.sort(Comparator.comparing(Goods::getWidth));
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
