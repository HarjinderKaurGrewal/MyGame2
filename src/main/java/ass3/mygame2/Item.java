package ass3.mygame2;

/**
 *
 * @author harjinder and harshil
 * @version 02 June, 2021
 *
 */
public class Item {

    private String description;
    private String name;
    private int destructivePower;
    private double healingPower;

    public Item(String name, String description, int destructivePower) {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
    }

    public Item(String name, String description, double healingPower) {
        this.name = name;
        this.description = description;
        this.healingPower = healingPower;
    }

    /**
     * This method is an accessor as it is returning a String
     *
     * @return name returns the name of the Item
     */
    public String getName() {
        return name;
    }

    /**
     * This method is an accessor as it is returning a String
     *
     * @return description returns the description of the item
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method is an accessor
     *
     * @return destructivePower
     */
    public int getPower() {
        return destructivePower;
    }
}
