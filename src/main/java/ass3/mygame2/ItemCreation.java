package ass3.mygame2;

import java.util.ArrayList;

/**
 * Write a description of class ItemCreation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemCreation {

    private ArrayList<Item> allItemsInGame;

    public ItemCreation() {
        allItemsInGame = new ArrayList();
        createItems();
    }

    public void createItems() {

        Item excaliburSword, key, frontGateKey, flower, pillow;

        excaliburSword = new Item("excaliburSword", "The legendary Excalibur", 100);
        key = new Item("key", "It has a shape of a heart", 100);
        frontGateKey = new Item("frontGateKey", "To open the front gate door", 100);
        flower = new Item("flower", "Flowers for your beloved", 100);
        pillow = new Item("pillow", "pillows available for sleeping", 100);
       
        allItemsInGame.add(excaliburSword);
        allItemsInGame.add(key);
        allItemsInGame.add(frontGateKey);
        allItemsInGame.add(flower);
        allItemsInGame.add(pillow);
    }

    public Item getItem(String stringItem) {
        Item itemToReturn = null;
        for (Item item : allItemsInGame) {
            if (item.getName().contains(stringItem)) {
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }

}
