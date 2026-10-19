import java.util.Random;

public class RollDice {
    public static void main(String [] args){
        int die1=0;
        int die2=1;
        int die3=2;
        int rollNum=0;
        int sum=0;
        Random rand = new Random();

        System.out.println("Roll:  Die1  Die2  Die3 Sum");
        System.out.println("---------------------------");

        while(die1 != die2 || die2 != die3){
            die1 = rand.nextInt(1,7);
            die2 = rand.nextInt(1,7);
            die3 = rand.nextInt(1,7);
            rollNum++;
            sum = die1+die2+die3;
            System.out.printf("Roll %-2d %3d %3d %3d %3d%n", rollNum, die1, die2, die3, sum);
        }
    }
}