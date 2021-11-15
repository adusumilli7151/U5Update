// Anoop and Adu
// Mr. Nichols
// Period 1
// The purpose of this class is to have a random chance to get a red or green mushroom and have a set speed for powerups


public class ItemGuess {

    /**
     * This method calculates the chance to get a red mushroom or a green mushroom or none
     * @return the random chance to get a different mushroom for a player to use in the race
     */
    public static int chooseItem() {
        boolean rMushroom = Math.random() < 0.5;
        boolean gMushroom = Math.random() < 0.5;

        int returnVar = 0;

        if(rMushroom){
            returnVar = 1;
        }
        else if(gMushroom){
            returnVar = 2;
        }


        return returnVar;
    }
}
