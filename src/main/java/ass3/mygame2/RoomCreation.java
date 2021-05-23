package ass3.mygame2;


import java.util.ArrayList;

public class RoomCreation {

    private ArrayList<Room> allRoomInGame = new ArrayList();

    private ItemCreation itemCreation;

    public RoomCreation() {
        itemCreation = new ItemCreation();
        createRooms();
    }
    
    
    private void createRooms() {

        Room castle, kitchen, frontGate,bedroom, garden;

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
