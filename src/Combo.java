// Anoop and Adu
// Mr. Nichols
// Period 1
// The purpose of this class is to allow instantiating a new object in the driver class that is as one racer in the race

    public class Combo {
        private String player;
        private String cart;
        private int speed;
        private Item mushroom;
        private static int totalRacers = getTotalRacers();
        private static int totalSpeed = getTotalSpeed();



        // Purpose of constructor is to initialize the instance variables
        public Combo(String player, String cart, int speed, Item aMushroom) {
            this.player = player;
            this.cart = cart;
            this.speed = speed;
            this.mushroom = aMushroom;
        }




        /**
         * This method converts the variables from Combo class and ItemGuess class into String format
         * @return the string output of a new Combo and its attributes
         */
        public String toString() {
            String output = "";
            output += "Character's Name:\t" + player + "\n";
            output += "Character's Cart:\t" + cart + "\n";
            output += "Speed:\t\t\t" + "\t" + getSpeed() + "\n";
            if(ItemGuess.chooseItem() == 1){
                output += "Character's Items: " + mushroom.getName() +"\n";
            }
            else if(ItemGuess.chooseItem() == 2){
                output += "Character's Item: " + mushroom.getName() + "\n";
            }
            else if(ItemGuess.chooseItem() == 0){
                output += "No Character PowerUp!\n";
            }

            return output;
        }


        public static int getTotalRacers() {
            return totalRacers;
        }

        public static void setTotalRacers(int totalRacers) {
            Combo.totalRacers = totalRacers;
        }

        public static int getTotalSpeed() {
            return totalSpeed;
        }

        public static void setTotalSpeed(int totalSpeed) {
            Combo.totalSpeed = totalSpeed;
        }

        public String getPlayer() {
            return player;
        }

        public void setPlayer(String player) {
            this.player = player;
        }

        public String getCart() {
            return cart;
        }

        public void setCart(String cart) {
            this.cart = cart;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public Item getMushroom() {
            return mushroom;
        }

        public void setMushroom(Item mushroom) {
            this.mushroom = mushroom;
        }





    }

