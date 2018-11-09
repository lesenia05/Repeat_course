import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ShopManager shopManager = new ShopManager();
        shopManager.getAvailableGoods().add(new Bath("Bath1","ceramics",1000,PLUMBING));
        shopManager.getAvailableGoods().add(new Pan("Pan1","aluminum",200,DISHES));
        shopManager.getAvailableGoods().add(new Sofa("Sofa1","suede",4000,FURNITURE));
        shopManager.getAvailableGoods().add(new Lamp("Lamp1","glass",90,LIGHTING));


        System.out.println("Menu: \n1. Show all available goods\n2. Show goods at a price\n3. Sort by length\n4. Sort by width\n5.Show goods at a material ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch(userChoice) {
            case 1:
                pharmacyManager.getAvailableGoods().forEach((good) -> {
                    System.out.println(good.toString());
                });
                break;
            case 2:
                pharmacyManager.findGoodsByPrice(50.0D).forEach((good) -> {
                    System.out.println(good.toString());
                });
                break;
            case 3:
                pharmacyManager.sortByLength(pharmacyManager.getAvailableGoods());
                pharmacyManager.getAvailableGoods().forEach((good) -> {
                    System.out.println(good.toString());
                });
                break;
            case 4:
                pharmacyManager.sortByWidth(pharmacyManager.getAvailableGoods());
                pharmacyManager.getAvailableGoods().forEach((good) -> {
                    System.out.println(good.toString());
                });
            case 5:
                pharmacyManager.findGoodsByMaterial(shopManager.getAvailableGoods(), Material"cast iron").forEach((good) -> {
                    System.out.println(good.toString());
                });
        }

    }
}
