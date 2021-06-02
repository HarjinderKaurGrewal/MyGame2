package ass3.mygame2;

import java.util.ArrayList;

/**
 * You are a player in the zuul game. You have to play the game and collect all
 * items in order to win the game
 *
 * @author harjinder and harshil
 * @version 02 June, 2021
 */
public class Player {

    private ArrayList<Item> playerItem;

    /**
     *
     * @exception NullPointerException check throws a null pointer when your
     * inventory is empty
     * @see #printAllInventory You can see the items in your inventory
     */
    public Player() {
        playerItem = new ArrayList();
    }

    /**
     * This method adds the item in the inventory, removes from the current room
     * and print a message
     *
     * @param item
     *
     */
    public void addItemInventory(Item item) {
        playerItem.add(item);
        System.out.println(item.getName() + " was taken from the room");

    }

    /**
     * This method removes the item from the inventory and adds to the room and
     * print a message
     *
     * @param item
     */
    public void removeItemInventory(Item item) {
        playerItem.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");
    }

    /**
     * Checks the item is in the room or not and returns the name of the item to
     * the player
     *
     * @param stringItem
     * @return itemToReturn returns the name of the item
     */
    public Item getPlayerItem(String stringItem) {
        Item itemToReturn = null;
        for (Item item : playerItem) {
            if (item.getName().contains(stringItem)) {
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }

    /**
     * Print all the items in the inventory
     *
     * @return returnString returns the names of the items in the inventory
     */
    public String printAllInventory() {

        String returnString = "Items:";
        for (Item item : playerItem) {
            returnString += " " + item.getName();
        }
        return returnString;
    }

}
