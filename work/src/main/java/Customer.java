
public class Customer {
    private String necessaryGoods;
    private int availableMoney;

    public void buyGoods() {
    }

    public Customer(String necessaryGoods, int availableMoney) {
        this.necessaryGoods = necessaryGoods;
        this.availableMoney = availableMoney;
    }

    public String getNecessaryGoods() {
        return this.necessaryGoods;
    }

    public void setNecessaryGoods(String necessaryGoods) {
        this.necessaryGoods = necessaryGoods;
    }

    public int getAvailableMoney() {
        return this.availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "necessaryGoods='" + necessaryGoods + '\'' +
                ", availableMoney=" + availableMoney +
                '}';
    }
}
