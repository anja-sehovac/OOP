import java.util.Random;
import java.util.Scanner;

public class Main {
    public int drawNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner();
        int number = drawNumber();
        System.out.println("Number is "+ number);
        System.out.println("Guess a number: ");
        int guessedNumber = reader.nextInt();
        if (guessedNumber==number){
            System.out.println("You've guessed correctly!"):
        }
        else if (guessedNumber<number){
            System.out.println("Number is greater.");
        }
        else{
            System.out.println("Number is smaller.");
        }

    }


}