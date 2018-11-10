import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ShopManager shopManager = new ShopManager();
        shopManager.getAvailableGoods().add(new Bath("Bath1","ceramics",1000,200,150,CategoryType.PLUMBING,100));
        shopManager.getAvailableGoods().add(new Pan("Pan1","aluminum",200,20, 30,CategoryType.DISHES,5));
        shopManager.getAvailableGoods().add(new Sofa("Sofa1","suede",300,200,2000,CategoryType.FURNITURE,"folding"));
        shopManager.getAvailableGoods().add(new Lamp("Lamp1","glass",800,30,5,CategoryType.LIGHTING,"electro"));


        System.out.println("Menu: \n1. Show all available goods\n2. Show goods at a price\n3. Sort by length\n4. Sort by width\n5.Show goods at a material ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch(userChoice) {
            case 1:
                shopManager.getAvailableGoods().forEach((good) -> {
                    System.out.println(good.toString());
                });
                break;
            case 2:
                shopManager.findGoodsByPrice(shopManager.getAvailableGoods(),1000).forEach((good) -> {
                    System.out.println(good.toString());
                });
                break;
            case 3:
                shopManager.sortByLength(shopManager.getAvailableGoods());
                shopManager.getAvailableGoods().forEach((good) -> {
                    System.out.println(good.toString());
                });
                break;
            case 4:
                shopManager.sortByWidth(shopManager.getAvailableGoods());
                shopManager.getAvailableGoods().forEach((good) -> {
                    System.out.println(good.toString());
                });
            case 5:
                shopManager.findGoodsByMaterial(shopManager.getAvailableGoods(),"cast iron").forEach((good) -> {
                    System.out.println(good.toString());
                });
        }
    }
}
