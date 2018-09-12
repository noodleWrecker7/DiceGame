public class DiceGame {

    static boolean undecided;
    static Dice player1 = new Dice(6, "number one");
    static Dice player2 = new Dice(6, "number two");

public static void main(String[] args) {
    Authorise(); // should probably move player declarations into this method



    for(int i = 0; i < 5; i++){
        System.out.println(player1.getScore());
        System.out.println(player2.getScore());
    }


    calculateWinner(player1.total, player2.total);

    System.out.println(player1.total);
    System.out.println(player2.total);
}


public static void Authorise() {
    // idk what this is yet
}


public static void calculateWinner(int p1, int p2){
    /*if(player1.total == player2.total){
        undecided = true;
        decider();
    }*/


    if(p1 < p2) {
        player2.win();
    } else { if(p1 > p2) {
        player1.win();
    }
    } if(p1 == p2) {
        System.out.println("scores are equal");
        decider();
    }

}

public static void decider(){
        calculateWinner(player1.rollDie(), player2.rollDie());
}

}
