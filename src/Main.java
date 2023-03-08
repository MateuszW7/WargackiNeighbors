public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to NEIGHBORS!!");
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        for(int i = 0; i<25;i++){
            int diceRoll = Counter.roll1d10();
            System.out.println("The dice rolls " + diceRoll + "!");
            System.out.println("PLAYER 1:");
            player1.placeValue(diceRoll);
            System.out.println("PLAYER 2:");
            player2.placeValue(diceRoll);
            System.out.println("PLAYER 3:");
            player3.placeValue(diceRoll);
        }
        player1.setTotalScore(Counter.totalCount(player1.getGrid()));
        player2.setTotalScore(Counter.totalCount(player2.getGrid()));
        player3.setTotalScore(Counter.totalCount(player3.getGrid()));

        System.out.println("Player 1 has a total score of" + player1.getTotalScore());
        System.out.println("Player 2 has a total score of" + player2.getTotalScore());
        System.out.println("Player 3 has a total score of" + player3.getTotalScore());



        if(player1.getTotalScore()< player2.getTotalScore()){
            if(player3.getTotalScore()< player2.getTotalScore()){
                System.out.println("Player 2 Wins!");
            } else{
                System.out.println("Player 3 Wins!");
            }
        }else{
            if(player3.getTotalScore()< player1.getTotalScore()){
                System.out.println("Player 1 Wins!");
            } else{
                System.out.println("Player 3 Wins!");
            }
        }

    }
}
