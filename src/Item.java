// Anoop and Adu
// Mr. Nichols
// Period 1
// The purpose of this class is to set the time that power saves and the Item name

public class Item {
    private String name;
    private int powerTimeSave;

    // Initializes the item name and the time the item saves
    public Item(String name, int timeSave) {
        this.name = name;
        powerTimeSave = timeSave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeSave() {
        return powerTimeSave;
    }

    public void setTimeSave(int timeSave) {
        this.powerTimeSave = timeSave;
    }
}