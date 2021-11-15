// Anoop and Adu
// Mr. Nichols
// Period 1
// Initiates a race between player one and player two


public class RaceDriver {

    public static void main(String[] args) {
        Item redMushroom = new Item("Red Mushroom", 15);
        Item greenMushroom = new Item("Green Mushroom", 10);

        Combo LightningMcQueen = new Combo("Lightning Mcqueen", "Lightning", 15, redMushroom);
        Combo ChickHicks = new Combo("Chick Hicks", "Sports Car", 10, greenMushroom);

        System.out.println(CalcAvgSpeed(LightningMcQueen, ChickHicks));
        System.out.println(LightningMcQueen);
        System.out.println(ChickHicks);

        RaceDriver.race(LightningMcQueen, ChickHicks);




    }

    /**
     * This method calculates the average speed of the two racers
     * @param p1 first racer that has their speed accessed
     * @param p2 second racer that has their speed accessed
     * @return the average speed of p1 and p2
     */
    public static String CalcAvgSpeed(Combo p1, Combo p2){
        double avg = (p1.getSpeed() + p2.getSpeed()) /2.0;
        return "The average speed of the racers is " + avg;
    }

    /**
     * This method initiates a race between two racers
     * @param p1 first player in the race
     * @param p2 second player in the race
     */
    public static void race(Combo p1, Combo p2) {
        int lapTimeP1 = (1000 / p1.getSpeed());
        int lapTimeP2 = (1000 / p2.getSpeed());
        int winP1 = 0;
        int winP2 = 0;
        int tieP1P2 = 0;

        while (lapTimeP1 > 0 || lapTimeP2 > 0) {


            if (lapTimeP1 > 0) {
                lapTimeP1 -= p1.getMushroom().getTimeSave();
                if (lapTimeP1 <= 0) {
                    System.out.println("Racer 1 has used his Mushroom!");
                    System.out.println("Time Left for P1: 0");


                } else {
                    System.out.println("Racer 1 has used his Mushroom!");
                    System.out.println("Time Left for P1: " + lapTimeP1);
                }
            }
            if (lapTimeP2 > 0) {
                lapTimeP2 -= p2.getMushroom().getTimeSave();
                if (lapTimeP2 <= 0) {
                    System.out.println("Racer 2 has used his Mushroom!");
                    System.out.println("Time Left for P2: 0");
                } else if (lapTimeP1 > 0){
                    System.out.println("Racer 2 has used his Mushroom!");
                    System.out.println("Time Left for P2: " + lapTimeP2);
                }

            }
            if (lapTimeP1 <= 0 && lapTimeP2 <= 0) {
                tieP1P2 = 1;
            }
            if (lapTimeP1 <= 0 && lapTimeP2 > 0) {
                winP1 = 1;
            }
            if (lapTimeP2 <= 0 && lapTimeP1 > 0) {
                winP2 = 1;
            }
            if (winP1 == 1){
                System.out.println("Racer 1 has won the race!");
                break;
            }
            if (winP2 == 1){
                System.out.println("Racer 2 has won the race!");
                break;
            }
            if (tieP1P2 == 1){
                System.out.println("There is a tie!");
                break;
            }


        }
    }
}






