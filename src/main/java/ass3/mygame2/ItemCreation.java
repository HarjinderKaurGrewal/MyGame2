/**
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 */
package ass3.mygame2;

import java.util.ArrayList;

/**
 * This class creates the items which are supposed to kept in the room and
 * picked up by the player in order to win the game
 *
 * The items are created and then all those items are made available to play in
 * the game
 *
 * @author harjinder and harshil
 * @version 02 June, 2021
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

    /**
     * Checks whether the item is present and then returns the name of the item
     * to the player
     *
     * @param stringItem
     * @return itemToReturn returns the name of the item currently in room.s
     */
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
