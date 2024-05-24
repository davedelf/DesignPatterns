package PatronesEstructurales.composite;

public class TestComposite {
    public static void main(String[] args) {
        BaseItem inventory=new Bag("inventory");
        BaseItem bagCoins=new Bag("bagCoins");
        BaseItem bagPotions=new Bag("bag potions");

        BaseItem coins=new Item("coins",3);
        bagCoins.add(coins);

        BaseItem magicPotion=new Item("Magic potion",3);
        BaseItem healthPotion=new Item("Health potion",8);
        bagPotions.add(magicPotion);
        bagPotions.add(healthPotion);

        BaseItem blade=new Item("blade",6);
        BaseItem shield=new Item("shield",4);
        BaseItem armor=new Item("armor",5);

        inventory.add(bagCoins);
        inventory.add(bagPotions);
        inventory.add(blade);
        inventory.add(shield);
        inventory.add(armor);


        System.out.println("Inventory total value: "+inventory.getValue());
    }


}
