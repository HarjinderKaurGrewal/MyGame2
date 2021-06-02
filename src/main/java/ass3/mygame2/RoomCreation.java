/**
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 * This class creates the room in the game
 * There are 5 rooms which makes the game complex where all the room
 * has exit gates
 *
 * The items are placed in the room in this class.
 *
 */
package ass3.mygame2;

import java.util.ArrayList;

/**
 *
 * @author harjinder and harshil
 * @version 02 June, 2021
 *
 * This class creates an Array list of rooms which are added in the game. This
 * class also creates object of ItemCreation class
 *
 *
 */
public class RoomCreation {

    private ArrayList<Room> allRoomInGame = new ArrayList();

    private ItemCreation itemCreation;

    /**
     *
     * This is a default constructor as it is called with no arguments
     *
     */
    public RoomCreation() {
        itemCreation = new ItemCreation();
        createRooms();
    }

    /**
     *
     * This method is a mutator This method is used to create rooms, setting
     * room exits, adding items in the room
     *
     */
    private void createRooms() {

        Room castle, kitchen, frontGate, bedroom, garden;

        castle = new Room("castle", "You are at the castle", false);
        kitchen = new Room("kitchen", "The kitchen door has a shape of a heart", false);
        frontGate = new Room("frontGate", "There is a giant ogre", true);
        bedroom = new Room("bedroom", "You are in the master bedroom", true);
        garden = new Room("garden", "You are in the garden area", true);

        castle.setExit("east", kitchen);
        castle.setExit("south", frontGate);
        castle.setExit("north", bedroom);
        frontGate.setExit("north", castle);
        bedroom.setExit("south", castle);
        bedroom.setExit("east", garden);
        garden.setExit("west", bedroom);
        garden.setExit("south", kitchen);
        kitchen.setExit("north", garden);
        kitchen.setExit("west", castle);

        castle.addItemInRoom(itemCreation.getItem("excaliburSword"));
        castle.addItemInRoom(itemCreation.getItem("key"));
        kitchen.addItemInRoom(itemCreation.getItem("frontGateKey"));
        bedroom.addItemInRoom(itemCreation.getItem("pillow"));
        garden.addItemInRoom(itemCreation.getItem("flower"));

        allRoomInGame.add(castle);
        allRoomInGame.add(frontGate);
        allRoomInGame.add(kitchen);
        allRoomInGame.add(bedroom);
        allRoomInGame.add(garden);

    }

    /**
     *
     * @param stringRoom
     * @return return the current position of the player (in which room the
     * player is currently located)
     * Checks the room is present or not
     * This method calls the current room name along with the items in the room
     * where the player is located
     */
    public Room getRoom(String stringRoom) {
        Room roomToReturn = null;
        for (Room room : allRoomInGame) {
            if (room.getName().contains(stringRoom)) {
                roomToReturn = room;
            }
        }
        return roomToReturn;
    }

}
