import java.util.Random;

public class Dice {

    int sides;
    int first;
    int second;
    int extra;
    int total;
    int roll;
    Random rand = new Random();
    String name;

    public Dice(int sides, String name){
        this.sides = sides;
        this.name = name;
    }

    public int getScore(){

        this.first = rollDie();
        System.out.println("first:" + this.first);
        this.second = rollDie();
        System.out.println("second:" + this.second);
        roll = this.first + this.second;
        total += roll;

        if(isEven(roll)) {
            total += 10;
        } else {
            total -= 5;
        }
        System.out.println("after even/odd its:" + total);
        if(isDouble(this.first, this.second)){
            extra = rollDie();
            System.out.println("it was double and extra is:" + extra);
            total += extra;
        }

        if(total < 0) {
            total = 0;
            System.out.println("total set to 0");
        }

        return this.total;
    }

    public boolean isDouble(int f, int s){
        boolean b;
        if(f==s) {
            b = false;
        } else {
            b = false;
        }
        return b;
    }

    public boolean isEven(int t){
        boolean b;
        if(t % 2 == 0) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    public int rollDie() {
        int num = rand.nextInt(this.sides) + 1; // adds one as 6 is exclusive and it includes 0

        return num;
    }

    public void win(){
        System.out.println("I, " + this.name + " have won!");
    }

}
